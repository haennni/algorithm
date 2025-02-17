import java.util.*;

public class Solution {
    public static int[] solution(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.offer(arr[0]);
        for (int i = 1; i < arr.length; i++){
            if (q.peek() != arr[i]) { 
                list.add(q.poll());
                q.offer(arr[i]);
            }
        }
        list.add(q.poll());
        
        int[] arr2 = list
            .stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return  arr2;
    }
    public static void main(String[] args) { 
        int[] a = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(a)));
    }
}