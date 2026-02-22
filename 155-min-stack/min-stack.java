class MinStack {
    int top;
    int min;
    int [] a = new int[300000];


    public MinStack() {
        top = -1;  
    }
    
    public void push(int val) {
        top++;
        a[top] = val;
        
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return a[top];
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= top;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */