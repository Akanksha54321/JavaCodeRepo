package Javacode;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String email1="abcd123@gmail.com";
String email2="abcd123gmail.com";
System.out.println(validateEmail(email1));
System.out.println(validateEmail(email2));

	}
public static String validateEmail(String email) {
	
	if(email==null || email.isEmpty()) {
		return "invaild";
	}
	 String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	 Pattern pattern= Pattern.compile(regexPattern);
	 if(pattern.matcher(email).matches()) {
		 return "vaild";
	 }else 
		 return "invaild";
		    
	
}
}
