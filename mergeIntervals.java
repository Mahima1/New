import java.lang.*;
import java.util.*;

class Interval {
    int start;
    int end;

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

public class mergeIntervals {

    static Interval merge(Interval a, Interval b) {
        Interval merged = new Interval(Math.min(a.start, b.start), Math.max(a.end, b.end));
        return merged;
    }

    static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<>();
        Interval current = newInterval;
        int i = 0;
        while (i < intervals.size()) {
            Interval llist = intervals.get(i);
            if (llist.end < current.start) {
                i++;
            } else if (llist.start > current.end) {
                intervals.add(i,current);
                break;
            }else{
                intervals.remove(i);
                current=merge(llist, current);
            }
        }
        if (i==intervals.size()){
            intervals.add(current);
        }
        return  intervals;

    }

    public static void main(String[] args) {
        ArrayList<Interval> A = new ArrayList<>();
        Interval q = new Interval(1, 2);
        A.add(q);
        Interval w = new Interval(3, 5);
        A.add(w);
        Interval e = new Interval(6, 7);
        A.add(e);
        Interval r = new Interval(8, 10);
        A.add(r);
        Interval t = new Interval(12, 16);
        A.add(t);
        System.out.println(A);

        Interval newInterval = new Interval(2, 5);
        System.out.println(insert(A, newInterval));
    }
}

