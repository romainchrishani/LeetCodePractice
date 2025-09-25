class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] answer = new int[2];
        for(int i=0; i<=length-2;i++){
            for(int j=i+1;j<=length-1;j++){
                if(nums[i]+nums[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        return answer;
    }
}