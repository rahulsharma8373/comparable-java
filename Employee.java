package com.arraylist;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private int age;
    
    
public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}



	@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
}


	public static void main(String[] args) {
		List<Employee> employees = new ArrayList();
		employees.add(new Employee(1, "John", 30));
		employees.add(new Employee(2, "Alice", 25));
		employees.add(new Employee(3, "Bob", 35));
		List<Employee> sortedList = employees.stream()
		        .sorted(Comparator.comparing(Employee::getName))
		        .collect(Collectors.toList());
		System.out.println(sortedList);
		List<Employee> sortedList1 = employees.stream()
		        .sorted(Comparator.comparing(Employee::getName).reversed())
		        .collect(Collectors.toList());
		
	}


}