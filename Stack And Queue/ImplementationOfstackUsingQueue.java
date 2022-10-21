class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>(); //creating a queue
    }
    
    public void push(int x) {
        q.add(x); //add is a operation of queue
        for(int i=0;i<q.size()-1;i++){
            q.add(q.poll()); //poll is a operation of queue to remove first element
        }
    }
    
    public int pop() {
        return q.poll(); //poll is a operation of queue to remove first element
    }
    
    public int top() {
        return q.peek(); //peek is a operation of queue to get first element
    }
    
    public boolean empty() {
        return q.isEmpty(); //isEmpty is a operation of queue
    }
}
