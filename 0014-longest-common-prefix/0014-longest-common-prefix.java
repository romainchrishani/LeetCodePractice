class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        for(int i=0; i<first.length();i++){
            char currentLetter = first.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=currentLetter){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}