package com.tqpp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//DTD,XML,XSD
//Servlet init,service,destroy
//Context/Config
//RequestDispatcher/sendredirect
//setAttribute/get
//Session Cookie,

@WebServlet("/http1")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

     //filter and listener
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses=request.getSession();
		
		ses.invalidate();
		System.out.println(ses.getId());
		//first it will create a new session on server
		//in response it will add cookie("jsessionid",jsessionidd);
		
			 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

//dbase
//Student table (sid,sname,qualification,placed)
//html