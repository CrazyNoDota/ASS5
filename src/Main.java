public class Main {
    public static void main(String[] args) {
        BST b3 = new BST();
        b3.put(2,"asd");
        b3.put(1, "qwe");
        b3.put(4, "qwer");
        b3.put(3, "ierufieug");
        b3.put(5, "jalil");

        b3.inorder();
        System.out.println();
        b3.delete(2);
        b3.inorder();

    }
}