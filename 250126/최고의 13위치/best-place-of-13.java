import java.util.*;
import java.lang.*;


public class Main {
    public static int F(int[][] arr, int n){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                max = Math.max(max, arr[i][j] + arr[i][j + 1]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 1, 0, 1},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}};
        int n = 5;
        System.out.println(F(arr, 5));
    }
}