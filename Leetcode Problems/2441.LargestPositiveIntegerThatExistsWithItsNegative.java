class Solution{
  public int findMaxK(int[] nums){
    Arrays.sort(nums);
    int i=0;
    int j=nums.length-1;
    while(i<j){
      if(nums[j]>-1*nums[i]){
        j--;
      }
      else if(nums[j]<-1*nums[i]){
        i++;
      }
      else{
        return nums[j];
      }
    }
    return -1;
  }
}
