package searching_in_arrays;

public class find_element_in_rotated_array_with_duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,2,2,9,10,7,8,9};
		//int target=2;
		int ans=findPivotWithDuplicateElements(arr);
		System.out.println(ans);

	}
//	static int searchInRotatedSortedArray(int[]arr,int target) {
//		int pivot=findPivotWithDuplicateElements(arr);
//		//if you did not found the pivot, it means the array is not rotated
//		if(pivot==-1) {
//			//just do simple binary search
//			return binary_search(arr,target,0,arr.length-1)	;	
//		}//if pivot is found you have found two ascending sorted arrays
//		if(arr[pivot]==target) {
//			return pivot;
//		}
//		if(target>=arr[0]) {
//			return binary_search(arr,target,0,pivot-1);
//			
//		}
//		return binary_search(arr,target,pivot+1,arr.length-1);
//	}
	static int findPivotWithDuplicateElements(int[] arr) {
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
			//if elements at middle, start, end are equal then just skip the duplicates
			if(arr[mid]==arr[start]&& arr[mid]==arr[end]) {
				//skip the duplicates
				
				//NOTE: what if the start and end elements that we are skipping blindly were the pivot elements
				//check if start is pivot
				if(arr[start]>arr[start+1]) {
					return start;
				}
				start++;//if start is not pivot we will skip the start
				if(arr[end]<arr[end-1]) {
					return end-1;
				}
				end--;
					
			}
			//left side is sorted, so pivot should be in right
			else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
//	static int binary_search(int[] arr,int target,int S,int E) {
//		
//		
//		while(S<=E) {
//			
//			//int M=(S+E)/2;  //might be possible that the S+E might be exceed the range of integer in java
//			//you can do this type if thing
//			int M=S+(E-S)/2;
//			if(target<arr[M]) {
//				E=M-1;
//			}
//			else if(target>arr[M]) {
//				S=M+1;
//			}
//			else {
//				return M;//target==M
//			}
//				
//		}
//		return -1;
//	}


}
