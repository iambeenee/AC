package co.micol.prj.border.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.border.service.BorderService;
import co.micol.prj.border.service.BorderVO;
import co.micol.prj.border.serviceImpl.BorderServiceImpl;
import co.micol.prj.comm.Command;

public class BorderInsert implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		BorderService borderDAO = new BorderServiceImpl();
		BorderVO vo = new BorderVO();
		vo.setBorderWriter(request.getParameter("borderWriter"));
		vo.setBorderDate(Date.valueOf(request.getParameter("borderDate")));
		vo.setBorderTitle(request.getParameter("borderTitle"));
		vo.setBorderContents(request.getParameter("borderContents"));
		int n = borderDAO.borderInsert(vo);
		if(n != 0) {
			return "borderList.do";
		} else {
			request.setAttribute("message", "게시글 등록이 실패했다.");
			return "border/borderError";
		}
	}

}
