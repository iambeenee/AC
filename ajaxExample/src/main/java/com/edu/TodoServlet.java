package com.edu;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.dao.TodoDAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/TodoServlet.do")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TodoDAO dao = new TodoDAO();
		List<Map<String, String>> map = dao.todoList();
		Gson gson = new GsonBuilder().create();

		response.getWriter().print(gson.toJson(map));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String content = request.getParameter("doContent");

		TodoDAO dao = new TodoDAO();
		dao.insertTodo(content);
		
		response.getWriter().print("{\"con\":"+content+"}");
	}

}
