package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 25/11/16.
 */

public class DoublyLinkedList {

    static class Node{
        int data;
        Node prev;
        Node next;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        DoublyLinkedList doubleLinkedList = new DoublyLinkedList();
        Node head = null;
        for(int i = 0 ; i < N ; i++){
            int data = scan.nextInt();
           head = doubleLinkedList.insertNode(head,data);
        }
        int X = scan.nextInt();
        doubleLinkedList.printList(head);
        System.out.println();
        doubleLinkedList.printSumNum(head,X);

    }

    private void printSumNum(Node head,int x){

        Node first = head;
        Node second = head;

        while(second.next != null){
            second = second.next;
        }

        while(first != null && second != null && first != second && second.next != first){

            if(first.data+second.data == x){
                System.out.println("("+first.data+","+second.data+")");
                first = first.next;
                second = second.prev;
            }else {

                if(first.data+second.data > x){
                    second = second.prev;
                }else{
                    first = first.next;
                }
            }

        }


    }



    private void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }


    private Node insertNode(Node head,int data){

        Node node = new Node();
        node.data = data;

        if(head == null){
            return node;
        }
        if(head.next == null){
            node.prev = head;
            head.next = node;
            return head;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = node;
        node.prev = current;


        return head;
    }
}
