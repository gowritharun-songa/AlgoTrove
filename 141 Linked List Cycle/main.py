class Node:
    def __init__(self,data):
        self.data = data
        self.next = None



node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)
node5 = Node(5)

node1.next = node2
node2.next = node3
node3.next = node4
node4.next = node5

node5.next = node3

def hasCycle(head):
    slow = head
    fast = head

    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return True
        
    return False

res = hasCycle(node1)
print(res)