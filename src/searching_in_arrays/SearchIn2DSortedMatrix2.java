package searching_in_arrays;

import java.util.Arrays;

public class SearchIn2DSortedMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println(Arrays.toString(search(matrix,16
				)));

	}
	
	//search in the row provided and between the column provided in that row
	static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd, int target) {
		while(cStart<=cEnd) {
			int mid=cStart+(cEnd-cStart)/2;
			if(matrix[row][mid]==target) {
				return new int[] {row,mid};
			}
			if(matrix[row][mid]<target) {
				cStart=mid+1;
			}else {
				cEnd=mid-1;
			}
		}
		return new int[] {-1,-1};
	}
	static int[] search(int[][]matrix,int target) {
		int rows=matrix.length;
		int cols=matrix[0].length;//be cautious, matrix may be empty
		if(rows == 1) {
			return binarySearch(matrix,0,0,cols-1,target);
		}
		//run the loop till two rows are remaining
		int rStart=0;
		int rEnd=rows-1;
		int cMid=cols/2;
		while(rStart<(rEnd-1)) {//while this is true it will have more than 2 rows
			int mid=rStart+(rEnd-rStart)/2;
			if(matrix[mid][cMid]==target) {
				return new int[] {mid,cMid};
			}
			if(matrix[mid][cMid]<target) {
				rStart=mid;//ignoring the above rows
			}else {
				rEnd=mid;//ignoring the lower rows
			}
		}
		
		//now we have two rows
		//check whether the target is in the col of two rows
		if(matrix[rStart][cMid]==target) {
			return new int[] {rStart,cMid};
		}
		if(matrix[rStart+1][cMid]==target) {
			return new int[] {rStart+1,cMid};
		}
		
		//search in 1st half
		if(target<=matrix[rStart][cMid-1]) {
			return binarySearch(matrix,rStart,0,cMid-1,target);
		}
		//search in 2nd half
        if(target>=matrix[rStart+1][cMid-1] && target<=matrix[rStart][cols-1]) {
			return binarySearch(matrix,rStart,cMid+1,cols-1,target);
		}
		//search in 3rd half
        if(target<=matrix[rStart+1][cMid-1]) {
        	return binarySearch(matrix,rStart+1,0,cMid-1,target);
	
        }
		//search in 4th half
        else {
        	return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
	
        }
		
		
		
	}

}
