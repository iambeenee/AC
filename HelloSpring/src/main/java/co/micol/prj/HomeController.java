package co.micol.prj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//	@RequestMapping(value = "/", method = RequestMethod.GET) // 요즘은 잘 쓰지않는 방식 => @GetMapping("요청")
//	public String home(Model model) {
//		
//		return "home/home";
//	}
	
	@RequestMapping(value = "/") // 요즘은 잘 쓰지않는 방식 => @GetMapping("요청")
	public String home(Model model) {
		
		return "home/home";
	}
	
	@RequestMapping("/home.do") //get.post 모두 => 주로 비어있는 홈페이지를 호출할 때 이용
	public String home() {
		return "home/home";
	}
}
