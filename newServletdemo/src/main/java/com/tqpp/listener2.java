package com.tqpp;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;




@WebListener
public class listener2 implements HttpSessionListener {
private int activecount=0;
private int totalcount=0;
    
    @Override
	public void sessionCreated(HttpSessionEvent se) {
		activecount++;
		totalcount++;
		HttpSession ses=se.getSession();
		ServletContext ctx=ses.getServletContext();
		ctx.setAttribute("activeuser",activecount);
		ctx.setAttribute("totalusers", totalcount);
		System.out.println("listener2 executed session created");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) 
	{
		activecount--;
		HttpSession ses=se.getSession();
		ServletContext ctx=ses.getServletContext();
		ctx.setAttribute("activeuser",activecount);
	}
    
    
    
	
}
