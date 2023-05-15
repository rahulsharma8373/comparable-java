package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class Student6 implements Comparable<Student6>{
	
	int rollno;
	String name;
	int age;
	public Student6(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student6 o) {
	if(rollno==o.rollno)
		return 0;
	else if (rollno>o.rollno) 
		
	return 1;
	else 
		return -1;
	}
	
	}
	
	

public class ComparableTestSort3 {
public static void main(String[] args) {
	ArrayList<Student6> al=new ArrayList<>();
	al.add(new Student6(101, "vijay", 23));
	al.add(new Student6(106, "ajay", 27));
	al.add(new Student6(105, "jai", 21));
	Collections.sort(al);
	for (Student6 b : al) {
		System.out.println(b.rollno+" "+b.name+" "+b.age);
	}
}
}
