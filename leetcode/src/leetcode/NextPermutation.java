package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
			return;
		}
        int left = length - 1;
        int right = length - 1;
        for(int i = length - 1; i > 0; i--) {
        	if (nums[i] <= nums[i - 1]) {
        		continue;
			}else {
				left = i -1;
				for(int j = left + 1; j < length; j++) {
					if (nums[left] < nums[j]) {
						right = j;
					}else {
						break;
					}
				}
				System.out.println(left);
				System.out.println(right);
				nums[left] ^= nums[right];
				nums[right] ^= nums[left];
				nums[left] ^= nums[right];
//				Arrays.sort(nums, left + 1, length);
				reverseArrays(nums, left + 1, length - 1);
				return;
			}
        }
        Arrays.sort(nums);
        return;
    }
	private void reverseArrays(int[] nums, int left, int right) {
		for(int i = left, j = right; i < j; i++, j--) {
			nums[i] ^= nums[j];
			nums[j] ^= nums[i];
			nums[i] ^= nums[j];
		}
	}
	public static void main(String arg[]) {
		int[] nums = {5,4,7,5,3,2};
		NextPermutation nextPermutation = new NextPermutation();
		nextPermutation.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
}
