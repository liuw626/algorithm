package com.godric.v21_11.algo;

import com.godric.v21_11.common.Node;
import com.godric.v21_11.utils.LinkedListUtil;

import java.util.List;

/**
 * 反转链表: 单链表 & 双链表
 */
public class C10_ReverseList_N {

    public static Node reverseLinkedListByRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node next = head.next;
        Node newHead = reverseLinkedListByRecursive(next);
        next.next = head;
        head.next = null;

        return newHead;
    }

    public static Node reverseLinkedListByIterator(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        return null;
    }

        public static void main(String[] args) {
        int len = 50;
        int value = 100;
        int testTime = 100000;
        System.out.println("test begin!");
        for (int i = 0; i < testTime; i++) {
            Node node1 = LinkedListUtil.generateRandomLinkedList(len, value);
            List<Integer> list1 = LinkedListUtil.getLinkedListOriginOrder(node1);
            node1 = reverseLinkedListByRecursive(node1);
            if (!LinkedListUtil.checkLinkedListReverse(list1, node1)) {
                System.out.println("Oops1!");
            }

//            Node node2 = LinkedListUtil.generateRandomLinkedList(len, value);
//            List<Integer> list2 = LinkedListUtil.getLinkedListOriginOrder(node2);
//            node2 = testReverseLinkedList(node2);
//            if (!LinkedListUtil.checkLinkedListReverse(list2, node2)) {
//                System.out.println("Oops2!");
//            }

//            DoubleNode node3 = generateRandomDoubleList(len, value);
//            List<Integer> list3 = getDoubleListOriginOrder(node3);
//            node3 = reverseDoubleList(node3);
//            if (!checkDoubleListReverse(list3, node3)) {
//                System.out.println("Oops3!");
//            }
//
//            DoubleNode node4 = generateRandomDoubleList(len, value);
//            List<Integer> list4 = getDoubleListOriginOrder(node4);
//            node4 = reverseDoubleList(node4);
//            if (!checkDoubleListReverse(list4, node4)) {
//                System.out.println("Oops4!");
//            }

        }
        System.out.println("test finish!");

    }


}
