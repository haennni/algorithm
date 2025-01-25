import java.util.*;
public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void plusNum(int n){
        //재귀함수를 생각해보자
        if (n == 0) return;
    

        plusNum(n - 1); // 7 6 5 4 3 2 1... 이런식으로 하나씩 줄어들겠지요 ? 0이면 1로 돌아가서 다음 실행문 실행하겠지요?
        sb.append(n).append(" ");

    }

    public static void minusNum(int n){
        if (n == 0) return;
        
        sb.append(n).append(" ");
        minusNum(n - 1);

    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int num = Scanner.nextInt();
        plusNum(num);
        System.out.println(sb.toString().trim());

        sb.setLength(0);

        minusNum(num);
        System.out.println(sb.toString().trim());

    }
}