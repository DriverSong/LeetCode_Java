package leetcode;

public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int step1 = 0;
        int step2 = 0;
        for(int i = 0; i < length ; i++) {
        	int temp;
        	if (i == 0) {
        		step1 = cost[0];
        	}else if (i == 1) {
        		step2 = cost[1];
        	}else {
        		step1 = Math.min(step1 , step2) + cost[i];
            	temp = step2;
            	step2 = step1;
            	step1 =temp;
			}
        }
        return Math.min(step1, step2);
//        int minCost = minCost(length, cost);
//        return minCost;
    }

	private int minCost(int length, int[] cost) {
		if (length == 2) {
			return Math.min(cost[0], cost[1]);
		}
		return Math.min(minCost(length-1, cost) + cost[length-1], minCost(length-2, cost) + cost[length-2]);
	}
	
	public static void main(String[] args) {
		MinCostClimbingStairs aClimbingStairs = new MinCostClimbingStairs();
		int[] input = {0,0,1,1};
		System.out.println(aClimbingStairs.minCostClimbingStairs(input));
	}
}
