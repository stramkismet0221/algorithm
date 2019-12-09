package com.stramkismet.practice.algorithm;

import com.stramkismet.practice.algorithm.common.SingleNode;

import java.util.Objects;

/**
 * 快慢指针
 * 三等分
 * 中间点
 *
 * @author shangxi
 */
public class FastAndSlowPointer {


    /**
     * 判断单链表是否有环.
     * 快指针比
     * 如果有环，那么快指针一定会在环中追上慢指针，从而相遇
     * 快指针步长为2
     * 慢指针步长为1
     *
     * @return 有环true, 无环false
     */
    public static boolean checkLinkHasCycle(SingleNode node) {
        return Objects.isNull(getLinkFirstMeet(node));
    }

    /**
     * 获取单项链第一次相遇的节点.
     * 快指针比
     * 如果有环，那么快指针一定会在环中追上慢指针，从而相遇
     * 快指针步长为2
     * 慢指针步长为1
     *
     * @return 返回相遇的node
     */
    public static SingleNode getLinkFirstMeet(SingleNode node) {
        SingleNode slow = node;
        SingleNode fast = node;
        while (Objects.nonNull(fast) && Objects.nonNull(fast.getNext())) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                return fast;
            }
        }
        return null;
    }

    /**
     * 获取环的长度
     * 快慢指针步差必须为1否则可能得到错误的结果
     *
     * @param node
     * @return
     */
    public static int getLinkCycleLen(SingleNode node) {
        SingleNode linkFirstMeet = getLinkFirstMeet(node);
        if (linkFirstMeet != null) {
            //slow与fast继续前进
            SingleNode fast = linkFirstMeet.getNext().getNext();
            SingleNode slow = linkFirstMeet.getNext();
            int len = 0;
            while (fast != slow) {
                slow = slow.getNext();
                fast = fast.getNext().getNext();
                len++;
            }
            return len;
        }
        return 0;
    }

    /**
     * 找到单链表环入口
     * https://blog.51cto.com/f1yinsky/2373303
     *
     * @return
     */
    public static SingleNode getCycleEntrance(SingleNode node) {
        //判断当前单链表是否有环
        SingleNode linkFirstMeet = getLinkFirstMeet(node);
        if (linkFirstMeet != null) {
            SingleNode fast = node;
            SingleNode slow = linkFirstMeet;
            while (fast != slow) {
                fast = fast.getNext();
                slow = slow.getNext();
            }
            return fast;
        }
        return null;
    }

    /**
     * 获取单项链表的中点
     *
     * @param node
     * @return
     */
    public static SingleNode findMidNode(SingleNode node) {
        //判断有没有环
        if (checkLinkHasCycle(node)) {
            //有环

        } else {
            //无环
            SingleNode fast = node;
            SingleNode slow = node;
            while (fast != null && fast.getNext() != null) {
                fast = fast.getNext().getNext();
                slow = slow.getNext();
            }
            return fast == null ? slow.getNext() : slow;
        }
        return null;
    }

    /**
     * 获取单项链表的三等分点
     *
     * @param node
     * @return
     */
    public static SingleNode[] findThreeNode(SingleNode node) {
        //判断有没有环
        if (checkLinkHasCycle(node)) {
            //有环

        } else {
            //无环
            SingleNode first = node;
            SingleNode second = node;
            SingleNode three = node;
            while (three != null && three.getNext() != null && three.getNext().getNext() != null) {
                first = first.getNext();
                second = second.getNext().getNext();
                three = three.getNext().getNext().getNext();
            }
            return new SingleNode[]{first, second, three};
        }
        return null;
    }
}
