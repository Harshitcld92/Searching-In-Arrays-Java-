package searching_in_arrays;

import java.util.Arrays;

public class find_first_and_last_position_of_element_in_sorted_array_leetcode {

	public static void main(String[] args) {
		int[] arr= {5,7,7,7,7,9,8,8,10};
		int target=7;
		
		int[]finalANS=searchRange(arr,target);
		System.out.println(Arrays.toString(finalANS));

	}
	static int[] searchRange(int[]arr,int target) {
		int[] ans= {-1,-1};//because we have to return [-1,-1] if we cannot find the first and last position
		
		//check for first occurrence if target
		int startIndex=search(arr,target,true);
		int endIndex=search(arr,target,false);
		
		ans[0]=startIndex;
		ans[1]=endIndex;
		return ans;
		
		
		 
	}
	//this function will just return the index value of target
	static int search(int[]arr,int target,boolean findStartIndex) {
		int ans =-1;
		int S=0;
		int E=arr.length-1;
		while(S<=E) {
			int M=S+(E-S)/2;
			if(target<arr[M]) {
				E=M-1;
			}else if(target>arr[M]) {
				S=M+1;
			}else {
				//potential ans is found
				//but you do not need to return the middle element
				ans=M;
				if(findStartIndex== true) {//it will find the first occurrence of target on left of the potential answer(if true)
					E=M-1;
				}else {//it will find the last occurrence of the target value in the right side of the potential answer(if findStartIndex==false)
					S=M+1;
				}
			}
		}
		return ans;
	}

}
