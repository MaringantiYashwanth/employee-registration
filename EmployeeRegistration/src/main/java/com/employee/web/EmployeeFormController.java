package com.employee.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.web.dao.EmployeeDao;
import com.employee.web.model.Employee;

/**
 * Servlet implementation class EmployeeFormController
 */
@SuppressWarnings("serial")
public class EmployeeFormController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		String etech = request.getParameter("etech");
		EmployeeDao dao = new EmployeeDao();
		Employee e1 = dao.getEmployee(eid);

		request.setAttribute("employee", e1);
//		RequestDispatcher rd = request.getRequestDispatcher("showEmployee.jsp");
//		rd.forward(request, response);
		HttpSession session = request.getSession();
		session.setAttribute("employee", e1);
		response.sendRedirect("showEmployee.jsp");
	}

}
