package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String[] args) {
		
		
		/*
		 * //Stream Filter List<Integer> num=new ArrayList<Integer>(); num.add(12);
		 * num.add(14); num.add(7); num.add(9);
		 * 
		 * System.out.println(num);
		 * 
		 * for(int n:num) { if(n%2==0) { // System.out.println("even number"+n); }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * List<Integer>
		 * numb=num.stream().filter(x->x%2==0).collect(Collectors.toList());
		 * 
		 * 
		 * System.out.println("even number"+numb);
		 */
		
		
		
		  List<String> num=Arrays.asList("vimles444h","chnadan","hhd","Aman","Ankit");
		  
		  
		  List<String>  name=num.stream().filter(x->x.length()>7).collect(Collectors.toList());
		  
		  
		  List<String>  name1=num.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		  System.out.println(name1);
		  
		  System.out.println(name);
		 
		
		
	}

}
