package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("studentName:Steve");
	}
	public void studentDept() {
		System.out.println("studentDept:CCS");
	}
	public void studentId() {
		System.out.println("studentId:31207");
	}
	public static void main(String[] args) {
		Student S=new Student();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		S.deptName();
		S.studentName();
		S.studentDept();
		S.studentId();

	}

}
