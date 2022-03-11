package com.copy.constructor;

public class Student{

	int rollNo;
	String name;
	Address addr;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, Address addr) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.addr = addr;
	}

	public Student(Student std) {
		super();
		this.rollNo = std.rollNo;
		this.name = std.name;
		
		Address add1 = new Address();
		add1.city = std.addr.city;
		add1.country = std.addr.country;
		add1.pin = std.addr.pin;
		
		this.addr = add1;

	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addr=" + addr + "]";
	}
}
