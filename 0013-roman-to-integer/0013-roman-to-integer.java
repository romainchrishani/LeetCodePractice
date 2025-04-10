class Solution {
    public int romanToInt(String s) {
        int length = s.length();

        HashMap<Character,Integer> romanToInteger = new HashMap<>();

        romanToInteger.put('I',1);
        romanToInteger.put('V',5);
        romanToInteger.put('X',10);
        romanToInteger.put('L',50);
        romanToInteger.put('C',100);
        romanToInteger.put('D',500);
        romanToInteger.put('M',1000);

        int value = 0;

        for(int i=0; i<length;i++){
            int currentValue =  romanToInteger.get(s.charAt(i));
            if(i<length-1 && currentValue<romanToInteger.get(s.charAt(i+1))){
                value=value-currentValue;
            }
            else{
                value=value+currentValue;
            }
        }
        return value;
    }
}