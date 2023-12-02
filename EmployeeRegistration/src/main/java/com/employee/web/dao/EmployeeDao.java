package com.employee.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.employee.web.model.Employee;

public class EmployeeDao {

	public Employee getEmployee(int eid) {
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("Navin");
		e1.setEtech("Java");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "admin", "admin");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where eid=" + eid);
			if (rs.next()) {
				e1.setEid(rs.getInt("eid"));
				e1.setEname(rs.getString("ename"));
				e1.setEtech(rs.getString("etech"));
			}
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return e1;

	}
}
