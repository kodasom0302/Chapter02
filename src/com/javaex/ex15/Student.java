package com.javaex.ex15;

public class Student extends Person{	//extends ~ : 상속받는다
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {	//Person() 사용
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
	public String toString() {
		return "학교: "+schoolName+", 이름: "+getName()+", 나이: "+getAge();
	}

}
