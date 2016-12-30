public class LRUCache {
    private class Node{
        Node pre;
        Node post;
        int key;
        int value;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
            this.pre = null;
            this.post = null;
        }
    }
    private int capacity;
    private HashMap<Integer,Node> map = new HashMap<Integer,Node>();
    private Node head = new Node(-1,-1);
    private Node tail = new Node(-1,-1);
    
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        tail.pre = head;
        head.post = tail;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node current = map.get(key);
        current.pre.post = current.post;
        current.post.pre = current.pre;
        
     
        head.post.pre = current;
        current.post = head.post;
        head.post = current;
        current.pre = head;
        
        return map.get(key).value;
    }
    
    public void set(int key, int value) {
        Node newNode = new Node(key,value);
        if(get(key) != -1){
            map.get(key).value = value;
            return;
        }
        
        map.put(key,newNode);
        if(map.size() >capacity){
            map.remove(tail.pre.key);
            tail.pre.pre.post = tail;
            tail.pre = tail.pre.pre;
        }
        
        head.post.pre = newNode;
        newNode.post = head.post;
        head.post = newNode;
        newNode.pre = head;
        
        
    }
}
