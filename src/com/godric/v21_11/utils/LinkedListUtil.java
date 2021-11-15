package com.godric.v21_11.utils;

import com.godric.v21_11.common.Node;

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

}
