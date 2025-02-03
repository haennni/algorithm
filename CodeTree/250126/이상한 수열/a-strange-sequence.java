import java.util.*;

public class Main {
    public static int F(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;

        return (n / 3) + F(n - 1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(F(num));
    }

}

/*
 (n / 3)값 + F(n - 1)의 값을 가져와야함
 (n / 3)의 값 

1 + 2 = 3
1 + 3 = 4
1 + 4 = 5
2 + 5 = 7
2 + 7 = 9
*/