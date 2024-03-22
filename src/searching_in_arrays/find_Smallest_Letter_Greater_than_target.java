package searching_in_arrays;

public class find_Smallest_Letter_Greater_than_target {

	public static void main(String[] args) {
		char[] arr={'c','f','j','o'};
		char target='x';
		char ans=nextGreatestLetter(arr,target);
		System.out.println(ans);

	}
	static char nextGreatestLetter(char[] arr, char target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			//find the middle element
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}//here we ignored the mid==target case
		}
		//return arr[start%arr.length];//this is for the edge case, if there is no element greater than the target->return arr[0]
		//or we can do this
		return arr[0];
	}

}
