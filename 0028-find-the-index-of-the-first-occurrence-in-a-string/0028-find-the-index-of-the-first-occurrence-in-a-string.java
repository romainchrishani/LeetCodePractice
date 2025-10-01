class Solution {
    public int strStr(String haystack, String needle) {
        int length_heystack = haystack.length();
        int length_needle = needle.length();

        for(int i=0; i<=length_heystack-length_needle;i++){
            int j=0;
            while(j<length_needle && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==length_needle){
            return i;
        }
        }

        
        return -1;
    }
}