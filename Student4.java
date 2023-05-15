package com.arraylist;

public class Student4 {
int id;
String name;
public Student4(int i,String n) {
	id=i;
	name=n;
	
}
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
	Student4 s=new Student4(1, "rahul");
	s.display();
		
		

	}

}
