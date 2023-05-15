package com.arraylist;

import java.util.Arrays;

public class Student {
	static int last_roll = 101;
	int roll_no;

	Student() {
		roll_no = last_roll;

	}

	public int hashCode() {
		return roll_no;
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());
		Object obj = new String("gegksforgeeks");
		Class c = obj.getClass();
		System.out.println(c.getName());

		Class<?> objj = s.getClass();
		System.out.println("Class Name: " + objj.getName());
		System.out.println("Superclass: " + objj.getSuperclass());
		System.out.println("Interfaces: " + Arrays.toString(objj.getInterfaces()));
	}

}
