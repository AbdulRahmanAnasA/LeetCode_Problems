class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int sub = 1 << n;  // This is 2^n, representing all possible subsets.

        for (int k = 0; k < sub; k++) {  // Iterate over all numbers from 0 to 2^n - 1
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                // Check if the ith bit of k is set (1), meaning include nums[i] in the subset
                if ((k & (1 << i)) != 0) {  // Use proper parentheses
                    result.add(nums[i]);
                }
            }
            ans.add(result);
        }

        return ans;
    }
}
