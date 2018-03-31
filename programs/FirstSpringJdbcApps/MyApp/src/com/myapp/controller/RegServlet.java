package com.myapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.dao.RegDao;
import com.myapp.model.RegBO;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// reading client entered data
		String uname=request.getParameter("uname");
		String pass=request.getParameter("password");
		String email=request.getParameter("email");
		String mobileNumber=request.getParameter("mobile");
		System.out.println("mobileNumber:::"+mobileNumber);
		Integer mobile=0;
		if(!(mobileNumber.isEmpty())){
		
		 mobile=Integer.valueOf(mobileNumber);
		}
		
		request.setAttribute("userName", uname);
		
		
		RegBO regBo=new RegBO();
		regBo.setEmail(email);
		regBo.setMobile(mobile);
		regBo.setPassword(pass);
		regBo.setUname(uname);
		RegDao dao=new RegDao();
		int count=dao.saveUserDetails(regBo);
		if(count>0){
			request.getRequestDispatcher("regSuccess.jsp").forward(request, response);
		}
		else{
			request.getRequestDispatcher("regfailure.jsp").forward(request, response);
			
		}
		
	}

}
