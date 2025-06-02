from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        # 构造一个虚拟头节点
        virtual_head = ListNode(0, head)
        # 构造一个虚拟头节点
        current = head
        before = virtual_head
        for i in range(left-1):
            if not current:
                return head
            before = current
            current = current.next
        if current.next is None:
            return head
        begain = current
        last = before
        if right == left:
            return head
        for i in range(right-left+1):
            if not current:
                return head
            before = current
            current = current.next
        end = current
        
        current = begain
        before = None
        for j in range(right - left + 1):
            next = current.next
            current.next = before
            before = current
            current = next
        last.next = before
        begain.next = end
        return virtual_head.next



    # 输入：head = [1,2,3,4,5], left = 2, right = 4
    # 写一个main函数，测试这个函数
if __name__ == "__main__":
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    left = 2
    right = 4
    solution = Solution()
    result = solution.reverseBetween(head, left, right)
    while result:
        print(result.val, end=" ")
        result = result.next