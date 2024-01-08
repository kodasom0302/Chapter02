package com.javaex.ex15;

public class Student extends Person{	//extends ~ : 상속받는다
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {	//Person() 사용
		System.out.println("Student()");
	}
	public Student(String name, int age, String schoolName) { //name, age 부모 //schoolName 자식
		//부모의 생성자 호출
		super(name, age); //super(); 디폴트 생성자 부르기
		/* 디폴트 생성자 사용할 경우 = 다른 생성자가 없을 경우
		super();
		super.setName(name);
		super.setAge(age);
		*/
		
		//자신의 메모리에 올리는 일
		this.schoolName=schoolName;
		System.out.println("Student(3)");
	}
	/*
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	*/

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
