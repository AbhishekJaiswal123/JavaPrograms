package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 18/11/16.
 */

public class LinkedList {

    static class Node{

        private int data;
        private Node next;
    }


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        Node head;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        head = new Node();
        head.data = scan.nextInt();

        for(int i = 1 ; i < N ;i++){
            int data = scan.nextInt();

           head = linkedList.insertNode(head,data);
        }

        // Print linked list
        printList(head);

        // Print reverse linked list
        head = reverse(head);
        printList(head);

       head = reverseRecursion(head);
        printList(head);

    }

    private static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print("\n");
    }

    private static Node reverseRecursion(Node head){

        if(head == null)
            return null;

        if(head.next == null)
            return head;

        Node next = head.next;

        head.next = null;

        Node reverseSet = reverseRecursion(next);
        next.next = head;

        return reverseSet;

    }

    private static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
        return head;

    }


    private Node insertNode(Node head,int data){

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        Node node = new Node();
        node.data = data;
        current.next = node;
        return head;



    }
}
