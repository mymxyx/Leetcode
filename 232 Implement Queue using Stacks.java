class MyQueue {
    private Stack<Integer> q = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        q.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> reverseq = new Stack<Integer>();
        while(!q.isEmpty()){
            reverseq.push(q.pop());
        }
        if(!reverseq.isEmpty()){
            reverseq.pop();
        }
        while(!reverseq.isEmpty()){
            q.push(reverseq.pop());
        }
    }

    // Get the front element.
    public int peek() {
        int peek = 0;
        Stack<Integer> reverseq = new Stack<Integer>();
        while(!q.isEmpty()){
            reverseq.push(q.pop());
        }
        if(!reverseq.isEmpty()){
            peek = reverseq.peek();
        }
        while(!reverseq.isEmpty()){
            q.push(reverseq.pop());
        }
        return peek;
    }

    // Return whether the queue is empty.
    public boolean empty() {
       
        return q.isEmpty();
    }
}
