package co.micol.prj.member.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.vo.MemberVO;
import co.micol.prj.util.PasswordEncrypt;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberDAO;
	
	@Autowired
	private PasswordEncrypt pEnctypt;
	
	@RequestMapping("/memberSelectList.do")
	public String memberSelectList(Model model) {
		model.addAttribute("members", memberDAO.memberSelectList());
		
		return "member/memberSelectList";
	}
	
	@RequestMapping("/memberJoinForm.do")
	public String memberJoinForm() {
		
		return "member/memberJoinForm";
	}
	
	// form에서 post방식만 사용가능 get으로 하면 오류남
	@PostMapping("/memberJoin.do")
	public String memberJoin(MemberVO vo) {
		vo.setPassword(pEnctypt.pe(vo.getPassword())); // 패스워드를 암호화 함
		memberDAO.memberInsert(vo);
		
		//*.do로 돌리고싶으면(직접 실행 구문을 호출할 때) redirect를 쓴다.
		return "redirect:memberSelectList.do";
	}
	
	@RequestMapping("/memberLoginForm.do")
	public String memberLoginForm() {
		return "member/memberLoginForm";
	}
	
	@PostMapping("/memberLogin.do")
	public String memberLogin(MemberVO vo, Model model, HttpSession session) {
		vo.setPassword(pEnctypt.pe(vo.getPassword()));
		vo = memberDAO.memberSelect(vo);
		if(vo != null) {
			session.setAttribute("id", vo.getId());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("name", vo.getName());
			model.addAttribute("message", vo.getName() + "님 환영합니다.");
		} else {
			model.addAttribute("message", "아이디 또는 패스워드가 일치하지 않습니다.");
		}
		return "member/memberLoginMessage";
	}

	@RequestMapping("/memberLogout.do")
	public String memberLogout(HttpSession session, Model model) {
		model.addAttribute("message", session.getAttribute("name") + "님 정상 로그아웃 되었습니다.");
		session.invalidate();
		
		return "member/memberMessage";
	}
	
	@RequestMapping(value="/ajaxIdCheck.do", produces="application/text;charset=utf-8")
	//@ResponseBody // ajax 사용 시 호출된 페이지로 결과를 돌려주는 어노테이션
	public @ResponseBody String ajaxIdCheck(MemberVO vo) {
		String str = null;
		vo = memberDAO.memberSelect(vo);
		if(vo != null) {
			str = "Yes";
		} else {
			str = "No";
		}
		return str;
	}
	
//	암호화를 알아보는 함수
//	@RequestMapping("/passwordEncrypt.do")
//	public String passwordEncrypt(Model model) {
//		MessageDigest md; // 다이제스트 함수 => 평문을 줄여주는 함수
//		String password = "1234";
//		try {
//			md = MessageDigest.getInstance("SHA-256");
//			md.update(password.getBytes());
//			System.out.println(String.format("%064x", new BigInteger(1, md.digest())));
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
//		
//		return "member/passwordEncrypt";
//	}
}
