package com.greatlearning.model;

public class SuperDepartment {

	private String deptName;
	private String work;
	private String deadline;
	private boolean holiday;
	
	
	public SuperDepartment() {
		
		deptName="SuperDepartment";
		work="No work as of now";
		deadline="Nil";
		holiday=false;
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

	public String isTodayAHoliday() {
	
		if (holiday==true) {
			return "Yes today is a holiday";
	
		}else {
			
			return "Today is not a holiday";
		}
	
	}
	
}
