# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        prev = None
        next = None
        while slow:
            next = slow.next
            slow.next = prev
            prev = slow
            slow = next
        # return prev
        while prev.next:
            q = head.next
            w = prev.next
            head.next = prev
            prev.next = q
            head = q
            prev = w
