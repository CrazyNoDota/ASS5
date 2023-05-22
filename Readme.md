# Binary Search Tree (BST) Implementation in Java

This repository contains an implementation of a Binary Search Tree (BST) in Java. A BST is a data structure that allows for efficient insertion, deletion, and retrieval of key-value pairs.

## BST

This class represents a Binary Search Tree. It implements the `Iterable` interface, allowing for iteration over the keys in ascending order. It has the following methods:

- `put(key, val)`: Inserts a key-value pair into the BST.
- `get(key)`: Retrieves the value associated with the specified key.
- `delete(key)`: Deletes the node with the specified key from the BST.
- `inorder()`: Performs an inorder traversal of the BST, printing the keys in ascending order.

### Usage

1. Create an instance of BST:

    ```java
    BST<K, V> bst = new BST<>();
    

2. Insert key-value pairs into the BST using the put() method:

   java
   bst.put(key, value);


3. Retrieve the value associated with a key using the get() method:

   java
   V value = bst.get(key);


4. Delete a node with a specific key using the delete() method:

   java
   bst.delete(key);


5. Perform an inorder traversal of the BST and print the keys in ascending order using the inorder() method:

   java
   bst.inorder();


6. Iterate over the keys in ascending order using a for-each loop:

   java
   for (K key : bst) {
   // Process the key
   }


For more details on the implementation and usage, refer to the code and comments in the BST.java file.
```