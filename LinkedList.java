import java.io.*;

public class LinkedList {
    Node head;

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {

            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
        return list;
    }

    public static void printlist(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 2);
        list = insert(list, 5);
        list = insert(list, 7);
        list = insert(list, 9);
        list = insert(list, 8);
        printlist(list);
    }
}

//        public Node deleteDuplicates(Node A) {
//                Node.ListNode B = A;
//
//                B.next = null;
//
//                ListNode current = B;
//                while (A != null) {
//                        if (A.val != current.val) {
//                                current = current.next;
//                                current.val = A.val;
//                                current.next = null;
//                        }
//                        A = A.next;
//                }
//                return B;
//        }

//        public linklist insert(ListNode list,int data){
//            ListNode new_node=new ListNode(data);
//            if list.head
//            while(list.next!=null){
//                list=list.next;
//            }
//            list.next=new_node;
//        current=list.next;
//        current.val=data;
//        current.next=null;
//        }
//}