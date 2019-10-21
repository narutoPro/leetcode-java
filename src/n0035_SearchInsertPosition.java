/**
 * @author: chende
 * @date: 2019/10/21 21:48
 * @description:
 * @link https://leetcode.com/problems/search-insert-position/
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
   You may assume no duplicates in the array.

 */
public class n0035_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
       if(nums==null || nums.length==0) return 0;
       for(int i=0;i<nums.length;i++){
           if (nums[i]==target) {
               return i;
           }
           else if (target < nums[i]) {
               return i;}
           else {

           };
       }
       return nums.length;
    }
    //二分查找  star 和 end  和mid变化

    public int binSearchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 0) {
            return 0;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;

    }

}
