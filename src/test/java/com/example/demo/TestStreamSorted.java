package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.el.stream.Stream;

public class TestStreamSorted {
	
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("A");
		
		list.add("B");
		
		
		list.add("C");
		list.add("e");
		
		list.add("d");
		

		list.add("absdgss");
		
		
		
		List<String> list32=list.stream().filter(str->str.startsWith("a")).collect(Collectors.toList());
		
		
		System.out.println(list32);
		
		
		
		// ascending order
		
	List<String> list11=list.stream().sorted().collect(Collectors.toList());
	System.out.println(list11);
	
	
	

	
	List<String> list1=list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	
	System.out.println(list1);
		
	
	// using lamda
	
	List<String> list2=list.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
	
	System.out.println(list2);
	
	
	
	//descending order

	List<String> list3=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
		
	System.out.println(list3);
	
	
	
List<String> list4=list.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
	
	System.out.println(list4);
	
	
	
	
	
	
	
 List<Employee> empllist=new ArrayList<Employee>();
 
  empllist.add(new Employee(1, "Harry", 100f));
  
  empllist.add(new Employee(2, "aman", 200f));
  empllist.add(new Employee(3, "ankit", 300f));
  empllist.add(new Employee(4, "mohan", 400f));
  
  
	
  List<Employee> empl2=new  ArrayList<Employee>();
  
  
  for(Employee emp : empllist)
  {
	  
	   if(emp.getSalary()>200)
	   {
	  
	empl2.add(emp);
	   }
  }
  
  System.out.println(empl2);
	
	
	
	
	
	List<Employee> emplyelist=empl2.stream().filter(employee->employee.getSalary()>200).collect(Collectors.toList());
	
	System.out.println(emplyelist);
	
	
	
	//empl2.stream().sorted(Comparator.comparingLong(Employee::getSalary)).rev
	
	
	
	
	///MAP
	
	}
	
	
	
	

}
