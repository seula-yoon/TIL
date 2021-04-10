package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.Member;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext cont;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		/*
		 * 1. ���� �޾Ƽ�
		 * 2. ���� ������ vo��ü ����
		 * 3. ServletContext���� �޾Ƽ� vo��ü�� ���ε�
		 * 4.������ �̵�...�� ������ϱ� a�±׷� �̵�
		 * 
		 */
		//1.
		String name = request.getParameter("name");
	    int age = Integer.parseInt(request.getParameter("age"));
	    String address = request.getParameter("address");
	    
	    //2.
	    Member vo = new Member(name, age , address);
	    
	    //3.
	    cont = getServletContext();
	    cont.setAttribute("vo", vo);
	    
	    //4.
	    out.println("<a href=result.jsp>��� Ȯ���Ϸ� ����</a>");
	    out.close();
	
	}
}