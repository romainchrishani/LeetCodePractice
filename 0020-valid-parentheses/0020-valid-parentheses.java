class Solution {
    public boolean isValid(String s) {
        char[] characters = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : characters){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.pop();
                    if((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();


    }
}