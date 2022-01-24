package com.bajaj.helloWorld;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
class Club{
	public String Name;
	public String college;
	public String dept;
	public int rollno;
	
	public int  codingRank;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getCodingRank() {
		return codingRank;
	}
	public void setCodingRank(int codingRank) {
		this.codingRank = codingRank;
	}
	@Override
	public String toString() {
		return "Club [Name=" + Name + ", college=" + college + ", dept=" + dept + ", rollno=" + rollno + ", codingRank="
				+ codingRank + "]";
	}
	public Club(String name, String college, String dept, int rollno, int codingRank) {
		super();
		Name = name;
		this.college = college;
		this.dept = dept;
		this.rollno = rollno;
		this.codingRank = codingRank;
	}
	
	
	
	
}


public class coderclub {
	public static void main(String[] args) {
		List<Club> ls=new ArrayList<Club>();
		ls.add(new Club("Rohan","SRM","ECE",21,2));
		ls.add(new Club("sham","vit","ECE",23,3));
		ls.add(new Club("Ibrahim","SRM","cse",121,5));
		ls.add(new Club("john","SRM","civil",224,1));
		ls.add(new Club("Sameer","SRM","ECE",12,6));
	
//		get most rated coder
		ls.stream().sorted((ls1,ls2) -> ((int)ls1.getCodingRank()).compareTo((int)ls2.codingRank)).limit(1).forEach(Club->{
			System.out.println("highest rated coder");
			System.out.println("CodeName: "+ Club.getName());
			
		});
		
	
	
		
		
	
	}

}
