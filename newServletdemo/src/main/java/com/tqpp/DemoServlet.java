package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class DemoServlet extends HttpServlet {

	public DemoServlet() {
		System.out.println("hi in default cons of servlet1");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		HttpSession ses=request.getSession();
		PrintWriter out=response.getWriter();
		ServletContext ctx=getServletContext();
		int i=(int) ctx.getAttribute("activeuser");
		out.println("<html><body>");
		out.println("<h1>hi Welcome to DemoServlet demo</h1>");
		out.println("Active count "+i);
		out.println("</body></html>");
		
	    //System.out.println(ses.getId());
		
		/*
		 * ses.setMaxInactiveInterval(60*60); PrintWriter out = response.getWriter();
		 * String method = request.getMethod(); String username =
		 * request.getParameter("fname"); String passwd = request.getParameter("pass");
		 * 
		 * 
		 * Cookie c=new Cookie("uname",username); c.setMaxAge(3600);
		 * response.addCookie(c);
		 * 
		 * //to extract data ServletContext ctx = getServletContext();
		 * ctx.setAttribute("nm","Priya"); ServletConfig cfg=getServletConfig();
		 * //req,context,session String data = ctx.getInitParameter("url"); String
		 * u=cfg.getInitParameter("user"); out.print("Data context" + data);
		 * out.print("Data congfig" + u);
		 * 
		 * 
		 * 
		 * ArrayList<String> al = new ArrayList<>();
		 * 
		 * al.add("laptop"); al.add("iphone"); al.add("tab");
		 * 
		 * request.setAttribute("items", al);
		 */
		// Servletcontext/ServletConfig/seessiom

		/*
		 * if(username.equals("admin") && passwd.equals("123")) {
		 * 
		 * RequestDispatcher rd=request.getRequestDispatcher("riya");
		 * rd.forward(request, response);
		 * 
		 * 
		 * response.sendRedirect("riya"); } else {
		 * out.println("Wrong username and password"); RequestDispatcher
		 * rd=request.getRequestDispatcher("index.html"); rd.include(request, response);
		 * }
		 */

	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req,resp);
		
	}
}
