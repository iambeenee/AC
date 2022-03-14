package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSearch implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		// 한건조회
		MemberService memberDAO = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId("park@abc.com");
		vo = memberDAO.selectMember(vo);
		if(vo != null) {
			request.setAttribute("member", vo);
			return "member/memberSearch";
		} else {
			request.setAttribute("message", "존재하지 않거나 탈퇴한 회원입니다.");
			return "member/memberError";
		}
	}

}
