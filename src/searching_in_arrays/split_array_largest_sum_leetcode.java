package searching_in_arrays;

public class split_array_largest_sum_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {7,2,5,8,10};
		System.out.println(splitArray(nums,2));

	}
	static int splitArray(int[]nums, int m) {
		int start=0;
		int end=0;
		for(int i=0;i<nums.length;i++) {
			start=Math.max(start,nums[i]);//in the end of the loop this will contain the max item from the array 
			end+=nums[i];
		}
		//binary search
		while(start<end) {
			//try for the middle as potential ans
			int mid=start+(end-start)/2;
			//calculate how many pieces you can divide this in with max sum
			int sum=0;
			int pieces=1;
			for(int num:nums) {
				if(sum+num>mid) {
					//you cannot add this in this subarray make new one
					//say you add this num in new subarray, then sum=num
					sum=num;
					pieces++;
				}else {
					sum+=num;
				}
			}
			if(pieces>m) {
				start=mid+1;
			}else {
				end=mid;
			}
			
		}
		return end;//here start==end
	}
	

}
