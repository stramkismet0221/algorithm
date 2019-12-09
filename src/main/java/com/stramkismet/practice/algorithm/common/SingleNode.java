package com.stramkismet.practice.algorithm.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 单链表节点
 * 只指向后一个节点
 *
 * @author shangxi
 */
public class SingleNode {

    @Getter
    private String data;
    @Setter
    @Getter
    private SingleNode next;

    public SingleNode(String data) {
        this.data = data;
    }


}
