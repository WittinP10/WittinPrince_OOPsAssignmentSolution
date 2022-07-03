package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {

	private String deptName;
	private String work;
	private String deadline;
	
	
	public AdminDepartment() {
		super();
		deptName ="Admin Department";
		work = "Complete your documents submission";
		deadline = "Complete by EOD";
	}

	public String departmentName() {
		
		return deptName;
		
	}
	
	public String getTodaysWork() {
		
		return work;
		
	}

	public String getWorkDeadline() {
	
		return deadline;
	
	}

	
	
	
}
