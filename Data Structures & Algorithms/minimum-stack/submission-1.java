class MinStack {

    Stack<Integer> s;
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public MinStack() {
        s = new Stack();
        
    }
    
    public void push(int val) {
        System.out.println("Push"+ val);
        pq.add(val);
        s.push(val);
        
    }
    
    public void pop() {
        System.out.println("pop"+ s.peek());
        pq.remove(s.peek());
        s.pop();
    }
    
    public int top() {
        return(s.peek());
        
    }
    
    public int getMin() {
        // Stack<Integer> q = new Stack<>();
        // int mini = Integer.MAX_VALUE;
        // while(!s.isEmpty())
        // {
        //     int curr = s.peek();
        //     mini = Math.min(curr, mini);
        //     q.push(s.pop());
        // }     
        // while(!q.isEmpty())
        // {
        //     s.push(q.pop());
        // }
        return pq.peek();        
    }
}
