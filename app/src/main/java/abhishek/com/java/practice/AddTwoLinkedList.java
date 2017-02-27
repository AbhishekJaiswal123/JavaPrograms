package abhishek.com.java.practice;

/**
 * Created by abhishek on 17/1/17.
 */

public class AddTwoLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(1);
        first.next = new Node(2);
        first.next.next = new Node(3);


        Node second = new Node(3);
        second.next = new Node(4);
        second.next.next = new Node(5);

        System.out.println(addTwoNumbers(first,second));


    }

    public static Node addTwoNumbers(Node A, Node B) {
        Node node;
        Node prev = null;
        Node first = null;
        int carry = 0;
        int sum = 0;

        while (A != null || B != null || carry != 0) {

            node = new Node(0);
            sum = carry;

            if (first == null)
                first = node;

            if (prev != null)
                prev.next = node;

            if (A != null) {
                sum += A.data;
                A = A.next;
            }

            if (B != null) {
                sum += B.data;
                B = B.next;
            }

            node.data = sum % 10;

            sum /= 10;
            carry = sum;
            prev = node;
        }

        return first;

    }
}
