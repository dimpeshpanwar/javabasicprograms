import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));
//        [3, 3], [2], [4, 4], [1], [3], [4]
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }

    private class Node{
        int key;
        int value;
        Node prv;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }

        public Node(int key, int value, Node prv, Node next) {
            this.key = key;
            this.value = value;
            this.prv = prv;
            this.next = next;
        }
    }

    private int capacity;
    private Map<Integer, Node> map;
    private Node lr;
    private Node mr;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        lr = new Node(-1, -1);
        mr = new Node(-2, -2);
        mr.prv = lr;
        lr.next = mr;
    }

    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        Node node = map.get(key);
        //move this node to mr side of DLL
        delete(node);
        makeMostRecent(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(capacity == map.size()){
            //remove lr node
            map.remove(lr.next.key);
            delete(lr.next);
        }
        if(map.containsKey(key)){
            //update node
            Node node = map.get(key);
            node.value = value;
            delete(node);
            makeMostRecent(node);
        }else{
            Node node = new Node(key,value);
            map.put(key, node);
            makeMostRecent(node);
        }
    }

    private void delete(Node node){
        node.prv.next = node.next.next;
        node.next.prv = node.prv;
    }

    private void makeMostRecent(Node node){
        Node priorMRNode = mr.prv;
        mr.prv = node;
        node.next = mr;
        node.prv = priorMRNode;
        priorMRNode.next = node;
    }
}