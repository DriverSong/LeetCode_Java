package leetcode;

import java.awt.RenderingHints;

public class SearchinRotatedSortedArray {
	/*
	 * my own solution, it is complicated.
	 * Firstly, binarySearch can be achieved by using while block;
	 * Secondly, my binarySearch has something wrong, I should observe if the nums[mid] is equal to the target, 
	 *                 than move on to compare them and determine which one is larger.
	 * Thirdly, I think I should not focus just on the direct way to the correct answer. There may be some sub-action that can brief the question 
	 *                 and don't improve the time complex of the question.
	 */
//	public int search(int[] nums, int target) {
//		if (nums.length == 0) {
//			return -1;
//		}
//        int left = 0;
//        int right = nums.length - 1;
//        int mid = (left + right) / 2;
//        int out = mergeFind(left, right, mid, nums, target);
//        System.out.println(out);
//        return out;
//    }
//	private int mergeFind(int left, int right, int mid, int[] nums, int target) {
//		if (right - left < 2) {
//			if (nums[right] == target) return right;
//			else if (nums[left] == target) return left;
//			else return - 1;
//		}else {
//			if (target <= nums[right] && target >= nums[mid]){
//				return mergeFind(mid, right, (mid + right)/2, nums, target);
//			}else if (target <= nums[mid] && target >= nums[left]) {
//				return mergeFind(left, mid, (left + mid)/2, nums, target);
//			}else {
//				if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
//					return mergeFind(left, mid, (left + mid)/2, nums, target);
//				}else if (nums[mid] > nums[left] && nums[mid] > nums[right]) {
//					return mergeFind(mid, right, (mid + right)/2, nums, target);
//				}
//			}
//		}
//		return -1;
//	}
	public int search(int[] nums, int target) {
		int N = nums.length;
		if (N == 0) return -1;
		int minIdx = findMin(nums);
		if (target == nums[minIdx]) return minIdx;
		if (target == nums[N - 1]) return N - 1;
		int left = (target < nums[N - 1]) ? minIdx : 0;
		int right = (target > nums[N - 1]) ? minIdx : N - 1;
		while(left <= right) {
			int mid = (left + right)/2;
			if (nums[mid] == target) {
				System.out.println(mid);
				return mid;
			}else if (nums[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		System.out.println(-1);
		return -1;
	}
	private int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int mid = (left + right)/2;
		while(left < right) {
			mid = (left + right)/2;
			if(nums[mid] < nums[right]) right = mid;
			else left = mid + 1;
		}
		System.out.println(left);
		return left;
	}
	public static void main(String arg[]) {
		int[] nums = {5,1,3};
		int target = 1;
		SearchinRotatedSortedArray newClass = new SearchinRotatedSortedArray();
		newClass.search(nums, target);
	}
}
