package com.greatlearning.driver;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;

public class DriverClass {

	
	
	public static void main(String[] args) {
		
	AdminDepartment s1=new AdminDepartment();	
	HrDepartment s2=new HrDepartment();		
	TechDepartment s3=new TechDepartment();
	
	System.out.println("Welcome to " +s1.departmentName()+"\n"+s1.getTodaysWork()+"\n"+s1.getWorkDeadline()+"\n"+s1.isTodayAHoliday());
	System.out.println();
	System.out.println("Welcome to " +s2.departmentName()+"\n"+s2.teamActivity()+"\n"+s2.getTodaysWork()+"\n"+s2.getWorkDeadline()+"\n"+s2.isTodayAHoliday());
	System.out.println();
	System.out.println("Welcome to " +s3.departmentName()+"\n"+s3.getTodaysWork()+"\n"+s3.getWorkDeadline()+"\n"+s3.getTechStackInformation()+"\n"+s3.isTodayAHoliday());
	
	}
	
	
}
