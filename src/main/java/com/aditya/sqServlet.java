package com.aditya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class sqServlet extends HttpServlet {
	 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		 
		 
		 int k = (int)req.getAttribute("k");
		 PrintWriter out = res.getWriter();
		 out.println("Calling from servlet2");
	 }
}
