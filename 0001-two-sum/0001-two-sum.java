class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outputArray = new int[2];

        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    outputArray[0]=i;
                    outputArray[1]=j;
                }
            }
        }
        return outputArray;
    }
}