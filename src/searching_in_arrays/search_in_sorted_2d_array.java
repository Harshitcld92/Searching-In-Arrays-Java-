package searching_in_arrays;
import java.util.Arrays;
public class search_in_sorted_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {//matrix is sorted in row wise and column wise manner
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
		};
		int target=37;
		System.out.println(Arrays.toString(findElement(arr,target)));

	}
	static int[] findElement(int[][]arr,int target) {
		int r=0;
		int c=arr.length-1;
		while(r<arr.length &&c>=0) {
			if(arr[r][c]==target) {
				return new int[] {r,c};
			}
			if(arr[r][c]<target) {//if target if bigger than current element then increase row by 1
				r++;
			}else {
				c--;//if target if smaller than current element then decrease the column number by 1
			}
		}
		return new int[] {-1,-1};
	}

}
