package searching_in_arrays;

import java.util.Scanner;

public class order_AgnosticBS {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the elements of the array: ");
        int[]arr= new int[10];
        for(int i=0;i<arr.length;i++) {
       	 arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target Value: ");
        int target=sc.nextInt();
        int ans=order_agnosticBS(arr,target);
        System.out.println(ans);

	}
	static int order_agnosticBS(int[] arr,int target){
		int S=0;
		int E= arr.length-1;
		//find whether the array is sorted in ascending or descending order
		boolean isAsc;
		if(arr[S]<arr[E]) {
			isAsc= true;
		}else {
			isAsc=false;
		}
		
		while(S<=E) {
			int M=S+(E-S)/2;
			//common case
			if(arr[M]==target) {
				return M;
			}
			
			if(isAsc) {//this will work if array is sorted in ascending order
				if(target<arr[M]) {
					E=M-1;
				}
				else  {
					S=M+1;
				}
			}else {//this will work if array is sorted in descending order
				if(target>arr[M]) {
					E=M-1;
				}else  {
					S=M+1;
				}
			}
		}
		return -1;
	}

}
