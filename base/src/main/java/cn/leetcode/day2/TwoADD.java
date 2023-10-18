package cn.leetcode.day2;


/**
 * @ClassName TwoADD
 * @Description
 * @Author Alex
 * @since 2022/7/23 10:24
 * @Version 1.0
 */
public class TwoADD {

    public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        while (l1.next != null || l2.next != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int total = x + y + carry;
            curr = new ListNode(total % 10);
            curr = curr.next;
            carry = total / 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry != 0) curr.next = new ListNode(carry);
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode tmp = new ListNode(0);
        ListNode tmp_01 = new ListNode(1, tmp);
        ListNode tmp_02 = new ListNode(2, tmp_01);
        ListNode tmp_03 = new ListNode(3, tmp_02);
        ListNode l1 = new ListNode(10, tmp_03);
        while (l1 != null) {
            System.out.println("l1.val = " + l1.val);
            l1 = l1.next;
        }

        ListNode l2 = new ListNode(3, tmp_03);


        ListNode listNode = addTwoNumber(l1, l2);

        while (listNode != null) {
            System.out.println("listNode = " + listNode);
            listNode = listNode.next;
        }
    }


}
