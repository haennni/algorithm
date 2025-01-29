import java.util.*;
import java.lang.*;

public class Main {
    public static int cal(int K, String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if(Integer.parseInt(arr[i][0]) <= K + 1){
                sum += arr[i][1].equals("G") ? 1 : 2;
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N명의 사람
        int K = sc.nextInt(); //사진의 크기 'K' or 'G'
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = String.valueOf(sc.nextInt());
            arr[i][1] = sc.next();
        }

        System.out.println(cal(K, arr));
    }
    
}