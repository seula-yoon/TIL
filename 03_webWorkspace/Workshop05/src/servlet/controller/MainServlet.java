package servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SerachMemberServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MainServlet() {
   
    }
    public void init() throws ServletException {
    	System.out.println("1. ServletContext Address ::" + getServletContext());
    	//getServletContext().setAttribute("list", list);
    	System.out.println("ServletContext�� ��ǰ�������� �ϳ��� ������ ���Դϴ�...List ���ε� OK");
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("name");
		 int price = Integer.parseInt(request.getParameter("price"));
		 String desc = request.getParameter("desc");
		 
		 //productVO pvo = new ProductVO
	
	}
   

}
