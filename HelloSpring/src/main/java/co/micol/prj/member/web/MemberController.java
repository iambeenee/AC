package co.micol.prj.member.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.micol.prj.member.service.MemberVO;

@Controller
public class MemberController {
	
	@Autowired // "IoC에 있는 class를 갖다주세요."라는 명령어
	private DataSource dataSource;
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	@RequestMapping("/memberSelectList.do")
	public String memberSelectList(Model model, MemberVO vo, @RequestParam("pp") String pp) {
		System.out.println(vo.getId() + "====" + vo.getName() + "====" + vo.getPassword());
		System.out.println(pp);
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			conn = dataSource.getConnection();
			if(conn != null) {
				psmt = conn.prepareStatement("SELECT * FROM MEMBER");
				rs = psmt.executeQuery();
				while(rs.next()) {
					vo = new MemberVO();
					vo.setId(rs.getString("id"));
					vo.setName(rs.getString("name"));
					vo.setPassword(rs.getString("password"));
					list.add(vo);
				}
				model.addAttribute("members", list); // 돌려줄 페이지에 결과를 실어 보내는 객체
				model.addAttribute("message", "멤버리스트 입니다.");
			} else {
				System.out.println("DB 연결 실패!!!!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "member/memberSelectList";
	}
	
	
}
