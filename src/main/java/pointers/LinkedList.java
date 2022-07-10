package pointers;

public class LinkedList {

  public static void main(String[] args) {
    var head = new ListNode(1, new ListNode(2 ));
//    var head = new ListNode(1);
    var res = removeNthFromEnd(head, 2);
    printList(res);
  }

  public static void printList(ListNode head) {
    var node = head;
    while (node != null) {
      System.out.println(node.val);
      node = node.next;
    }
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    if (head.next == null) {
      return null;
    }
    ListNode current = head;
    var i = 0;

    // проходим до конца
    while (current != null) {
      current = current.next;
      i++;
    }

    var j = i - n;

    current = head;
    ListNode prev = null;

    i = 0;
    while (i < j) {
      prev = current;
      current = current.next;
      i++;
    }

    if (prev != null) {
      prev.next = current.next;
    } else {
      head = current.next;
    }

    return head;
  }


  public static class ListNode {
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

}
