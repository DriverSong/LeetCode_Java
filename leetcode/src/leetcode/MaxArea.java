package leetcode;

public class MaxArea {
	
	public static int maxArea(int[] height) {
	int left = 0;
	int right = height.length - 1;
	int maxsize = 0;
	while (left < right) {
		maxsize = Math.max(maxsize, Math.min(height[left], height[right])*(right - left));
		if (height[left]>height[right]) {
			right--;
		}else {
			left++;
		}
	}
	return maxsize;
	}
//		int size = height.length;
//		int left = 0;
//		int right = size-1;
//		int left_max = 0;
//		int right_max = size-1;
//		
//		int container = (right - left)*Math.min(height[left], height[right]);
//		int temp1 = 0;
//		int temp2 = 0;
//		int temp3 = 0;
//		if (size == 2) {
//			return (right - left)*Math.min(height[left], height[right]);
//		}else {
//			while(right >= left) {
//				
//				if(height[left] <= height[left_max]) left++;
//				if(height[right] <= height[right_max]) right--;
//				if (height[left] >height[left_max] || height[right] > height[right_max]) {
//					//左侧找到更大的边
//					if(height[left] >height[left_max] && height[right] <= height[right_max]) {
//						//left右侧容积更大，则改变右侧部分为初始部分
//						if ( (right_max - left)*Math.min(height[left], height[right_max]) > container) {
//							container = (right_max - left)*Math.min(height[left], height[right_max]);
//							left_max = left;
//							right = right_max;
//						}else {//原容积较大，则移动left或right中的一个
//							
//							if (Math.min(height[left], height[left+1]) <= Math.min(height[right], height[right-1])) {
//								left = left + 1;
//							}else {
//								right = right - 1;
//							}
//							
//						}
//					//右侧找到更大的边
//					}else if (height[left] <= height[left_max] && height[right] > height[right_max]) {
//						//若左侧容积较大，则更新各指标
//						if ( (right - left_max)*Math.min(height[left_max], height[right]) > container) {
//							container = (right - left_max)*Math.min(height[left_max], height[right]);
//							right_max = right;
//							left = left_max;
//						}else {
//							//若原容积较大，则改变left或right中的一个
//							if (Math.min(height[left], height[left+1]) <= Math.min(height[right], height[right-1])) {
//								left = left + 1;
//							}else {
//								right = right - 1;
//							}
//							
//						}
//						
//					}else {
//						
//						temp1 = (right_max - left)*Math.min(height[left], height[right_max]);
//						temp2 = (right - left_max)*Math.min(height[left_max], height[right]);
//						temp3 = (right - left)*Math.min(height[left], height[right]);
//						if (temp1>= temp2 && temp1 >= temp3 && temp1 > container) {
//							container = temp1;
//							left_max = left;
//							right = right_max;
//						}else if (temp2>= temp1 && temp2 >= temp3 && temp2 > container) {
//							container = temp2;
//							right_max = right;
//							left = left_max;
//						}else if (temp3>= temp2 && temp3 >= temp1 && temp3 > container) {
//							container = temp3;
//							left_max = left;
//							right_max = right;
//						}else {
//							if(Math.min(height[left], height[left+1]) <= Math.min(height[right-1], height[right])) {
//							right =right_max;int size = height.length;
//		int left = 0;
//		int right = size-1;
//		int left_max = 0;
//		int right_max = size-1;
//		
//		int container = (right - left)*Math.min(height[left], height[right]);
//		int temp1 = 0;
//		int temp2 = 0;
//		int temp3 = 0;
//		if (size == 2) {
//			return (right - left)*Math.min(height[left], height[right]);
//		}else {
//			while(right >= left) {
//				
//				if(height[left] <= height[left_max]) left++;
//				if(height[right] <= height[right_max]) right--;
//				if (height[left] >height[left_max] || height[right] > height[right_max]) {
//					//左侧找到更大的边
//					if(height[left] >height[left_max] && height[right] <= height[right_max]) {
//						//left右侧容积更大，则改变右侧部分为初始部分
//						if ( (right_max - left)*Math.min(height[left], height[right_max]) > container) {
//							container = (right_max - left)*Math.min(height[left], height[right_max]);
//							left_max = left;
//							right = right_max;
//						}else {//原容积较大，则移动left或right中的一个
//							
//							if (Math.min(height[left], height[left+1]) <= Math.min(height[right], height[right-1])) {
//								left = left + 1;
//							}else {
//								right = right - 1;
//							}
//							
//						}
//					//右侧找到更大的边
//					}else if (height[left] <= height[left_max] && height[right] > height[right_max]) {
//						//若左侧容积较大，则更新各指标
//						if ( (right - left_max)*Math.min(height[left_max], height[right]) > container) {
//							container = (right - left_max)*Math.min(height[left_max], height[right]);
//							right_max = right;
//							left = left_max;
//						}else {
//							//若原容积较大，则改变left或right中的一个
//							if (Math.min(height[left], height[left+1]) <= Math.min(height[right], height[right-1])) {
//								left = left + 1;
//							}else {
//								right = right - 1;
//							}
//							
//						}
//						
//					}else {
//						
//						temp1 = (right_max - left)*Math.min(height[left], height[right_max]);
//						temp2 = (right - left_max)*Math.min(height[left_max], height[right]);
//						temp3 = (right - left)*Math.min(height[left], height[right]);
//						if (temp1>= temp2 && temp1 >= temp3 && temp1 > container) {
//							container = temp1;
//							left_max = left;
//							right = right_max;
//						}else if (temp2>= temp1 && temp2 >= temp3 && temp2 > container) {
//							container = temp2;
//							right_max = right;
//							left = left_max;
//						}else if (temp3>= temp2 && temp3 >= temp1 && temp3 > container) {
//							container = temp3;
//							left_max = left;
//							right_max = right;
//						}else {
//							if(Math.min(height[left], height[left+1]) <= Math.min(height[right-1], height[right])) {
//							right =right_max;
//							left = left+1;
//							}else if (Math.min(height[left], height[left+1]) > Math.min(height[right-1], height[right])) {
//								left = left_max;
//								right = right - 1;
//							}
//						}
//						
//					}
//				}
//				if(left==right) {
//					temp1 = (right_max - left)*Math.min(height[left], height[right_max]);
//					temp2 = (right - left_max)*Math.min(height[left_max], height[right]);
//					if (temp1>= temp2 && temp1 > container) {
//						container = temp1;
//						left_max = left;
//					}else if (temp2 >= temp1 && temp2 > container) {
//						container = temp2;
//						right_max = right;
//					}
//					break;
//				}
//			}
//		}
//		
//		return container;
//	}
//							left = left+1;
//							}else if (Math.min(height[left], height[left+1]) > Math.min(height[right-1], height[right])) {
//								left = left_max;
//								right = right - 1;
//							}
//						}
//						
//					}
//				}
//				if(left==right) {
//					temp1 = (right_max - left)*Math.min(height[left], height[right_max]);
//					temp2 = (right - left_max)*Math.min(height[left_max], height[right]);
//					if (temp1>= temp2 && temp1 > container) {
//						container = temp1;
//						left_max = left;
//					}else if (temp2 >= temp1 && temp2 > container) {
//						container = temp2;
//						right_max = right;
//					}
//					break;
//				}
//			}
//		}
//		
//		return container;
//	}
	
//	public static int maxArea(int[] height) {
//		
//		int size = height.length;
//		int left = 0;
//		int right = size-1;
//		int left_max = 0;
//		int right_max = size-1;
//		
//		int container = (right - left)*Math.min(height[left], height[right]);
//		int temp1 = 0;
//		int temp2 = 0;
//		int temp3 = 0;
//
//		while(right >= left) { 
//			
//			if(height[left_max]>=height[left]) {
//				left ++;
//			}
//			if (height[right_max]>=height[right]) {
//				right--;
//			}
//			if (height[left_max]<height[left] && height[right_max]<height[right] ) {
//				
//				temp1 = (right_max - left)*Math.min(height[left], height[right_max]);
//				temp2 = (right - left_max)*Math.min(height[left_max], height[right]);
//				temp3 = (right - left)*Math.min(height[left], height[right]);
//				if (temp1>= temp2 && temp1 >= temp3 && temp1 > container) {
//					container = temp1;
//					left_max = left;
//					right = right_max;
//				}else if (temp2>= temp1 && temp2 >= temp3 && temp2 > container) {
//					container = temp2;
//					right_max = right;
//					left = left_max;
//				}else if (temp3>= temp2 && temp3 >= temp1 && temp3 > container) {
//					container = temp3;
//					left_max = left;
//					right_max = right;
//				}else {
//					if(Math.min(height[left], height[left+1]) <= Math.min(height[right-1], height[right])) {
//					right =right_max;
//					left = left+1;
//				}else if (Math.min(height[left], height[left+1]) > Math.min(height[right-1], height[right])) {
//					left = left_max;
//					right = right - 1;
//				}
//				}
//			}
//			if(left==right) {
//				temp1 = (right_max - left)*Math.min(height[left], height[right_max]);
//				temp2 = (right - left_max)*Math.min(height[left_max], height[right]);
//				if (temp1>= temp2 && temp1 > container) {
//					container = temp1;
//					left_max = left;
//				}else if (temp2 >= temp1 && temp2 > container) {
//					container = temp2;
//					right_max = right;
//				}
//				break;
//			}
//		}
//		return container;
//    }
	public static void main(String[] arg) {
		System.out.println(1);
		int[] array = {159,157,139,51,98,71,4,125,48,125,64,4,105,79,136,169,113,13,95,88,190,5,148,17,152,20,196,141,35,42,188,147,199,127,198,49,150,154,175,199,80,191,3,137,22,92,58,87,57,153,175,199,110,75,16,62,96,12,3,83,55,144,30,6,23,28,56,174,183,183,173,15,126,128,104,148,172,163,35,181,68,162,181,179,37,197,193,85,10,197,169,17,141,199,175,164,180,183,90,115};
		int a = maxArea(array);
		System.out.println(a);
	}
}
