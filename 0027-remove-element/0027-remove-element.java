class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int k=0;//number of elements equal to val
        for(int j=0; j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
            else{
                k++;
            }
        }
        return i;
    }
}