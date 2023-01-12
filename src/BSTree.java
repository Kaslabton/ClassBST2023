public class BSTree <T extends Comparable<T>> {
    private BSTNode<T> root;

    public BSTree() {
        root = null;
    }

    public void add(T data) {
        if (root == null)
            root = new BSTNode<>(data);
        else
            addRecur(root, data);
    }

    private void addRecur(BSTNode<T> root, T data) {
        //if the data is less than the root
        if (data.compareTo(root.getData()) < 0) {
            //if left does not exist
            if (root.getLeft() == null) {
                root.setLeft(new BSTNode<>(data));
            } else {
                addRecur(root.getLeft(), data);
            }
        } else {
            if (data.compareTo(root.getData()) >= 0) {
                //if left does not exist
                if (root.getRight() == null) {
                    root.setRight(new BSTNode<>(data));
                } else {
                    addRecur(root.getRight(), data);
                }
            }
        }
    }

    public void printInOrder(){
        printInOrderRecur(root);
    }

    public boolean exists (T data) {
        if(data != null){
            return true;
        }
        return false;
    }

    public void delete(T data){
        if(root.getLeft()!=data){
            
        }
    }

    public void printInOrderRecur(BSTNode<T> node){
        if(node == null)
                return;
        printInOrderRecur(node.getLeft());
        System.out.print(node + ",");
        printInOrderRecur(node.getRight());

    }
}
