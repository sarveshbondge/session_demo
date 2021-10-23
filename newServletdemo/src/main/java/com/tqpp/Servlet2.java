package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;




/*@WebServlet(urlPatterns= {"/hi","/hello"},
initParams= {@WebInitParam(name="email",value="deepa@gmail.com")},loadOnStartup = 1)*/
public class Servlet2 extends HttpServlet
{

	
	public Servlet2() {
		//System.out.println(this);
		System.out.println("in servlet2 constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession ses1=req.getSession();
		HttpSession ses=req.getSession(false);
		
		if(ses==null)
		{
			resp.sendRedirect("login.html");
		}
		
		ses.setAttribute("item", "pasta");
		out.print("Welcome Second"+req.getParameter("fname"));
		ArrayList itemlist=(ArrayList) req.getAttribute("items");
		System.out.println(itemlist);
		
		
		ServletContext ctx = getServletContext();
		String data = ctx.getInitParameter("url");
		ServletConfig cfg=getServletConfig();
		String e=cfg.getInitParameter("email");
		String u=cfg.getInitParameter("mobile");
		
		out.println("Data context" + data);
		out.println("hi Data config" + u);
		out.println("hi Data config email" + e);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	
}
//javax.servlet.
//javax.servlet.http.