package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TWO_SUM {
	
	public static int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i + 1);
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		int[] a = {-1,1,1,1,1,1,1};
		int[] result = twoSum(a, 0);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
