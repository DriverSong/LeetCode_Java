package leetcode;

public class MajorityElement {
	/*
	 * 此题可以想到两个解法：
	 * 		1.直接遍历一遍数组，然后映射到HashMap中: Key = nums[i]; value = count；
	 * 			遍历结束后，返回Map中的value最大元素所对应的key即可。
	 *				时间复杂度为O(n)，空间复杂度为O(n)。
	 * 		2.由于本题指明主元素的个数是大于1/2*n的，所以可以考虑如下思路：
	 * 			我们只需要在遍历结束后找到一个数，它的出现个数比所有与它不相同的数的个数总和都要多，
	 * 			就能找到主元素。
	 * 			方法为声明count进行计数，当count==0时，keynum即为数组的下一个元素；
	 * 																	当count!=0时，若下一个元素与keynum相同，则count++；
	 * 																								   若下一个元素与keynum不同，则count--；
	 * 			这样，不论何时，遍历结束后，keynum都为主元素。
	 */
	
    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        int keynum = nums[0];
        int count = 1;
        for(int i = 1; i < length; i++) {
        	int temp = nums[i];
        	if (count == 0) {
				keynum = temp;
				count ++;
			}else if (count > 0) {
				if (temp == keynum) {
					count ++;
				}else {
					count --;
				}
			}
        }
        return keynum;
    }
}
