package abhishek.com.java.hackerearth;

/**
 * Created by abhishek on 15/1/17.
 */

public class LinkedList {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        for(int i = 2 ; i < 10 ; i++) {

            head = insertIntoLinkedList(i, head);

        }
        reverseBetween(head,2,4);


    }

    private static Node reverseBetween(Node head, int m ,int n){
        Node current = head;
        Node first = head;
        Node third = null;
        Node rev = null;

        Node next = null;
        Node prev = null;

        int i = m;
        while(i-- > 1){
            current = current.next;
        }

        rev = current;
        current.next = null;

        while(n-- >= m){
            rev = rev.next;
        }
        third = rev;

        while (n-- >= m){
            next = rev.next;
            rev.next = prev;

            prev = rev;
            rev = next;
        }



        return head;
    }

    private static Node insertIntoLinkedList(int data, Node head) {


        Node node = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        return head;


    }


}


