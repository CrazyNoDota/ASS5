public class Main {
    public static void main(String[] args) {
        BST<Integer, String> b3 = new BST<>();
        b3.put(2, "asd");
        b3.put(1, "qwe");
        b3.put(4, "qwer");
        b3.put(3, "ierufieug");
        b3.put(10, "jalil");
        b3.put(11, "asdasd");
        b3.put(7,"123123");

//        for (Integer key : b3) {
//            String value = b3.get(key);
//            System.out.println("key is " + key + " and value is " + value);
//        }

        System.out.println(b3.sizeOfTree());

    }
}