package Javacode;

public class ReversalOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="my name is java";
String rev="";
char[]a=s.toCharArray();
int len=a.length;

for(int i=len-1;i>=0;i--) {
//	System.out.println(a[i]);
rev=rev+a[i];
System.out.println(rev);
	}
System.out.println(rev);
	
	
	String s1="my name rina";
	String rev1="";
	for(int i=s1.length()-1;i>=0;i--) {
		rev1=rev1+s1.charAt(i);
		System.out.println(rev1);
	}
	System.out.println(rev1);
	}

}
