class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int i=1;
        int k=1;

        for(int j=1; j<length; j++){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                i++;
                k++;
            }
        }
        return k;
    }
}