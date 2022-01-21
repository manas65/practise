package com.bajaj.helloWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


class Student implements Comparable<Student>
{
	int rollno;
	String name;
	int age;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ",age=" + age + ", name=" + name + "]";
	}
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age=age;
	}
	
	
	
	
	
	
	@Override
	public int compareTo(Student e2) {
		
		if(this.age>e2.getage())
		{
			return -1;
		}
		else if(this.age<e2.getage())
		{
			return 1;
		}
		else
		{
		if(this.rollno<e2.getRollno())return -1;
		return 0;
		}
	}
//	class sortByroll implements Comparator<Student>{
//	public int compare(Student e2) {
//		
//		if(this.rollno>e2.getRollno())
//		{
//			return -1;
//		}
//		else if(this.rollno<e2.getRollno())
//		{
//			return 1;
//		}
//		else
//		{
//		if(this.age<e2.getage())return -1;
//		return 0;
//		}
//	}
//	}
}

public class myMainStud {
	public static void main(String args[])
	{
		
		List<Student> ls=new ArrayList<Student>();
		
		//add
		
		ls.add(new Student(10,"Ram",21));
		ls.add(new Student(200,"Sham",22));
		ls.add(new Student(9,"Mohan",23));
		ls.add(new Student(96,"Sohan",22));
	
		
	
		
		Collections.sort(ls, new roll());
		
		for(Student str:ls)
		{
		
			System.out.println(str.toString());
		}
		
		
	}
	
}
