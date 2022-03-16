package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class AjaxMemberIdCheck implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		// Ajax로 로그인 중복 체크
		MemberService memberDAO = new MemberServiceImpl();
		String str = request.getParameter("str");
		boolean b = memberDAO.isIdCheck(str);
		String result;
		if(!b) {
			result = "ajax:0"; // false -> 이미 존재하는 아이디
		} else {
			result = "ajax:1"; // true -> 사용가능한 아이디
		}
		return result;
	}

}
