package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsofCollection {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> out = new ArrayList<>();			
        backTrack(nums, 0, nums.length,new ArrayList<Integer>(), out);
        return out;
    }

	private void backTrack(int[] nums, int begin, int end, ArrayList<Integer> arrayList, List<List<Integer>> out) {
		if (arrayList.size() == nums.length) {
			out.add(new ArrayList<>(arrayList));//Deep-Copy
		}
		for(int i = begin; i < end; i++) {
			if (arrayList.contains(nums[i])) continue; 
			arrayList.add(nums[i]);
			backTrack(nums, 0, nums.length, arrayList, out);
			arrayList.remove(arrayList.size() - 1);
		}
	}
	public static void main(String arg[]) {
		int[] in = {1,2,3};
		PermutationsofCollection myClass = new PermutationsofCollection();
		List<List<Integer>> out = myClass.permute(in);
		System.out.println(out);
	}
}
