package com.bajaj.helloWorld;
import java.util.*;
public class myset {
	 public static void main(String[] args)
	    {
	       
//	        Set<String> hash_Set = new HashSet<String>();
	        Set<String> hash_Set = new TreeSet<String>();
	       
	        hash_Set.add("apple");
	        hash_Set.add("seeds");
	        hash_Set.add("super");
	        hash_Set.add("mango");
	        hash_Set.add("test");
	 
	       
	        System.out.println(hash_Set);
	    }
}
