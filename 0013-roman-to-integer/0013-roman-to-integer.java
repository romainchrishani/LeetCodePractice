class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanToInteger = new HashMap<>();

        romanToInteger.put('I',1);
        romanToInteger.put('V',5);
        romanToInteger.put('X',10);
        romanToInteger.put('L',50);
        romanToInteger.put('C',100);
        romanToInteger.put('D',500);
        romanToInteger.put('M',1000);

        

        int number = 0;
        int previous = 0;

        for(int i = s.length()-1;i>=0;i--){
            int current = romanToInteger.get(s.charAt(i));
            
            if(current>=previous){
                number=number+current;
            }
            else{
                number=number-current;
            }
            previous=current;
            
        }
        return number;

    }
}