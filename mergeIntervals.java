import java.lang.*;
import java.util.*;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

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

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<Interval>();
        int len = intervals.size();

        //trivial case
        if (len == 0) {
            res.add(newInterval);
            return res;
        } else if (intervals.get(len - 1).end < newInterval.start) {
            intervals.add(newInterval);
            return intervals;
        } else if (intervals.get(0).start > newInterval.end) {
            Collections.reverse(intervals);
            intervals.add(newInterval);
            Collections.reverse(intervals);
            return intervals;
        }
        //ended trivial cases
        Stack<Interval> st = new Stack<>();
        st.push(newInterval);

        for (int i = 0; i < len; i++) {
            if (intervals.get(i).start <= st.peek().start || intervals.get(i).start >= st.peek().end) {
                Interval temp = st.peek();
                st.pop();
                st.push(merge(temp, intervals.get(i)));
                 System.out.println(st);
            } else {
                st.push(intervals.get(i));
            }
        }

        Iterator<Interval> itr = st.iterator();
        while (itr.hasNext()) {
            res.add(st.pop());
        }
        return res;
    }
}

