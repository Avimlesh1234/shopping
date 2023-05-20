package com.example.test;

import net.bytebuddy.asm.Advice.Return;

public class LamdaTest {
	
	public static void main(String[] args) {
		 int width=10;
		 
		 //  without lamda and Drawable implementation  using annonymous class
		 
		/*
		 Drawable  d=new Drawable() {
			 public void draw() {
				 System.out.println("drawing"+width);
			 }
			 };
			 d.draw();
			 */
		 
		 
		 // With Lamda  function
		 
		 /*
		 Drawable d2=()->{
			 System.out.println("width"+width);
		 };
		 d2.draw();
		 
		 */
		 
	     // no parameter
		/* 
		 Drawable d3=()->
				 {
			  System.out.println("hello");
			
				 };
				 d3.draw();
				 */
		 //
		 
		 // with  single parameter
		 
		/* Drawable d4=(name)->{
			
			 
			 return "vimlesh"+name;
		 };
		
		System.out.println(d4.say("hello"));
		 */
		 
		// Drawable d5=(a,b)->(a+b);
		 //System.out.println(d5.add(12, 6));
		 
		 
		 //}
	
	/*
	Drawable d6=(int a,int b)->{
		return(a+b);
	};
	 System.out.println(d6.add(12, 6));
	 
	*/
		 
		 
		 
	}
	}

