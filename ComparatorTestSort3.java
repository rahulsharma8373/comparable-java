package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student7{
	int rollno;  
	String name;  
	int age;  
	Student7(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
}}
class AgeComparator implements Comparator<Student7>{
	public int compare(Student7 s1,Student7 s2){  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1; 
	}  
	}  
class NameComparator implements Comparator<Student7>{  
public int compare(Student7 s1,Student7 s2){  
return s1.name.compareTo(s2.name);  
}  
} 

public class ComparatorTestSort3 {
	public static void main(String[] args) {
		//Creating a list of students  
		ArrayList<Student7> al=new ArrayList<Student7>();  
		al.add(new Student7(101,"Vijay",23));  
		al.add(new Student7(106,"Ajay",27));  
		al.add(new Student7(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		//Using NameComparator to sort the elements  
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(Student7 st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		System.out.println("sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new AgeComparator());  
		//Travering the list again  
		for(Student7 st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
		
		}  
		}  
