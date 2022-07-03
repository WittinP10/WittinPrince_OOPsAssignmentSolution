package com.greatlearning.model;

public class HrDepartment extends SuperDepartment{

	private String deptName;
	private String work;
	private String deadline;
	private String activity;
	
	
	
	
	public HrDepartment() {
		super();
		deptName = "HR Department";
		work = "Fill today's timesheet and mark your attendance";
		deadline = "Complete by EOD";
		activity = "Team Lunch";
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

	public String teamActivity() {
	
		return activity;
	
	}
	
	
}
