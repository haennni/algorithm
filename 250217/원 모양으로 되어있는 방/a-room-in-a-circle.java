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
                if (i + j >= size ){
                    for (int k = 0; k < recycle; k++) {
                        sum += room[k] * j;
                    }
                }else {
                    sum += room[i + j] * j;
                }
            }
            min = Math.min(min, sum);
            recycle++;
        }
        System.out.println(min);
    }
}