package Seminar2;

import Seminar2.Singly.LinkedList;
import Seminar2.Singly.ListNode;

public class Ushtrimi2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        ListNode<Integer> node1 = new ListNode<>(3);

        list.zeroth().current.next = node1;
        node1.next = new ListNode<>(3);
        node1.next.next = new ListNode<>(3);
        node1.next.next.next = new ListNode<>(3);
        node1.next.next.next.next = new ListNode<>(3);
        node1.next.next.next.next.next = new ListNode<>(3);
        node1.next.next.next.next.next.next = new ListNode<>(3);
        node1.next.next.next.next.next.next.next = new ListNode<>(3);
        node1.next.next.next.next.next.next.next.next = new ListNode<>(3);

        int size = linkedListSize(node1);
        System.out.println(size);
    }

    private static int linkedListSize(ListNode<Integer> root){
        if (root == null){
            return 0;
        }

        return linkedListSize(root.next) + 1;
    }
}
