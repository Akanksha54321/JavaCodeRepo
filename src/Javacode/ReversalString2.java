package Javacode;

public class ReversalString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="my name is java";

char[]a=s.toCharArray();
int len=a.length;

for(int i=len-1;i>=0;i--) {

System.out.print(a[i]);
	}

	
System.out.println(""); //this is just to new line otherwise o/p will come as avaj si eman ym anir eman ym
	String s1="my name rina";
	
	for(int i=s1.length()-1;i>=0;i--) {
		
		System.out.print(s1.charAt(i));
	}
	
	}

}
//here we r using System.out.print instead of System.out.println