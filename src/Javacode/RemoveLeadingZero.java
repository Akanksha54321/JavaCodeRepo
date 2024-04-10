package Javacode;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="00000123456";
/*String regex = "^0+(?!$)";
s=s.replaceAll(regex,"");
System.out.println(s);*/
/*int lastLeadZeroIndex = 0;
for (int i = 0; i < s.length(); i++) {
  char c = s.charAt(i);
  if (c == '0') {
    lastLeadZeroIndex = i;
  } else {
    break;
  }
}
System.out.println(lastLeadZeroIndex);
s = s.substring(lastLeadZeroIndex+1, s.length());
System.out.println(s);*/
int index;
for (index = 0; index < s.length(); index++) {
    if (s.charAt(index) != '0') {
        break;
    }
}
System.out.println(s.substring(index));

	}
	
	}

