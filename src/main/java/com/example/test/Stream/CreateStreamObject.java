package com.example.test.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreateStreamObject {
	
	
	public static void main(String[] args) {
		
	
	
	//create  a strream
	
	Stream<String> stream=Stream.of("d","dd","dd");

	stream.forEach(System.out::println);
	
	System.out.println(stream);
	
	
	// Create stream for source
	 Collection<String> collection=Arrays.asList("a","b");
	 System.out.println(collection);
	 
	 Stream<String> stream2=collection.stream();
	 System.out.println(stream2);
//	 stream2.forEach(System.out::println=]);
	 

	 }
	

}
