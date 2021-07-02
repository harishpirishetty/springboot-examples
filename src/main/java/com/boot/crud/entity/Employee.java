package com.boot.crud.entity;

import java.util.Date;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private Date dob;
	private String address;
	private String phnum;
	private String emailId;
	private String deptName;
	private int deptId;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, String lastName, Date dob, String address, String phnum,
			String emailId, String deptName, int deptId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.phnum = phnum;
		this.emailId = emailId;
		this.deptName = deptName;
		this.deptId = deptId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", address=" + address + ", phnum=" + phnum + ", emailId=" + emailId + ", deptName=" + deptName
				+ ", deptId=" + deptId + "]";
	}
	
}

