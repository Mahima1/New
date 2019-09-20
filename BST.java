public class BST {
    class node {
        int data;
        node l, r;

        public node(int data) {
            this.data = data;
            this.l = null;
            this.r = null;
        }
    }

    node root;

    public BST() {
        root = null;
    }

    node insert(node temp, int data) {
        if (temp == null) {//if root == null
            temp = new node(data);
            return temp;
        }
        if (temp.data > data) {
            return insert(temp.l, data);
        }
        if (temp.data < data) {
            return insert(temp.r, data);
        }
        return temp;
    }

    node inorder(node root) {
        if (root.l != null) {
            return inorder(root.l);
        }else {
            System.out.printf("%d ", root.data);
        }

    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 2);
        tree.insert(tree.root, 22);
        tree.insert(tree.root, 32);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 8);
    }

}
