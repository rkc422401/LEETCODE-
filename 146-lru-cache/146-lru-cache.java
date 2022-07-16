class LRUCache {
    
    final Node head=new Node();
    final Node tail =new Node();
    Map<Integer,Node> map;
    int cap;

    public LRUCache(int capacity) {
        map=new HashMap(capacity);
        this.cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        int res=-1;
        Node node=map.get(key);
        if(node !=null){
            remove(node);
            add(node);
            res=node.val;
        }
        return res;
    }
    
    public void put(int key, int value) {
        Node node=map.get(key);
        if(node !=null){
            remove(node);
            node.val=value;
            add(node);
        }
        else{
            if(map.size()==cap){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            
            Node newnode=new Node();
            newnode.key=key;
            newnode.val=value;
            
            map.put(key,newnode);
            add(newnode);
        }
    }
    
    //to make the add methord
    public void add(Node node){
        Node temp=head.next;
        node.next=temp;
        temp.prev=node;
        head.next=node;
        node.prev=head;
    }
 
    
    //to make the remove methord
    public void remove(Node node){
        Node nodenext=node.next;
        Node nodeprev=node.prev;
        
        nodeprev.next=nodenext;
        nodenext.prev=nodeprev;
    }
    
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */