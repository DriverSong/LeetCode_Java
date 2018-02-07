package leetcode;

public class MaximumSubarry {
	public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length > 0) {
        	 int maxALL = nums[0];
             int maxEnd = nums[0];
             for(int i = 1; i < length; i++) {
             	if (maxEnd > 0) {
     				maxEnd = maxEnd + nums[i];
     			}else {
					maxEnd = nums[i];
				}
             	if (maxEnd > maxALL) {
     				maxALL = maxEnd;
     			}
             }
             return maxALL;
		} else {
			return 0;
		}
    }
}
