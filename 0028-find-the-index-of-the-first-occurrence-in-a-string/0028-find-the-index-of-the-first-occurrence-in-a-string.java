class Solution {
    public int strStr(String haystack, String needle) {
        int length1 = haystack.length();
        int length2 = needle.length();

        

        for(int i=0;i<=length1-length2;i++){
            int j;
            for( j=0; j<length2;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            } 
                    if(j==length2){
            return i;
        }      
        }
        return -1;
    }
}