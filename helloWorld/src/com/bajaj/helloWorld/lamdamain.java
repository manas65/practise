package com.bajaj.helloWorld;
import java.util.*;
public class lamdamain {
	   public static void main(String args[])
	    {
	    
	        ArrayList<Integer> arrL = new ArrayList<Integer>();
	        arrL.add(1);
	        arrL.add(2);
	        arrL.add(3);
	        arrL.add(4);
	  
	        ArrayList<String> str = new ArrayList<String>();
	        str.add("apple");
	        str.add("banana");
	        str.add("grapes");
	        str.add("eat");
	        str.add("Eat");
	        
	        
	       
	  
	      //odd even
	        arrL.forEach(n -> { if (n%2 == 0) System.out.println("even");else System.out.println("odd") ; });
	        
	        //+ve -ve
	        arrL.forEach(n -> { if (n> 0) System.out.println("+ve");else System.out.println("-ve") ; });
	        
	        
	        //uppercase
	        str.forEach(s -> {  System.out.println(s.toUpperCase()) ; });
	    
	    }
}
