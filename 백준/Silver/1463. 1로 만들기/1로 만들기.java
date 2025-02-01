import java.util.*;

class Main {
    static long[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        memo = new long[Math.max(4, num + 1)];
        Arrays.fill(memo, -1);

        memo[0] = 0;
        memo[1] = 0;
        memo[2] = 1;
        memo[3] = 1;

        for (int i = 4; i <= num; i++) {
            if(i % 6 == 0) 
                memo[i] = Math.min(Math.min(memo[i / 3], memo[i / 2]), memo[i - 1]) + 1;
            else if (i % 2 == 0)
                memo[i] = Math.min(memo[i - 1],memo[i / 2]) + 1;
            else if  (i % 3 == 0)
                memo[i] = Math.min(memo[i - 1], memo[i / 3] )+ 1;
            else
                memo[i] = memo[i - 1] + 1;
        }
        System.out.println(memo[num]);
    }
}
