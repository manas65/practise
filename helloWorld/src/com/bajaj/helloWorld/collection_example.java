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


class Employees implements Comparable<Employees>
{
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employees [rollno=" + rollno + ", name=" + name + "]";
	}
	public Employees(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	int rollno;
	String name;
	
	
	
	@Override
	public int compareTo(Employees e2) {
		
		if(this.rollno>e2.getRollno())
		{
			return -1;
		}
		else if(this.rollno<e2.getRollno())
		{
			return 1;
		}
		else
		{
		// TODO Auto-generated method stub
		return 0;
		}
	}
}
public class collection_example {

	public static void main(String args[])
	{
		
		List<Employees> ls=new ArrayList<Employees>();
		
		//add
		
		ls.add(new Employees(1001,"Zriya"));
		ls.add(new Employees(100,"Ansar"));
		ls.add(new Employees(85,"Mahesh"));
		ls.add(new Employees(50,"Kamreah"));
	
		
	
		
		Collections.sort(ls,Collections.reverseOrder());
		
		for(Employees str:ls)
		{
		
			System.out.println(str.toString());
		}
		
		
	}

}
