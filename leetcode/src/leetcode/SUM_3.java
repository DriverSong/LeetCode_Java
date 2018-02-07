package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SUM_3 {
	
	public static List<List<Integer>> threeSum(int[] nums) {
		
//		List<List<Integer>> outlist = new ArrayList<List<Integer>>() ;
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for(int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if(map.containsKey(-nums[i] - nums[j])) {
//					List<Integer> temp = new ArrayList<Integer>();
//					temp.add(nums[i]);
//					temp.add(nums[j]);
//					temp.add(-nums[i] - nums[j]);
//				}
//				map.put(nums[j], j);
//			}
//			map.clear();
//		}
		
	
	
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
////        List<Integer> temp = new ArrayList<Integer>();
//        int index;
//        for (int i = 0; i < nums.length; i++) {
//			map.put(nums[i], i);
//		}
//        System.out.println(map);
//        for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if(map.get(0-nums[i]-nums[j]) != null) {
//					index =map.get(0-nums[i]-nums[j]);
////					System.out.println(map.get(-1));
//					if (index > j) {
//						List<Integer> temp = new ArrayList<Integer>();
//						temp.add(nums[i]);
////						System.out.println(nums[i]);
//						temp.add(nums[j]);
////						System.out.println(nums[j]);
//						temp.add(0-nums[i]-nums[j]);
////						System.out.println(0-nums[i]-nums[j]);
//						list.add(temp);
////						System.out.println(temp);
////						System.out.println(list);
////						temp.clear();
////						System.out.println(list);
//					}
//				}
//			}
//		}
////        System.out.println(list);
//        return list;
        
    }
	public static void main(String[] args) {
		int[] a = {-1,0,1,2,-1,-4};
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		System.out.println(a[5]);
		List<List<Integer>> list = threeSum(a);
//		if (list.get(0) != list.get(2)) {
//			System.out.println(true);
//		}
//		System.out.println();
//		System.out.println(list);
//		System.out.println(list.get(1));
	}

}
