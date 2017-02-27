package abhishek.com.java.hackerearth;

/**
 * Created by abhishek on 15/1/17.
 */

public class ReverseLinkedList2 {


     static class ListNode {
          public int val;
          public ListNode next;
          ListNode(int x) { val = x; next = null; }
      }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        for(int i = 2 ; i < 10 ; i++) {

            head = insertIntoLinkedList(i, head);

        }
        reverseBetween(head,2,4);


    }

    private static ListNode insertIntoLinkedList(int data, ListNode head) {


        ListNode node = new ListNode(data);
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        return head;


    }



    public  static ListNode reverseBetween(ListNode A, int m, int n) {

            int i;
            ListNode node = A;
            ListNode prev = null;
            m--;
            n--;

            for (i = 0; i < m; i++) {
                prev = node;
                node = node.next;
            }

            if (prev != null)
                prev.next = reverseList(node, n - m + 1);
            else
                A = reverseList(node, n - m + 1);

            return A;
        }

        public static  ListNode reverseList(ListNode A, int count) {

            ListNode node, prev, temp, last;

            node = A;
            last = A;

            if (node == null)
                return null;

            prev = null;

            while (node != null && count > 0) {

                temp = node.next;
                node.next = prev;
                prev = node;
                node = temp;
                count--;
            }

            last.next = node;

            return prev;
        }
    }

