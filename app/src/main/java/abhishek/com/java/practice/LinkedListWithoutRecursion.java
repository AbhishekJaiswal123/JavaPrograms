package abhishek.com.java.practice;

import android.util.Log;

import java.util.Scanner;

/**
 * Created by abhishek on 25/11/16.
 */

public class LinkedListWithoutRecursion{


    static class Node{
        int data;
        Node next;
    }


    public static void main(String[] args) {
        LinkedListWithoutRecursion reverse = new LinkedListWithoutRecursion();

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Node head = null;
       // head.data = scan.nextInt();
      // scan.nextLine();
        for(int i = 0; i < N ; i++){
            head = reverse.insertInPlace(head,scan.nextInt());
        }

        reverse. printList(head);
        System.out.println();
        reverse. printList(reverse.reverseList(head));


    }

    private Node reverseList(Node head){

        Node prev = null;
        Node current  = head;
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

    private void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }

    private Node insertInPlace(Node head, int data){

        Node current = head;
        Node node  = new Node();
        node.data = data;
        if(head == null){
            return node;
        }

        if(data < current.data){
            node.next = current;
            return node;
        }

        if(current.next == null){
            if(data < current.data){
                node.next = current;
                return node;
            }else{
                current.next = node;
                return current;
            }
        }

        while(current.next != null){

               if(data < current.next.data){
                   Node next = current.next;
                   current.next = node;
                   node.next = next;
                   break;
               }

            current = current.next;
        }
        current.next = node;
        return head;
    }






    private Node insert(Node head,int data){
        Node current = head;
        Node node = new Node();
        node.data = data;

        while(current.next != null){
            current = current.next;
        }
        current.next = node;

        return head;
    }

}
