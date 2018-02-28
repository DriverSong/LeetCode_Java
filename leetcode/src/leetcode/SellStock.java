package leetcode;

import java.util.Arrays;

public class SellStock {
//	----------------------my bad solution-------------------------------
//	public int maxProfit(int[] prices) {
//        if (prices.length < 2) return 0;
//        int left = 0;
//        int right = prices.length;
//        return myMaxProfit(prices, left, right);
//    }
//
//	private int myMaxProfit(int[] prices, int left, int right) {
//		if (right - left < 2) return 0;
//		if (right - left == 2) return prices[right - 1] - prices[left] > 0 ? prices[right - 1] - prices[left] : 0;
//		int mid = (left + right)/2;
//		int leftMin = arrayMin(prices, left ,mid);
//        int rightMax = arrayMax(prices, mid ,right);
//        int crossProfit = rightMax - leftMin > 0 ? rightMax - leftMin : 0;
//        int partProfit = myMaxProfit(prices, left, mid) > myMaxProfit(prices, mid, right) ? myMaxProfit(prices, left, mid) : myMaxProfit(prices, mid, right);
//        return crossProfit > partProfit ? crossProfit : partProfit;
//	}
//
//	private int arrayMax(int[] prices, int left, int right) {
//		int max = prices[left];
//		for(int i = left; i < right; i++) {
//			max = prices[i] > max ? prices[i] : max;
//		}
//		return max;
//	}
//
//	private int arrayMin(int[] prices, int left, int right ) {
//		int min = prices[left];
//		for(int i = left; i < right; i++) {
//			min = prices[i] < min ? prices[i] : min;
//		}
//		return min;
//	}
//	public static void main(String arg[]) {
//		int[] input = {7,6,4,3};
//		SellStock myClass = new SellStock();
//		System.out.println(myClass.maxProfit(input));
//	}
	
//---------------------- convert the question to maxSubArray ---------------------------
	public int maxProfit(int[] prices) {
		if (prices.length < 2) return 0;
		int[] gaps = new int[prices.length - 1];
		for(int i = 0; i < prices.length - 1; i++) {
			gaps[i] = prices[i + 1] - prices[i];
		}
		return maxSubArray(gaps);
	}

	private int maxSubArray(int[] array) {
		if (array.length < 1) return 0;
		int max = 0;
		int preMax = 0;
		for (int i = 0; i < array.length; i++) {
			max = max + array[i] > 0 ? max + array[i] : 0;
			preMax = preMax > max ? preMax : max;
		}
		return preMax;
	}
}
