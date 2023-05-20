package com.example.test;

import java.util.Calendar;
import java.util.Date;  
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.ParseException;  
public class Test {
public static void main(String[] args) throws ParseException {
	 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = new Date();  
	    
	    String date1=formatter.format(date);
	    
	    String date2="2023-04-31";
	    		//formatter.format(date);
	    
	    if(date1.compareTo(date2)>0)
	    {
	    	System.out.println(" date 2 comme before date1");
	    	
	    }
	    if(date1.compareTo(date2)<0)
	    {
	    	System.out.println(" date 1 comme before date2");
	    	
	    }
	    if(date1.compareTo(date2)==0)
	    {
	    	System.out.println(" date 1 comme before date2");
	    	
	    }
	    
//comparing dates  
}

}
