package com.employee.web.model;

public class Employee {
	private int eid;
	private String ename;
	private String etech;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtech() {
		return etech;
	}
	public void setEtech(String etech) {
		this.etech = etech;
	}
	@Override
	public String toString() {
		return "Alien [eid=" + eid + ", ename=" + ename + ", etech=" + etech + "]";
	}
	public Employee(int eid, String ename, String etech) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.etech = etech;
	}
	
	public Employee() {
		super();
	}
}
