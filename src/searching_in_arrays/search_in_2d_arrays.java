package searching_in_arrays;

import java.util.Arrays;

public class search_in_2d_arrays {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				  {8,7,-9},
				  {5,12,42}
				};
		int target=12;
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
		
		//calling the function to find the maximum element in an array
		int ans2=max_element(arr);
		System.out.println("maximum element is: "+ans2);
		
		//calling the function to find the minimum element of the 2d array
		int ans3=min_element(arr);
		System.out.println("minimum element is: "+ans3);

	}
	static int[] search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};//another way of declaration and initializing the array
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	//similarly you can find maximum element in 2d Array
	static int max_element(int[][] arr) {
		int max=arr[0][0];
		for(int[] arrInarr:arr) {//because every single array is going to be have an integer array itself
			for(int element:arrInarr) {//it searches an integer element in the array element of outer array
				
				if(element>max) {
					max=element;
				}
			}
		}
		return max;
	}
	//similarly you can do it for finding the minimum element of the array
	static int min_element(int[][] arr) {
		int min=arr[0][0];
		for(int[] arrOfarr:arr) {
			for(int element:arrOfarr) {
				if(element<min) {
					min=element;
				}
			}
		}
		return min;
		
	}

}
