package abhishek.com.java.practice;

/**
 * Created by abhishek on 23/11/16.
 */


import java.util.*;
import java.util.LinkedList;

class Node{
    int data;
    Node left,right;
    int depth;

    Node(int pData,int pDepth){
        data = pData;
        depth = pDepth;
    }
}

public class SwapNodes {

    private static void swapNodes(Node root,int k){

        if(root == null)
            return;


        if(root.depth % k == 0){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        swapNodes(root.left,k);
        swapNodes(root.right,k);


    }
    private static void printInorder(Node root){
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);

    }


    private static void swapElement(Node root,int k){
        swapNodes(root,k);
        printInorder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Node root = new Node(1,1);
        Node current = root;
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(current);

        while(N-->0){
            int leftChild = scan.nextInt();
            int rightChild = scan.nextInt();
            current = nodes.poll();

            if(leftChild == -1)
                current.left = null;
            else
                current.left = new Node(leftChild,current.depth+1);

            if(rightChild == -1)
                current.right = null;
            else
                current.right = new Node(rightChild,current.depth+1);


            if(current.left != null)
                nodes.offer(current.left);

            if(current.right != null)
                nodes.offer(current.right);
        }

        int T = scan.nextInt();
        while(T-->0){
            int k = scan.nextInt();
            swapElement(root,k);
        }
    }
}