#include<iostream>
using namespace std;

class Node {
    public:
        int data;
        Node* next = nullptr;

        Node(int data) {
            this -> data = data;
            this -> next = nullptr;
        }
};

bool hasCycle(Node* head) {
    Node* slow = head;
    Node* fast = head;

    while (fast != nullptr && fast -> next != nullptr) {
        slow = slow -> next;
        fast = fast -> next -> next;

        if (slow == fast) {
            return true;
        }
    }
    return false;
}

int main() {

    Node* node1 = new Node(1);
    Node* node2 = new Node(2);
    Node* node3 = new Node(3);
    Node* node4 = new Node(4);
    Node* node5 = new Node(5);


    node1 -> next = node2;
    node2 -> next = node3;
    node3 -> next = node4;
    node4 -> next = node5;

    node5 -> next = node3;

    bool res = hasCycle(node1);

    cout << res << endl;

    return 0;
}