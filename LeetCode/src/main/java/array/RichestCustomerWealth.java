//Leetcode problem link: https://leetcode.com/problems/richest-customer-wealth/submissions/
package array;

public class RichestCustomerWealth {

	public static void main(String args[]) {
	      int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
            System.out.println(new RichestCustomerWealth().maximumWealth(accounts));
      
	}
	public int maximumWealth(int[][] accounts) {
		int max=0;
        for (int customer=0; customer<accounts.length; customer++) {
        	int current=0;
        	for (int accountnum = 0; accountnum<accounts[customer].length;accountnum++) {
        		current=current+accounts[customer][accountnum];
        	}
        	if (current>max) {
        		max=current;
        	}
        }
        return max;
    }
}
