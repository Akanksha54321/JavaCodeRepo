package Javacode;

public class ReverseEachWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hi hello how r you";
		String revString="";
		String[]words=s.split(" ");//space hai
		for(String w:words) {
			System.out.println(w);
			String revword="";
			for(int i=w.length()-1;i>=0;i--){
					
			revword=revword+w.charAt(i);
			System.out.println(revword);
		}
			revString=revString+revword+" ";
			System.out.println(revString);
		}
	}

}
