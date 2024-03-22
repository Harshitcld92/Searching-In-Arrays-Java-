package searching_in_arrays;

public class maximum_wealth_Prob_leetcode {

	public static void main(String[] args) {
		int[][] accounts= {
				{2,0},{3,5},{2,3}
	    };
		int ans=maximum_Wealth(accounts);
		System.out.println(ans);
		

	}
	static int maximum_Wealth(int[][] accounts) {
		
		//person=row and account=column
		
		int max=Integer.MIN_VALUE;
		for(int person=0;person<accounts.length;person++) {
			
			//when you start a new column, take a new sum for that row
			
			int row_sum=0;
			
			for(int account=0;account<accounts[person].length;account++) {
				row_sum+=accounts[person][account];
			}
			
			//check with main answer
			
			if(row_sum>max) {
				max=row_sum;
			}
		}
		return max;
	}

}
