package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
//	public List<List<Integer>> combinationSum(int[] nums, int target) {
//	    List<List<Integer>> list = new ArrayList<>();
//	    Arrays.sort(nums);
//	    backtrack(list, new ArrayList<>(), nums, target, 0);
//	    System.out.println(list);
//	    return list;
//	}
//	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
//	    if(remain < 0) return;
//	    else if(remain == 0) list.add(new ArrayList<>(tempList));
//	    else{ 
//	        for(int i = start; i < nums.length; i++){
//	            tempList.add(nums[i]);
//	            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
//	            tempList.remove(tempList.size() - 1);
//	        }
//	    }
//	}
	//回溯法
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> out = new ArrayList<>();
		backTrack(out, candidates, new ArrayList<>(), 0, target);
		System.out.println(out);
		return out;
    }
	private void backTrack(List<List<Integer>> out, int[] candidates, List<Integer> tempList, int num, int target) {
		if (target < 0) return;
		else if (target == 0) {
			out.add(new ArrayList<>(tempList));
		}else {
			for(int i = num; i < candidates.length; i++) {
				tempList.add(candidates[i]);
				backTrack(out, candidates, tempList, i, target - candidates[i]);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
	public static void main(String arg[]) {
		CombinationSum newClass = new CombinationSum();
		int[] candidates = {1,2,3,4,5,6};
		int target = 7;
		newClass.combinationSum(candidates, target);
	}
}
