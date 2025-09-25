class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] answer = new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<=length-1;i++){
            int remain = target - nums[i];
            if(map.containsKey(remain)){
                
                answer[0]=i;
                answer[1]=map.get(remain);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return answer;
    }
}