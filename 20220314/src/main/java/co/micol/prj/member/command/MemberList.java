package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		MemberService memberDAO = new MemberServiceImpl();
		request.setAttribute("members", memberDAO.selectMemberList());
		return "member/memberList";
	}

}
