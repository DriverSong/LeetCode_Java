package leetcode;

import java.util.Arrays;

public class SearchforARange {
	public int[] searchRange(int[] nums, int target) {
		int[] out = {-1, -1};
		int length = nums.length;
		if (length == 0) return out;
		if (length == 1) {
			if (nums[0] == target) return new int[] {0,0};
			else return out;
		}
		out[0] = findBegin(nums, target);
		System.out.println(out[0]);
		out[1] = findEnd(nums, target);
		System.out.println(out[1]);
		return out;
    }

	private int findEnd(int[] nums, int target) {
		int length = nums.length;
		int left = 0;
		int right = length - 1;
		int mid = (left + right)/2;
		int end = -1;
		while(left <= right){
			mid = (left + right)/2;
			if (nums[mid] == target) {
				end = mid;
				left = mid  + 1;
			}else if(nums[mid] < target) left = mid + 1;
			else right = mid - 1;
		}
		return end;
	}

	private int findBegin(int[] nums, int target) {
		int length = nums.length;
		int left = 0;
		int right = length - 1;
		int mid = (left + right)/2;
		int begin = -1;
		while(left <= right){
			mid = (left + right)/2;
			if (nums[mid] == target) {
				begin = mid;
				right = mid  - 1;
			}else if(nums[mid] < target) left = mid + 1;
			else right = mid - 1;
		}
		return begin;
	}
	public static void main(String arg[]) {
		SearchforARange searchforARange = new SearchforARange();
		int[] in = {1,2,2,3,3,4,4,4};
		int[] out = searchforARange.searchRange(in, 5);
		System.out.println(Arrays.toString(out));
	}
}
