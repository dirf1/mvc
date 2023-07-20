package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.repository.ClassInfoRepository;

public class classInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClassInfoRepository ciRepo = new ClassInfoRepository();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Map<String, String>> classInfoList = ciRepo.selectClassInfoList();
		request.getAttribute("classInfoList",classInfoList);
		String path = "/WEB-INF/views/classInfo/class-info.jsp";
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<<head>>");
		out.println("</head>");
		out.println("<body>");
		out.println("안녕");
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
