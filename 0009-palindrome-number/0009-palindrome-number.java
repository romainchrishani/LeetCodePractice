class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }

        int reversed = 0;
        while(x>reversed){
            reversed=reversed*10+(x%10);
            x=x/10;
        }

        if(x==reversed || x==(reversed/10)){
            return true;
        }
        return false;
    }
}