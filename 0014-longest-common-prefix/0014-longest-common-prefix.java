class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;

        StringBuilder prefix = new StringBuilder();

        if(length == 0){
            return "";
        }

        for(int i=0;;i++){
            if(i>=strs[0].length()){
                break;
            }
            for(int j=1;j<length;j++){
                if((i>=strs[j].length())||
                (strs[0].charAt(i)!=strs[j].charAt(i))
                ){
                    return prefix.toString();
                }

            }
                            prefix.append(strs[0].charAt(i));
        }
        return prefix.toString();
    }
}