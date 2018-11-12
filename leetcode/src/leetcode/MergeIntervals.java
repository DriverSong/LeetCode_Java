package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        intervals.sort((first, second) -> {return first.start - second.start;});
        int length = intervals.size();
        for(int i = 0; i < length; i ++){
            int index = i;
            int end = intervals.get(i).end;
            while(index < length - 1 && end >= intervals.get(index + 1).start){
                end = Math.max(end, intervals.get(index +1).end);
                index ++;
            }
            result.add(new Interval(intervals.get(i).start, end));
            i = index;
        }
        return result;
    }
}


class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
