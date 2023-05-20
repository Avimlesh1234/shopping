package com.example.test.Steam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamFilter {
	
	Long id;
	String name;
	String address;
	
	int salary;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public TestStreamFilter(Long id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "TestStreamFilter [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		
		List<TestStreamFilter> list=new ArrayList<TestStreamFilter>();
		list.add(new TestStreamFilter(1l, "vimlesh", "Delhi",100));
		
		list.add(new TestStreamFilter(4l, "vimlesh", "Delhi",99));

		list.add(new TestStreamFilter(3l, "vimlesh", "Delhi",300));

		list.add(new TestStreamFilter(2l, "vimlesh", "Delhi",88));
		
		
		List list2=list.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).collect(Collectors.toList());
				//list.stream().filter(s->s.getSalary()<100).collect(Collectors.toList());
		
		System.out.println(list2);
		
	//	System.out.println(list);
		
		
		
	}

}
