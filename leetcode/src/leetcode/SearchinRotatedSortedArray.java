package leetcode;

public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		if (nums.length == 0) {
			return -1;
		}
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        int out = mergeFind(left, right, mid, nums, target);
        System.out.println(out);
        return out;
    }
	private int mergeFind(int left, int right, int mid, int[] nums, int target) {
		if (right - left < 2) {
			if (nums[right] == target) return right;
			else if (nums[left] == target) return left;
			else return - 1;
		}else {
			if (target <= nums[right] && target >= nums[mid]){
				return mergeFind(mid, right, (mid + right)/2, nums, target);
			}else if (target <= nums[mid] && target >= nums[left]) {
				return mergeFind(left, mid, (left + mid)/2, nums, target);
			}else {
				if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
					return mergeFind(left, mid, (left + mid)/2, nums, target);
				}else if (nums[mid] > nums[left] && nums[mid] > nums[right]) {
					return mergeFind(mid, right, (mid + right)/2, nums, target);
				}
			}
		}
		return -1;
	}
	public static void main(String arg[]) {
		int[] nums = {5,1,3};
		int target = 0;
		SearchinRotatedSortedArray newClass = new SearchinRotatedSortedArray();
		newClass.search(nums, target);
	}
}
