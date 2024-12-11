class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            // Remove elements from deque which are smaller than the current element
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.removeLast();
            }
            
            // Add current element at the back of the deque
            dq.addLast(i);
            
            // Remove elements that are out of the current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }
            
            // Record the maximum for the current window
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        
        return ans;
    }
}
