package com.bajaj.helloWorld;

class Person{
	
	String name;
	int age;
	String gender;
	
	Person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
	}
	
}

public class myMain {
	public static void main(String args[]) {
		Person p1=new Person("Manas",21,"Male");
		p1.print();
		
	}

}
