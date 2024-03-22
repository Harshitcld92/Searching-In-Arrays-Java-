package searching_in_arrays;

public class findMinNumber {

	public static void main(String[] args) {
		int[] arr= {-7,54,51,3,5,132,541,2};
		int minNo=findMin(arr);
		System.out.println(minNo);

	}
	static int findMin(int[]arr) {
		int min=arr[0];
		
	
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
