package com.greatlearning.groupassignment.mainapplication;

import com.greatlearning.groupassignment.departments.AdminDepartment;
import com.greatlearning.groupassignment.departments.HrDepartment;
import com.greatlearning.groupassignment.departments.TechDepartment;

/**
 * Driver/ Main class to create a object of the departments and calling the
 * methods of the different departments
 **/

public class MainApplication {
	public static void main(String[] args) {

		// Creation of child class object
		AdminDepartment adminDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();

		System.out.println(" Welcome to" + adminDept.departmentName());
		System.out.println(charToLowerCase(adminDept.getTodaysWork(), 24));
		System.out.println(adminDept.getWorkDeadline().trim());
		System.out.println(charToUpperCase(adminDept.isTodayAHoliday().trim(), 15) + "\n");

		System.out.println(" Welcome to" + charToUpperCase(hrDept.departmentName(), 2));
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork().trim());
		System.out.println(hrDept.getWorkDeadline().trim());
		System.out.println(charToUpperCase(hrDept.isTodayAHoliday().trim(), 15) + "\n");

		System.out.println(" Welcome to" + techDept.departmentName());
		System.out.println(charToUpperCase(techDept.getTodaysWork().trim(), 19));
		System.out.println(techDept.getWorkDeadline().trim());
		System.out.println(" " + charToUpperCase(techDept.getTechStackInformation(),0));
		System.out.println(charToUpperCase(techDept.isTodayAHoliday().trim(), 15) + "\n");
	}

	// Method to convert the character from string to upper case
	public static String charToUpperCase(String str, int position) {

		if (str == null || str.length() == 0)
			return "";

		if (str.length() == 1)
			return str.toUpperCase();

		char[] chArr = str.toCharArray();
		chArr[position] = Character.toUpperCase(chArr[position]);

		return new String(chArr);
	}

	// Method to convert the character from string to lower case
	public static String charToLowerCase(String str, int position) {

		if (str == null || str.length() == 0)
			return "";

		if (str.length() == 1)
			return str.toLowerCase();

		char[] chArr = str.toCharArray();
		chArr[position] = Character.toLowerCase(chArr[position]);

		return new String(chArr);
	}
}
