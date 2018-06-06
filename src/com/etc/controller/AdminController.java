package com.etc.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.etc.entity.Admin;
import com.etc.service.AdminService;
import com.etc.service.impl.AdminServiceImpl;



/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// ����Service����
	AdminService as = new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ��������ı��� ,λ��Ӧ����request.getParameter֮ǰ
		request.setCharacterEncoding("utf-8");
		//�õ�����op
		String op = request.getParameter("op");
		if ("login".equals(op)) {
			// �õ��û�������û���������
			String adminAccount = request.getParameter("adminAccount");
			String adminPwd = request.getParameter("adminPwd");
			// ����userService�ķ���
			Admin a = as.adminLogin(adminAccount, adminPwd);
			
			if (null != a) {
				// �û�����������ȷ
				
			
					// ���û���¼����Ϣ�洢��session��
					HttpSession session = request.getSession();
					// ���û���Ϣ�洢��session������
					session.setAttribute("Admin", a);
					session.setAttribute("adminAccount", adminAccount);
					// ��¼�ɹ� ��ת��̨�Ľ���
				
					// 1 ת��
					//request.getRequestDispatcher("admin/index.jsp").forward(request, response);
					// 2�ض���
				
				response.sendRedirect("admin/index.jsp");
			
			} else {
				// �û�������������� ,��ת����¼ҳ��ȥ
				// 1 ת��
				// 2�ض���
				
				response.sendRedirect("admin/login.jsp");

			}

		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
