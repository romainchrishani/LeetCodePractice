class Solution {
    public String addBinary(String a, String b) {
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        int carry =0;
        StringBuilder result = new StringBuilder();

        while(indexA >=0 || indexB >=0 || carry>0){
            int sum = carry;

            if(indexA >= 0){
                sum=sum+a.charAt(indexA--)-'0';
            }
            if(indexB >= 0){
                sum=sum+b.charAt(indexB--)-'0';
            } 

            carry=sum/2;
            result = result.append(sum%2);

        }
        return result.reverse().toString();
    }
}