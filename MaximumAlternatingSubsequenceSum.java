/** The alternating sum of a 0-indexed array is defined as the sum of the elements at even indices minus the sum of the elements at odd indices.

    For example, the alternating sum of [4,2,5,3] is (4 + 5) - (2 + 3) = 4.

Given an array nums, return the maximum alternating sum of any subsequence of nums (after reindexing the elements of the subsequence).

A subsequence of an array is a new array generated from the original array by deleting some elements (possibly none) without changing the remaining elements' relative order. For example, [2,7,4] is a subsequence of [4,2,3,7,2,1,4] (the underlined elements), while [2,4,2] is not.
*/

class Solution {


    private long dpMemConst(int[] nums){
        long[] prev = new long[2];
        long[] curr;
        prev[0] = nums[0];
        prev[1] = 0;
        curr = prev;
        

        for (int i=1; i<nums.length; i++){
            curr = new long[2];
            for (int j=0; j<=1; j++){
                int multiplier = j==0?1:-1;
                curr[j] = Math.max(prev[j], (multiplier*nums[i]) + prev[j^1]);
            }
            prev = curr;
        }


        return Math.max(curr[0], curr[1]);
    }
   
    
    public long maxAlternatingSum(int[] nums) {
        return dpMemConst(nums);

    }
}