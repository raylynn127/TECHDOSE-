class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Long> set = new HashSet<>();
        for(int i=0; i<nums.length-1; i++) {
            long sum = (long) (nums[i]+nums[i+1]);
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        
        return false;
    }
}