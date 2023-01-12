public class Main {
    public static void main(String[] args){
        BSTree<Integer> tree = new BSTree<>();

        tree.add(100);
        tree.add(5);
        tree.add(156);
        tree.add(80);
        tree.add(190);

        tree.printInOrder();
    }
}
