package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name is karthi Nanjundeswaran");
	}
	
	public void studentDept() {
		System.out.println("Dept is Mechanical Engineering");
	}
	
	public void studentID(){
		System.out.println("ID NO is 00987");
		
	}
	public static void main(String[] args) {
		
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		
		student.deptName();
		
		student.studentName();
		student.studentDept();
		student.studentID();
		
	}

}
