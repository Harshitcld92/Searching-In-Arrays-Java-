package searching_in_arrays;

public class find_peak_element_in_the_montain_array {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,11,10,8,6,4,2,0};
		
		int ans=mountain(arr);
		System.out.println(ans);

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
		////more elaboration: at every point of time for start and end, they have the best possible ans till that time
		// and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
		return start;//or end as both are equal
	}

}
