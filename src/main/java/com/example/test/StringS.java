package com.example.test;

public class StringS {

	
	
	public static void main(String[] args) {
		/*
		 * //String reverse with method String str="hello"; StringBuilder st=new
		 * StringBuilder(); st.append(str); st=st.reverse();
		 * System.out.println(st);//olleh
		 */		
		String st1="hello";
		char charst[]=st1.toCharArray();
		for(int i=charst.length-1;i>0;--i )
		{
			System.out.println(charst[i]);
			//String s2 = String.copyValueOf(charst);
			
		}
	}
}
