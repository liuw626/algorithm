package com.godric.v21_11.utils;

import com.godric.v21_11.common.DoubleNode;
import com.godric.v21_11.common.Node;

import java.util.ArrayList;
import java.util.List;

public class LinkedListUtil {

    /**
     * 生成随机单链表
     */
    public static Node generateRandomLinkedList(int len, int maxValue) {
        int size = (int) (Math.random() * (len + 1));
        if (size == 0) {
            return null;
        }
        size--;
        Node head = new Node((int) (Math.random() * (maxValue + 1)));
        Node pre = head;
        while (size != 0) {
            Node cur = new Node((int) (Math.random() * (maxValue + 1)));
            pre.next = cur;
            pre = cur;
            size--;
        }
        return head;
    }

//    public static DoubleNode testReverseDoubleList(DoubleNode head) {
//        if (head == null) {
//            return null;
//        }
//        ArrayList<DoubleNode> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head);
//            head = head.next;
//        }
//        list.get(0).next = null;
//        DoubleNode pre = list.get(0);
//        int N = list.size();
//        for (int i = 1; i < N; i++) {
//            DoubleNode cur = list.get(i);
//            cur.last = null;
//            cur.next = pre;
//            pre.last = cur;
//            pre = cur;
//        }
//        return list.get(N - 1);
//    }


    /**
     * 生成随机双向链表
     */
    public static DoubleNode generateRandomDoubleList(int len, int maxValue) {
        int size = (int) (Math.random() * (len + 1));
        if (size == 0) {
            return null;
        }
        size--;
        DoubleNode head = new DoubleNode((int) (Math.random() * (maxValue + 1)));
        DoubleNode pre = head;
        while (size != 0) {
            DoubleNode cur = new DoubleNode((int) (Math.random() * (maxValue + 1)));
            pre.next = cur;
            cur.pre = pre;
            pre = cur;
            size--;
        }
        return head;
    }

    // for test
    public static List<Integer> getLinkedListOriginOrder(Node head) {
        List<Integer> ans = new ArrayList<>();
        while (head != null) {
            ans.add(head.val);
            head = head.next;
        }
        return ans;
    }

    // for test
    public static boolean checkLinkedListReverse(List<Integer> origin, Node head) {
        for (int i = origin.size() - 1; i >= 0; i--) {
            if (!origin.get(i).equals(head.val)) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    // for test
//    public static List<Integer> getDoubleListOriginOrder(DoubleNode head) {
//        List<Integer> ans = new ArrayList<>();
//        while (head != null) {
//            ans.add(head.val);
//            head = head.next;
//        }
//        return ans;
//    }
//
//    // for test
//    public static boolean checkDoubleListReverse(List<Integer> origin, DoubleNode head) {
//        DoubleNode end = null;
//        for (int i = origin.size() - 1; i >= 0; i--) {
//            if (!origin.get(i).equals(head.val)) {
//                return false;
//            }
//            end = head;
//            head = head.next;
//        }
//        for (int i = 0; i < origin.size(); i++) {
//            if (!origin.get(i).equals(end.val)) {
//                return false;
//            }
//            end = end.pre;
//        }
//        return true;
//    }

    // for test
//    public static void main(String[] args) {
//        int len = 50;
//        int value = 100;
//        int testTime = 100000;
//        System.out.println("test begin!");
//        for (int i = 0; i < testTime; i++) {
//            Node node1 = generateRandomLinkedList(len, value);
//            List<Integer> list1 = getLinkedListOriginOrder(node1);
//            node1 = reverseLinkedList(node1);
//            if (!checkLinkedListReverse(list1, node1)) {
//                System.out.println("Oops1!");
//            }
//
//            Node node2 = generateRandomLinkedList(len, value);
//            List<Integer> list2 = getLinkedListOriginOrder(node2);
//            node2 = testReverseLinkedList(node2);
//            if (!checkLinkedListReverse(list2, node2)) {
//                System.out.println("Oops2!");
//            }
//
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
//
//        }
//        System.out.println("test finish!");
//
//    }

}
