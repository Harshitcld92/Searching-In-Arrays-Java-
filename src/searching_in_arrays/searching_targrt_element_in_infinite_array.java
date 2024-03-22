package searching_in_arrays;

public class searching_targrt_element_in_infinite_array {

	public static void main(String[] args) {
		int[] arr= {4,5,6,8,9,12,13,15,17,19,21,22,25};
		int target= 4;
		int finalANS=ans(arr,target);
		System.out.println(finalANS);
		

	}
	static int ans(int[]arr,int target) {
		//first find the range
		//and find the start with a box of size 2
		int start=0;
		int end=1;
		//condition for target to lie in the range
		//we will keep doubling the size while my target is greater than end
		while(target>arr[end]) {
			int newStart=end+1;
			//double the box value
			//newEnd==previousEnd + sizeOfBox * 2
			
			// Check for potential out-of-bounds condition
            if (newStart > arr.length - 1) {
                return -1; // Target not found
            }

            // Double the box value
            // newEnd == previousEnd + sizeOfBox * 2
            end = Math.min(arr.length - 1, end + (end - start + 1) * 2);
			//end=end+(end-start+1)*2;//1+(1-0+1)*2
			start=newStart;//because we cannot use start after updating it
		}
		return infiniteArray(arr,target,start,end);
	}
	static int infiniteArray(int[]arr,int target,int S,int E) {
		
		//simple binary search
		while(S<=E) {
			int M=S+(E-S)/2;
			if(target<arr[M]) {
				E=M-1;
			}else if(target>arr[M]) {
				S=M+1;
			}else {
				
				return M;
			}
		}
		return -1;
	}

}
