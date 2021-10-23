package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;

//@WebFilter("/login")
public class myfilter implements Filter {

   
    public myfilter() {
        System.out.println("in filter 1");
    }

	
	

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//preprocessing
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		System.out.println("in preprocessing");
		String nm=request.getParameter("fname");
		String pass=request.getParameter("pass");
		if(nm.equals("deepa") && pass.equals("123"))
		{
		chain.doFilter(request, response);
		pw.println("Filter called at postprocessing");
		}
		else
		{
		 pw.println("Invalid username and password!!!");
		 RequestDispatcher rd=request.getRequestDispatcher("index.html");
		  rd.include(request, response);
		}
		System.out.println("post process");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	
public void destroy() {
		
	}
}
