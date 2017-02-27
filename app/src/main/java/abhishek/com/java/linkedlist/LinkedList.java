package abhishek.com.java.linkedlist;

/**
 * Created by abhishek on 17/1/17.
 */

public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node insertNode(Node head,int data){
        Node node = new Node(data);
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
        return head;
    }

    public Node getNode(Node head, int position){
        Node current = head;
        Node prev = new Node(0);
        while (position > 1){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        return head;
    }

    public Node reverseLinkedList(Node head){

        Node current = head;
        Node prev = null;

        while (current.next != null){

            Node temp = current.next;
            current.next = prev;

            prev = current;
            current = temp;

        }

        head = prev;
        return head;
    }

    public Node reverseLinkedListRecursively(Node head){

        if(head.next == null)
            return head;

        Node next = head.next;
        head.next = null;

        Node reverse = reverseLinkedListRecursively(next);
        next.next = head;
        return reverse;
    }

    public boolean detectLoop(Node head){

        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }


}
