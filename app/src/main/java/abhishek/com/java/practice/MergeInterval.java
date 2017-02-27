package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhishek on 14/1/17.
 */

public class MergeInterval {


    public static void main(String[] args) {

        List<Interval> intervals = new ArrayList<>();

        /*intervals.add(new Interval(1,3));
        intervals.add(new Interval(6,9));*/

        intervals.add(new Interval(1,2));
        intervals.add(new Interval(3,5));

        /*intervals.add(new Interval(1,2));
        intervals.add(new Interval(3,5));
        intervals.add(new Interval(6,7));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(12,16));*/


      //  insert(intervals,new Interval(10,8));
        System.out.println("Number is prime :"+isPrime(37));

    }

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {

                result.add(interval);

            } else if (newInterval.end < interval.start) {

                result.add(newInterval);
                result.addAll(intervals.subList(i, intervals.size()));
                return result;

            } else {
                // overlapping, enlarge newInterval to merge overlapping intervals
                int start = Math.min(newInterval.start, interval.start);
                int end = Math.max(newInterval.end, interval.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }

        result.add(newInterval);
        return result;
    }

    public static int isPrime(int A) {
        int upperLimit = (int)Math.ceil(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (A % i == 0)
                return 0;
        }

        return 1;
    }



    public static class Interval {
            int start;
            int end;
            Interval() { start = 0; end = 0; }
            Interval(int s, int e) { start = s; end = e; }
    }
}
