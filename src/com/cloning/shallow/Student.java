package com.cloning.shallow;

public class Student implements Cloneable {

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

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addr=" + addr + "]";
	}
}
