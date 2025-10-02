class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int string_length = s.length();
        int i = string_length-1;

       while(i>=0 && s.charAt(i)==' '){
        i--;
       }

       while(i>=0 && s.charAt(i)!=' '){
        i--;
        length++;
       }

       return length;
    }
}