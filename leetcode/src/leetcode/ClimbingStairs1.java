package leetcode;

public class ClimbingStairs1 {
	public  int climbStairs(int n) {
		int num1 = 1;
		int num2 = 2;
		if (n == 0) {
			return 0;
		}else if (n == 1) {
			return num1;
		}else if (n == 2) {
			return num2;
		}else {
			for(int i=2; i < n; i++) {
				int temp = num2 + num1;
				num1 = num2;
				num2 = temp;
			}
			return num2;
		}
    }
	
	public static void main(String[] args) {
		ClimbingStairs1 qjw = new ClimbingStairs1();
		System.out.println(qjw.climbStairs(3));
	}
}
