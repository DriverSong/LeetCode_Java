package leetcode;

public class SortColors {
    public void sortColors(int[] nums){
        int left = -1, right = nums.length;
        for(int i = 0; i < right; i++){
            if(nums[i] == 0){
                left ++;
                nums[i] = nums[left];
                nums[left] = 0;
            }else if(nums[i] == 2){
                right --;
                nums[i] = nums[right];
                nums[right] = 2;
                i--;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,2,1,1,0,0};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
    }
}
