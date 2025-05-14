class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int lastIndex = nums.length - 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= lastIndex) {
                return true;
            }
        }
        
        return maxReach >= lastIndex;
    }
}