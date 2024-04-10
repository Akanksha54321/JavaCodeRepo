package Javacode;

public class RemoveTrailingZero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="geeksforgeeks";
char []a=str.toCharArray();
char temp;
System.out.println(a.length);
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		System.out.println(a[i]);
		System.out.println(a[j]);
		if(a[j]<a[i]) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		System.out.println(a[i]);
		}
	}
	
}
System.out.println(a);

/*String str = "geeksforgeeks";

// Converting string into an array for computation 
char arr[] = str.toCharArray();

// Nested loops for comparison of characters
// in above character array

char temp;

int i = 0;
while (i < arr.length) {
    int j = i + 1;
    while (j < arr.length) {
        if (arr[j] < arr[i]) {
           
            // Comparing the characters one by one
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        j += 1;
    }
    i += 1;
}*/

// By now loop is done means we have
// iterated the whole array
//System.out.println(arr);

}
	}
	

