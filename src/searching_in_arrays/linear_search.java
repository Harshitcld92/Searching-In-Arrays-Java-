package searching_in_arrays;

public class linear_search {

	public static void main(String[] args) {
		int[] arr= {20,50,45,46,90};
		int index=linearSearch(arr,46);
		System.out.println(index);
		
		// calling linearsearch2
		int ans=linearSearch2(arr,90);
		System.out.println(ans);
		
		//calling linearSearch3 which is built using enhanced for loop
		int ans2=linearSearch3(arr,45);
		System.out.println(ans2);
		
			
	}
	//search in the array
	static int linearSearch(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		//run a for loop
		
		for(int i=0;i<arr.length;i++) {
			
			//check for element at every index that if it is = target
			if(arr[i]==target) {
				
				return i;
			}
			
		}
		return Integer.MAX_VALUE;
	}
	
	//if you want to return the element
	//this function will tell you whether the element 90 is present or not, and if present return the element
	static int linearSearch2(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		//run a for loop
		
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			//check for element at every index that if it is = target
			if(element==target) {
				
				return element;
			}
			
		}
		return Integer.MAX_VALUE;
	}
	
	//using enhanced for loop
	static int linearSearch3(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int element:arr) {
			if(element==target) {
				return element;
			}
		}
		return Integer.MAX_VALUE;
		
	}

}
