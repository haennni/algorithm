import java.util.*;

public class Main{    
    static long result;
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, PriorityQueue<Integer>> map = new HashMap<>();

    public static void game(int count){
        result = 0;
        for (int i = 0; i < count; i++){
            int num = sc.nextInt(); /* 게임 번호 */
            String name = sc.next();
            int amount = sc.nextInt();
            if (num == 1){
                num1(name, amount);
            }else if (num == 2){
                num2(name, amount);
            }
        }
    }

    /*1번 일 경우*/
    public static void num1(String name, int amount){
        /*없는 고릴라 일 시, 맵에 추가*/
        map.putIfAbsent(name, new PriorityQueue<>(Collections.reverseOrder()));
        PriorityQueue<Integer> pq = map.get(name);

        for (int i = 0; i < amount; i++){
            int value = sc.nextInt();
            pq.offer(value);
        }
    }

    /*2번 일 경우*/
    public static void num2(String name, int amount){
        /* 정보를 가진 고릴라가 있는지 확인 */
        if (!map.containsKey(name) || map.get(name).isEmpty()) return;
        PriorityQueue<Integer> pq = map.get(name);

        int min = Math.min(amount, pq.size());

        /* 고릴라가 가진 정보 중 가장 큰 값 찾기 */
        for (int i = 0; i < min; i++) {
            if (!pq.isEmpty())
                result += pq.poll();
        }
    }

    public static void main(String[] args){
        int count = sc.nextInt();
        game(count);
        System.out.println(result);
    }
}