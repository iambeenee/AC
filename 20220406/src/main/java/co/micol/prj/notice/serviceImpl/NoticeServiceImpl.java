package co.micol.prj.notice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.micol.prj.notice.service.NoticeMapper;
import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.vo.NoticeVO;

@Repository("noticeDAO")
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper map;

	@Override
	public List<NoticeVO> selectNoticeList(NoticeVO vo) {
		return map.selectNoticeList(vo);
	}

	@Override
	public NoticeVO selectNotice(NoticeVO vo) {
		return map.selectNotice(vo);
	}

	@Override
	public int insertNotice(NoticeVO vo) {
		return map.insertNotice(vo);
	}

	@Override
	public int deleteNotice(NoticeVO vo) {
		return map.deleteNotice(vo);
	}

	@Override
	public int updateNotice(NoticeVO vo) {
		return map.updateNotice(vo);
	}

}
