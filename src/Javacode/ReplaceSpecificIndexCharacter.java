package Javacode;

public class ReplaceSpecificIndexCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="12345600000";

int index;
for (index = s.length()-1; index >0 ; index--) {
    if (s.charAt(index) != '0') {
        break;
    }
}
System.out.println(s.substring(0,index+1));

	}
	
	}

