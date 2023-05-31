package HomeWork;

import org.example.List;

public class hw3 {
    hw3.Node head;
    hw3.Node tail;

    public class Node {
        int value;
        Node next;
        org.example.List.Node previous;
    }

    public void revert(){
        if (head != null && head.next != null){
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode){
        if (currentNode.next == null){
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }
}
