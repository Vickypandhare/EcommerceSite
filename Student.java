package com.vicky4.Spring4;

public class Student {
	private Course course;
	
	public Student(Course course) {
		this.course=course;
		
	}
	
	public void displayCourse() {
		
		course.displaycourse();
	}
}
