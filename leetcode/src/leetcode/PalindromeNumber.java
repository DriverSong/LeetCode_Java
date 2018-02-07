package leetcode;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		int temp = x;
		long reverse = 0;
		while(temp!=0) {
			
			reverse = reverse*10 + temp%10;
			temp = temp/10;
			
		}
		System.out.println(reverse);
		if(reverse == x) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] arg) {
		
		System.out.println(isPalindrome(121));
		
	}

}
