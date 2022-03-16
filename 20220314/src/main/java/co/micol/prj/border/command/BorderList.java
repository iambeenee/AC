package co.micol.prj.border.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.border.service.BorderService;
import co.micol.prj.border.serviceImpl.BorderServiceImpl;
import co.micol.prj.comm.Command;

public class BorderList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		BorderService borderDAO = new BorderServiceImpl();
		request.setAttribute("borders", borderDAO.borderSelectList());
		return "border/borderList";
	}

}
