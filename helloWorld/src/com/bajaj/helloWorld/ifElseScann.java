package com.bajaj.helloWorld;
import java.util.Scanner;
public class ifElseScann {

	public static int checkNum(int num) {
		
		return num>0?1:0;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)System.out.println(checkNum(num));
		
	}
	
}
