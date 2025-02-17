import java.util.*;
public class Main {
    public static void main(String[] args) {
        int recycle = 0;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] room = new int[size];
        for (int i = 0; i < size; i++){
            room[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++){ //i는 방 증가
            int sum = 0;
            for (int j = 0; j < size; j++){ //j는 현재 거리 증가
                int roomNumberIndex = (i + j) % size;
                    sum += room[roomNumberIndex] * j;
                }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}