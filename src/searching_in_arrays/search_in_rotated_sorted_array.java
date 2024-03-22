package searching_in_arrays;

public class search_in_rotated_sorted_array {

	public static void main(String[] args) {
		int[] arr= {3,4,5,6,7,0,1,2};
		int target=5;
		int ans=searchInRotatedSortedArray(arr,target);
		System.out.println(ans);

	}
	static int searchInRotatedSortedArray(int[]arr,int target) {
		int pivot=findPivot(arr);
		//if you did not found the pivot, it means the array is not rotated
		if(pivot==-1) {
			//just do simple binary search
			return binary_search(arr,target,0,arr.length-1)	;	
		}//if pivot is found you have found two ascending sorted arrays
		if(arr[pivot]==target) {
			return pivot;
		}
		if(target>=arr[0]) {
			return binary_search(arr,target,0,pivot-1);
			
		}
		return binary_search(arr,target,pivot+1,arr.length-1);
	}
	static int findPivot(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			//4 cases over here
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]) {
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
	
	static int binary_search(int[] arr,int target,int S,int E) {
		
		
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
