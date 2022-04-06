package co.micol.prj.notice.web;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.vo.NoticeVO;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeDAO;

	@Autowired
	private String saveDir;

	@RequestMapping("/noticeList.do")
	public String noticeList(Model model, NoticeVO vo) {
		// 페이징 구문을 집어넣어야한다
		model.addAttribute("notices", noticeDAO.selectNoticeList(vo));

		return "notice/noticeList";
	}

	@RequestMapping("/noticeInputForm.do")
	public String noticeInputForm() {

		return "notice/noticeInputForm";
	}

	@RequestMapping("/noticeInsert.do")
	public String noticeInsert(NoticeVO vo, MultipartFile file) { // 파일이 여러개면 배열로

		if (file.isEmpty()) { // 파일이 비어 있으면 true
			noticeDAO.insertNotice(vo);
		} else {			// 파일이 존재하면
			String originalFileName = file.getOriginalFilename();
			String saveFileName = UUID.randomUUID().toString() + originalFileName.substring(originalFileName.lastIndexOf('.'));
			
			try {
				file.transferTo(new File(saveDir, saveFileName));
				// 이곳에서 DB저장하면 됨
				saveFileName = saveDir + saveFileName; // 저장된 물리경로를 포함
				
				vo.setFilename(originalFileName);
				vo.setUuidfile(saveFileName);
				noticeDAO.insertNotice(vo);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}

		return "redirect:noticeList.do";
	}
}
