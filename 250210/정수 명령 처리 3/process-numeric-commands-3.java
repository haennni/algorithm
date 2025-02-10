import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num + 1; i++){
            String s = sc.nextLine();
            
            if (s.contains("push_back")){
                String[] arr = s.split(" ");
                dq.addLast(Integer.parseInt(arr[1]));
            }else if (s.contains("push_front")){
                String[] arr = s.split(" ");
                dq.addFirst(Integer.parseInt(arr[1]));
            }else if (s.contains("pop_front")){
                System.out.println(dq.pollFirst());
            }else if (s.contains("pop_back")){
                System.out.println(dq.pollLast());
            }else if (s.contains("size")){
                System.out.println(dq.size());
            }else if (s.contains("empty")){
                if (dq.isEmpty()){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            }else if (s.contains("front")){
                System.out.println(dq.peekFirst());
            }else if (s.contains("back")){
                System.out.println(dq.peekLast());
            }
        }
    }
}