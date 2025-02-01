import java.util.*;
import java.io.*;

class Main{
    static long[] dp;

    public static long F(int n){
        if(n == 0) return dp[0];
        if(n == 1) return dp[1];

        if (dp[n] != -1)
            return dp[n];
        dp[n] = F(n - 1) + F(n - 2);
       return dp[n];
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new long[Math.max(2, num + 1)];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(F(num));
    }
}