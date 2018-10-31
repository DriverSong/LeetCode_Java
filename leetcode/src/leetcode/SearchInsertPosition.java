package leetcode;

public class SearchInsertPosition {
    /**
     * 这道题需要再去了解一下二分查找的具体内容，hi与lo的更新应该按照何种规则来进行
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi){
            if(target == nums[(lo + hi)/2]) return (lo + hi)/2;
            else if(target < nums[(lo + hi)/2]) hi = (lo + hi)/2 - 1;
            else lo = (lo + hi)/2 + 1;
        }
        return lo;
    }

    public static void main(String[] args){
        SearchInsertPosition test = new SearchInsertPosition();
        int[] nums = new int[]{1, 2, 3, 4, 6};
        int target = 5;
        int result = test.searchInsert(nums, target);
        System.out.println(result);
    }
}
