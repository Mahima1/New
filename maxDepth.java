class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.right = this.left = null;
    }
}

class BinaryTree {


    Node root;

    public Node makeBST(Node root, int data) {
        Node node = root;
//        if (root == null) {
//            root = new Node(data);
//            return root;
//        }
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.data) {
            return makeBST(node.left, data);

        }

        return makeBST(node.right, data);

//        if(node.right==null){
//            node.right =new Node(data);
//            return node.right;
//        }
//        return node;
    }

    public int maxDepth(Node node) {

        if (node == null) {
            return 0;
        }

        int ldepth = maxDepth(node.left);
        int rdepth = maxDepth(node.right);

        if (ldepth > rdepth) {
            return (ldepth + 1);
        } else {
            return (rdepth + 1);
        }
    }
}

public class maxDepth {


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(10);



    }
}
