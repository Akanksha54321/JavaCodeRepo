package Javacode;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class dynamicData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(randomAlphanumericString(6));
System.out.println(randomnumericString(7));
System.out.println(currentDate());
System.out.println(pastDate());
System.out.println(futureDate());
	}
	
	//generate Alphanumeric String
	public static String randomAlphanumericString(int length) {
	    
	    String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";
	    StringBuffer randomString = new StringBuffer(length);
	    Random random = new Random();
	 
	    for (int i = 0; i < length; i++) {
	        int randomIndex = random.nextInt(alphanumericCharacters.length());
	        char randomChar = alphanumericCharacters.charAt(randomIndex);
	        randomString.append(randomChar);
	    }
	 
	    return randomString.toString();
	}
	//generate string of numbers
	public static String randomnumericString(int length) {
	    String alphanumericCharacters = "0123456789";
	
	    StringBuffer randomString = new StringBuffer(length);
	    Random random = new Random();
	 
	    for (int i = 0; i < length; i++) {
	        int randomIndex = random.nextInt(alphanumericCharacters.length());
	        char randomChar = alphanumericCharacters.charAt(randomIndex);
	        randomString.append(randomChar);
	    }
	 
	    return randomString.toString();
	}
	public static String currentDate() {
	//generate dates
	Calendar cal=Calendar.getInstance();
	Date c=cal.getTime();
	SimpleDateFormat st1= new SimpleDateFormat("MM/dd/yyyy");
	String result=st1.format(new Date(cal.getTimeInMillis()));
	return result;
	
	}
	public static String pastDate() {
		//generate dates
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,-1);
		Date c=cal.getTime();
		SimpleDateFormat st1= new SimpleDateFormat("MM/dd/yyyy");
		String result=st1.format(new Date(cal.getTimeInMillis()));
		return result;
		
		}
	public static String futureDate() {
		//generate dates
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,1);
		Date c=cal.getTime();
		SimpleDateFormat st1= new SimpleDateFormat("MM/dd/yyyy");
		String result=st1.format(new Date(cal.getTimeInMillis()));
		return result;
		
		}
}
