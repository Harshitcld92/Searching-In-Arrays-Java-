package searching_in_arrays;

public class search_in_range {

	public static void main(String[] args) {
		int[] arr= {12,51,46,6484,351,81,3,13,15};
		int startIndex=3;
		int endIndex=7;
		int target=15;
		int ans=searchInRange(arr,startIndex,endIndex,target);
		System.out.println(ans);

	}
	static int searchInRange(int[] arr,int startIndex, int endIndex,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=startIndex;i<endIndex;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}
	

}
