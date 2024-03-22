package searching_in_arrays;
import java.util.Scanner;
public class find_no_withEvenNo_ofDigits_leetcode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the Array: ");
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=findNumbers( arr);
		System.out.println("Number of no.s having enen number of digits is:" +ans);
		
		//calling the function to find the number of digits in a number
		System.out.println(digits(-6959823));

	}
	
	//function to find the number of numbers having even number of digits
	static int findNumbers(int[] arr) {
		int count=0;
		for(int element:arr) {
			if(even(element)) {
				count++;
			}
		}
		return count;
	}
	//function to check whether a number contains even no. of digits or not
	static boolean even(int element) {
		if(element<0) {//it will also accept the negative numbers
			element=element*-1;
		}
		//you have to also include a test case for number 0
		int count2=0;
		while(element>0) {
			count2++;
			element=element/10;
		}
		if(count2 %2==0) {
			return true;
		}
		return false;
	}
	
	//function to find the number of digits in a number
	static int digits(int num) {
		if(num<0) {
			num=num*-1;
		}
		return (int)(Math.log10(num)) +1;
	}
	

}
