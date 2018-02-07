package leetcode;

public class ClimbingStairs {
	public  int count = 0;
	public  int climbStairs(int n) {
		backTrack(n);
		return count;
    }
	private  void backTrack(int n) {
		int length = 0;
		if (length == n) {
			count ++;
			return;
		}
		if (length + 1 <= n ) {
			backTrack(n-1);
		}
		if (length + 2 <= n) {
			backTrack(n-2);
		}
	}
	
	public static void main(String[] args) {
		ClimbingStairs qjw = new ClimbingStairs();
		System.out.println(qjw.climbStairs(3));
	}
}
