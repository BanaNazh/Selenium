package com.juaracoding.seleniumnew;

import java.text.DateFormat;
import java.text.ParseException;	
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		String input = "12/08/2022 07:10:10 PM";
		DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
		DateFormat outputDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date = null;
		String output = null;
		
		try {
			date = formatDate.parse(input);
			output = outputDate.format(date);
			System.out.println(output);
		} catch (ParseException pe) {
			pe.printStackTrace();
			
		}
	}

}
