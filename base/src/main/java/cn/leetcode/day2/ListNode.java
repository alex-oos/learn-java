package cn.leetcode.day2;


/**
 * @ClassName ListNode
 * @Description
 * @Author Alex
 * @since 2022/7/23 10:25
 * @Version 1.0
 */
public class ListNode {

    int val;

    ListNode next;
    ListNode() {                                                                                                                                                                                                                        
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
