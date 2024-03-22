package searching_in_arrays;

public class search_in_mountain_array {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,8,6,4,2,0};
		int target=8;
		int ans=search(arr,target);
		System.out.println(ans);

	}
	static int search(int[]arr,int target) {
		int peak=mountain(arr);
		int firstTry=order_agnosticBS(arr,target,0,peak);
		if(firstTry!=-1) {
			return firstTry;
		}
		//otherwise search in second half
		return order_agnosticBS(arr,target,peak+1,arr.length-1);
		
	}
	static int mountain(int[]arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<arr[mid+1]) {
				//you are in the ascending part of the array
				//this may be the ams but we have also to look at the right
				start=mid+1;//because we know that mid+1 element>mid element
			}
			else if(arr[mid]>arr[mid+1]) {
				//you are in the dec part of the array
				//this may be the ans, but look at left part also
				end=mid;
			}
		}
		//at the end, start == end and pointing towards the largest number because the two checks above
		//start and end are always trying to find the maximum element in the above 2 checks
		//hence, when they are pointing to just one element, that is the max one because that is what the checks say
		
		return start;//or end as both are equal
	}
	
	static int order_agnosticBS(int[] arr,int target,int S,int E){
		
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
