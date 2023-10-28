public class longestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = 1;
        int result = 1;

        for (int i = 1; i < nums.length; i++) {
            int max = 0;

            for (int j = 0; j < i; j++)
                if(nums[j] < nums[i])
                    max = Math.max(dp[j],max);

            dp[i] = max + 1;
            result = Math.max(dp[i], result);
        }

        return result;
    }
}
