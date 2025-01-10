import java.util.*;

class Solution {
public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int p : progresses) {
            int count = 0;
            int progress = p;
            while (progress < 100) {
                progress += speeds[queue.size()];
                count++;
            }
            queue.offer(count);
        }

        Integer poll = queue.poll();
        int size = queue.size();
        int c = 1;
        for (int i = 0; i < size; i++) {
            Integer n = queue.poll();
            if (poll >= n) c++;
            else if (poll < n) {
                list.add(c);
                poll = n;
                c = 1;
            }
        }
        if (!(c == 0))
            list.add(c);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}