package leetcode;

public class JumpGame {
	public boolean canJump(int[] nums) {
        int length = nums.length;
        if (length <= 1) return true;
        for(int i = length - 2; i >= 0; i--) {
        	if (nums[i] == 0) {
        		if (i == 0) {
					return false;
				}
				for(int j = 0; j < i; j++) {
					if (nums[j] > (i - j)) {
						if (j == 0) {
							return true;
						}else {
							i = j;
							break;
						}
					}
					if (j == i - 1) {
						return false;
					}
				}
			}
        }
        return true;
    }
	public static void main(String arg[]) {
		int[] nums = {2,5,0,0};
		int[] nums1 = {4,2,0,4};
		JumpGame newClass = new JumpGame();
		System.out.println(newClass.canJump(nums));
		System.out.println(newClass.canJump(nums1));
	}
}
