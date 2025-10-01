class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;  // edge case

        int j = 1; // index for placing next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {  // found new unique element
                nums[j] = nums[i];
                j++;
            }
        }

        return j; // number of unique elements
    }
}
