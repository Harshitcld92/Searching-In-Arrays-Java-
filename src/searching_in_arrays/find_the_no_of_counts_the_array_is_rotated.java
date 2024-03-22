package searching_in_arrays;

public class find_the_no_of_counts_the_array_is_rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,1,2,3};
		System.out.println(rotationCount(arr));

	}
	static int rotationCount(int[]arr) {
		//rotation counts means that how many times the array is rotated
		//we can firstly find the pivot element index, and simply the array is rotated pivot+1 times
		//because if we rotate a sorted array one time the largest element will come to start index, so pivot index is 0 
		//similarly if we rotate the array N times the pivot or the largest element will come at the N-1th index
		int ans=findPivot(arr);
		return ans+1;
		
		
		
	}
	//hence the function for finding the pivot element is--
	static int findPivot(int[]arr) {
		
				int start=0;
				int end=arr.length-1;
				while(start<end) {
					int mid=start+(end-start)/2;
					//all the 4 cases
					if(arr[mid]>arr[mid+1]) {
						return mid;
					}
					if(arr[mid]<arr[mid-1]) {
						return mid-1;
					}
					if(arr[mid]<=arr[start]) {
						end=mid-1;
					}else {
						start=mid+1;
					}
				}
				return -1;
	}

}
