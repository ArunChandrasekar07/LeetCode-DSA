class MinStack {
    Stack<Integer> minstc=new Stack<>();
    Stack<Integer> stc=new Stack<>();
    public MinStack() {
    
    }
    public void push(int value) {
        if(minstc.isEmpty()){
            minstc.push(value);
        }
        else{
            minstc.push(Math.min(value,minstc.peek()));
        }
        stc.push(value);
    }
    
    public void pop() {
        minstc.pop();
        stc.pop();
    }
    
    public int top() {
        return stc.peek();
    }
    
    public int getMin() {
        return minstc.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */