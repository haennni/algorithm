import java.util.*;

public class Main{
    static List<Integer> list;
    static List<Integer> origin;

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        StringBuilder sb = new StringBuilder();
        int amount = sc.nextInt();
        int num = sc.nextInt();
        list = new ArrayList<>();
        origin = new ArrayList<>();


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amount; i++) {
            int n = sc.nextInt();
            if (n > num) break;
            list.add(n);
            origin.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Collections.sort(list, (o1, o2) ->{
            if (map.get(o1) == map.get(o2)){ //빈도수가 같으면
                return origin.indexOf(o1) - origin.indexOf(o2);
            }else{
                return Integer.compare(map.get(o2), map.get(o1));
            }
        });

        for (int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

}
