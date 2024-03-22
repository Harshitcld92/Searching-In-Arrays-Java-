package searching_in_arrays;

import java.util.Scanner;

public class floor_of_a_number {
//for finding biggest number smaller than equal to target number
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the elements of the array: ");
        int[]arr= new int[10];
        for(int i=0;i<arr.length;i++) {
       	 arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target Value: ");
        int target=sc.nextInt();
        int ans=floorOfArray(arr,target);
        System.out.println(ans);

	}
	static int floorOfArray(int[] arr,int target) {
		int S=0;
		int E=arr.length-1;
		
		while(S<=E) {
			//what if the target element is greater than the last element of the array, just return -1
			//this is the edge case
			if(target>arr[arr.length-1]) {
				return -1;
			}
			//int M=(S+E)/2;  //might be possible that the S+E might be exceed the range of integer in java
			//you can do this type if thing
			int M=S+(E-S)/2;
			if(target<arr[M]) {
				E=M-1;
			}
			else if(target>arr[M]) {
				S=M+1;
			}
			else if(target==M){
				return arr[M];//target==M, instead of returning index you have to return element which is the requirement
			}
			
		}
		return arr[E];//rather than returning -1 you have to return End0 element when the loop condition is violated, which is the required answer
	


	}

}
