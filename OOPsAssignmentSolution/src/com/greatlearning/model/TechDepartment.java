package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {
	
	private String deptName;
	private String work;
	private String deadline;
	private String techStackInfo;

	
	public TechDepartment() {
		super();
		deptName = "Tech Department";
		work ="Complete coding of module 1";
		deadline = "Complete by EOD";
		techStackInfo = "Core Java";
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

	public String getTechStackInformation() {
	
		return techStackInfo;
	
	}
}
