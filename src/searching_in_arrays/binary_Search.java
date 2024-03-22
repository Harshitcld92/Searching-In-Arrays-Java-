package searching_in_arrays;
import java.util.Scanner;
public class binary_Search {
//works only for sorted array
	public static void main(String[] args) {
         Scanner sc= new Scanner(System.in); 
         System.out.println("Enter the elements of the array: ");
         int[]arr= new int[10];
         for(int i=0;i<arr.length;i++) {
        	 arr[i]=sc.nextInt();
         }
         System.out.println("Enter the Target Value: ");
         int target=sc.nextInt();
         int ans=binary_search(arr,target);
         System.out.println(ans);
      
	}
	//return -1 if it does not exist
	static int binary_search(int[] arr,int target) {
		int S=0;
		int E=arr.length-1;
		
		while(S<=E) {
			
			//int M=(S+E)/2;  //might be possible that the S+E might be exceed the range of integer in java
			//you can do this type if thing
			int M=S+(E-S)/2;
			if(target<arr[M]) {
				E=M-1;
			}
			else if(target>arr[M]) {
				S=M+1;
			}
			else {
				return M;//target==M
			}
				
		}
		return -1;
	}

}
