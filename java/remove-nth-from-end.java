class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    // 1 <= n <= sz
    ListNode right = head;
    for (int i = 0; i < n; i++)
      right = right.next;
    if (right == null)
      return head.next;
    ListNode left = head;
    while (right.next != null) {
      right = right.next;
      left = left.next;
    }
    left.next = left.next.next;
    return head;
  }
}
