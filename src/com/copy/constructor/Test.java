package com.copy.constructor;

public class Test{

	public static void main(String[] args){

		Address add = new Address("Pune","India",411034);
		
		Student s1 = new Student(10,"Ram",add);
		Student s2 = new Student(s1);
		System.out.println("s1 before change: "+s1);
		System.out.println("s2 before change: "+s2);

		System.out.println("-----------------------------------------------------------------------------------------------------------");
		s2.rollNo = 20;
		s2.name = "Sham";
		s2.addr.city = "Mumbai";
		
		System.out.println("s1 after change: "+s1);
		System.out.println("s2 after change: "+s2);
		
	}

}

