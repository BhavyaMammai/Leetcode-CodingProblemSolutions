class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=1;
        int[] result = new int[2];
        for(i=0;i<=nums.length;i++){
            for(j=i+1;j<nums.length;j++){
             if(nums[i]+nums[j]==target){
                result[0] =i;   
                result[1] =j;
                return result;
              }
            
            }
            
        }
        return new int[]{-1, -1};
    }

}
