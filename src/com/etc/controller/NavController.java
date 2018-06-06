package com.etc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.entity.Nav;
import com.etc.service.NavService;
import com.etc.service.impl.NavServiceImpl;

/**
 * Servlet implementation class NavController
 */
@WebServlet("/NavController")
public class NavController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    NavService ns=new NavServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op="query";
		if(null!=request.getParameter("op")) {
			op=request.getParameter("op");
		}
		if("query".equals(op)) {
			
			List<Nav> navList=ns.getNav();
			request.setAttribute("navList", navList);
			request.getRequestDispatcher("admin/nav-list.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
