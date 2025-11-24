class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> RomanToInteger = new HashMap<>();

        RomanToInteger.put('I',1);
        RomanToInteger.put('V',5);
        RomanToInteger.put('X',10);
        RomanToInteger.put('L',50);
        RomanToInteger.put('C',100);
        RomanToInteger.put('D',500);
        RomanToInteger.put('M',1000);

        int previous = 0;
        int number = 0;

        for(int i=s.length()-1;i>=0;i--){

            int Current = RomanToInteger.get(s.charAt(i));
            
            
            if(Current >= previous){
                number = number + Current; 
            }
            else{
                number = number - Current;
            }
            previous = Current;
        }
        return number;
    }
}