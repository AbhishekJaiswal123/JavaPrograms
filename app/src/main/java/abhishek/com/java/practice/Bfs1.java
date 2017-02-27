package abhishek.com.java.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by abhishek on 9/11/16.
 */

public class Bfs1 {

    public static class Graph{

        private Node[] nodes;
        private static int EDGE_LENGTH = 6;
        private int V;   // No. of vertices

        private class Node{
            LinkedList<Integer> neighbours;
            Node(){
                neighbours = new LinkedList<>();
            }
        }

        public Graph(int size){
            V = size+1;
            nodes = new Node[V];
            for (int i= 1; i < V; i++)
                nodes[i] = new Node();

        }



        public void addEdges(int first, int second){
            nodes[first].neighbours.add(second);

        }

        public int[] shortReach(int startId){

            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(startId);

            int[] distances = new int[nodes.length];
            Arrays.fill(distances,-1);
            distances[0] = 0;
            distances[startId] = 0;

            while(!queue.isEmpty()){
                int node = queue.poll();

                for(int neighbour : nodes[node].neighbours){
                    if(distances[neighbour] == -1){
                        distances[neighbour] = distances[node]+EDGE_LENGTH;
                        queue.add(neighbour);
                    }
                }
            }

            return distances;

        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for(int i = 0 ; i < q ; i++){

            int n = scan.nextInt();
            int m = scan.nextInt();
            Graph graph = new Graph(n);

            for(int j = 0 ; j < m ; j++){
                int first = scan.nextInt();
                int second = scan.nextInt();
                graph.addEdges(first,second);
            }
            int s = scan.nextInt();
            int[] result =  graph.shortReach(s);

            for(int dis : result){
                if(dis != 0)
                    System.out.print(dis+" ");
            }
            System.out.print("\n");
        }
    }
}