package abhishek.com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by abhishek on 26/11/16.
 */

public class Qheap {

    int capacity = 10;
    int[] heap = new int[capacity];
    int HEAPSIZE = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();

        Qheap sol = new Qheap();

        for(int i = 0 ; i < Q ; i++){

            int option = scan.nextInt();
            int item = 0;
            if(option != 3){
                item = scan.nextInt();
            }

            if(option == 1){
                sol.addItem(item);

            }else if(option == 2){

                sol.deleteItem(item);

            }else{

                System.out.println(sol.heap[0]);
            }
        }
    }

    private int getLeftChildIndex(int parentIndex){
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex){
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int index){
        return (index - 1)/2;
    }

    private boolean hasLeftChild(int index){
        return (getLeftChildIndex(index) < HEAPSIZE);
    }

    private boolean hasRightChild(int index){
        return (getRightChildIndex(index) < HEAPSIZE);
    }

    private boolean hasParent(int index){
        return (getParentIndex(index) >= 0);
    }


    private void addItem(int item){

        ensureCapacity();
        heap[HEAPSIZE] = item;
        HEAPSIZE++;
        heapifyUp();

    }

    private void deleteItem(int item){

        for(int i = 0 ; i < HEAPSIZE ; i++){

            if(heap[i] == item){
                heap[i] = heap[HEAPSIZE - 1];
                HEAPSIZE--;
                heapifyDown(i);
                return;
            }
        }
    }

    private void heapifyUp(){
        int index = HEAPSIZE - 1;
        while( hasParent(index) && ( heap[getParentIndex(index)] > heap[index] )){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown(int index){

        while(hasLeftChild(index)){

            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && (heap[getRightChildIndex(index)] < heap[getLeftChildIndex(index)])){
                smallerChildIndex = getRightChildIndex(index);
            }

            if(heap[smallerChildIndex] > heap[index]){
                break;
            }else{
                swap(smallerChildIndex,index);
            }
            index = smallerChildIndex;

        }

    }


    private void swap(int indexone, int indextwo){
        int temp = heap[indexone];
        heap[indexone] = heap[indextwo];
        heap[indextwo] = temp;
    }

    private void ensureCapacity(){
        if(HEAPSIZE == capacity){
            heap = Arrays.copyOf(heap,capacity*2);
            capacity *= 2;
        }
    }


}