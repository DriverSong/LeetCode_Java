package leetcode;

public class HouseRobber {
    public int rob(int[] nums) {
    	/*
    	 * 动归实现：
    	 * 遍历数组，前i个房子可以偷到的最多的金钱max[i]，
    	 * 等于前i-2个房子可以偷到的最多的钱max[i-2] + 第i座房子可以偷到的前nums[i]
    	 * 与前i-1座房子可以偷到的最多的钱max[i - 1]
    	 * 中的较大值。
    	 */
    	
        int length = nums.length;
        if (length == 0) return 0;
        int[] max = new int[length + 2];
        max[0] = 0;
        max[1] = 0;
        for(int i = 0; i < length; i++) {
        	max[i + 2] = (max[i] + nums[i]) > max[i + 1] ? (max[i] + nums[i]) : max[i + 1];
        }
        return max[length + 1];
    }
}
