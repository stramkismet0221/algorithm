package com.stramkismet.practice.algorithm;

import com.stramkismet.practice.algorithm.common.SingleNode;

/**
 * 反转单链表
 * @author shangxi
 */
public class ReverseSingleNode {

    public SingleNode reverseSingleNode(SingleNode head){
        SingleNode pre = null;
        SingleNode next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }
}
