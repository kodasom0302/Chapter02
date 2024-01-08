package com.javaex.ex15;

public class Student extends Person{	//extends ~ : 상속받는다
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 - g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 - 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

}
