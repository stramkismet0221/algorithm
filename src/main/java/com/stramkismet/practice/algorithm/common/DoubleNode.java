package com.stramkismet.practice.algorithm.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 双向链表节点
 *
 * @author shangxi
 */
public class DoubleNode {
    @Getter
    private String data;

    @Getter
    @Setter
    private DoubleNode pre;
    @Getter
    @Setter
    private DoubleNode next;

    public DoubleNode(String data) {
        this.data = data;
    }

}
