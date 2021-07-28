class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        int n= s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                stack.push(i);
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty())
                    stack.pop();
                else
                    sb.setCharAt(i,'*');
            }
        }
        while(!stack.isEmpty())
            sb.setCharAt(stack.pop(),'*');
        return sb.toString().replaceAll("\\*","");
    }
}