package abhishek.com.java.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by abhishek on 9/11/16.
 */

public class Bfs {

    public static class Graph{

        private LinkedList<Integer> adj[]; //Adjacency Lists
        private static int EDGE_LENGTH = 6;
        private int V;   // No. of vertices

        public Graph(int size){
            V = size;
            adj = new LinkedList[size];
            for (int i = 0; i < size; ++i)
                adj[i] = new LinkedList();

        }
        public void addEdges(int first, int second){
            adj[first-1].add(second-1);
        }

        public int[] shortReach(int startId){

            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(startId-1);

            int[] distances = new int[V];
            Arrays.fill(distances,-1);
            distances[startId-1] = 0;

            while(!queue.isEmpty()){
                int node = queue.poll();
                Iterator<Integer> i = adj[node].listIterator();
                while (i.hasNext()){
                    int n = i.next();
                    if(distances[n] == -1){
                        distances[n] = distances[node]+EDGE_LENGTH;
                        queue.add(n);
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