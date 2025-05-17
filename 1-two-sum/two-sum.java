class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> number = new HashMap<>();

        for(int i = 0;i<=nums.length;i++){
            int complement = target - nums[i];

            if(number.containsKey(complement)){
                return new int[] {number.get(complement),i};
            }
            number.put(nums[i],i);
        } 
        return new int[] {-1,-1};
        
    }
}