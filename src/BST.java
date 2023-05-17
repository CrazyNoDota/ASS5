public class BST <K extends Comparable<K>, V>{
    private Node root;
    private class Node{
        private K key;
        private V val;
        private Node left, right;
        public Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }
    public void put(K key, V val){
        root = put(root, key, val);
    }

    private Node put(Node node, K key, V val) {
        if (node == null) {
            return new Node(key, val); // creating new Node and placing in empty position
        }

        int cmp = key.compareTo(node.key); // comparing generic types
        if (cmp < 0) {
            node.left = put(node.left, key, val); // left sub tree
        } else if (cmp > 0) {
            node.right = put(node.right, key, val);// right sub t3
        } else {
            node.val = val; // if we have such key rewrite
        }
        return node;
    }

    public V get(K key){
        return null;
    }
    public void delete(K key){

    }
    public Iterable<K> iterator(){
        return null;
    }
}
