package leetcode;

import java.util.*;

public class ThreeSum {
    /**
     * 输出可以重复
     */
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i = 0; i < nums.length; i++){
//            List<List<Integer>> subResult = twoSum(nums, i);
//            if(subResult != null) result.addAll(subResult);
//        }
//        return result;
//    }
//
//    public List<List<Integer>> twoSum(int[] nums, int index){
//        int target = - nums[index];
//        Map<Integer, Integer> map = new HashMap<>();
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i = 0; i < index; i++){
//            if(map.containsKey(target - nums[i])){
//                for(int j = 0 ; j < map.get(target - nums[i]); j++){
//                    result.add(Arrays.asList(target - nums[i], nums[i], -target));
//                }
//            }
//            if(map.containsKey(nums[i])){
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }else {
//                map.put(nums[i], 1);
//            }
//        }
//        return result;
//    }

    /**
     * 输出不重复
     * @param
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int lo = i + 1;
            int hi = nums.length - 1;
            while(lo < hi){
                if(nums[lo] + nums[hi] == target) {
                    result.add(Arrays.asList(-target, nums[lo], nums[hi]));
                    lo ++;
                    hi --;
                    while(lo < hi && nums[lo] == nums[lo - 1]) lo ++;
                    while(lo < hi && nums[hi] == nums[hi + 1]) hi --;
                }else if (nums[lo] + nums[hi] > target){
                    hi --;
//                    while(lo < hi && nums[hi] == nums[hi + 1]) hi --;
                }else{
                    lo ++;
//                    while(lo < hi && nums[lo] == nums[lo - 1]) lo ++;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1, -1 ,-1 ,0};
//        int[] nums = new int[]{-2, -2 ,-1 , 0 , 1, 2, 1};
//        int[] nums = new int[]{0, 0, 0, 0, 0};
        ThreeSum test = new ThreeSum();
        List<List<Integer>> result = test.threeSum(nums);
        System.out.println(result.toString());
    }
}
