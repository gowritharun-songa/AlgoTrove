class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Main:
    def traverse(self, head):
        temp = head
        while temp is not None:
            print(temp.data, end="->")
            temp = temp.next
        print("null")

    def middelNode(self, head):
        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
        
        return slow

node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)
node5 = Node(5)

node1.next = node2
node2.next = node3
node3.next = node4
node4.next = node5

main = Main()
res = main.middelNode(node1)
main.traverse(res)