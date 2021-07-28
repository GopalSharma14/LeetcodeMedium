class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            if(asteroids[i]<0){
               while(!stack.isEmpty() && stack.peek()>0 && Math.abs(asteroids[i])>stack.peek()){
                   stack.pop();
               }
                System.out.println("--");
                if(stack.isEmpty() ||stack.peek() < 0 ){
                    stack.push(asteroids[i]);
                }
                else if(asteroids[i] + stack.peek() == 0){
                    stack.pop();
                }
            }
            else{
                stack.push(asteroids[i]);
            }
        }
        int[] arr = new int[stack.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        return arr;
        
    }
}