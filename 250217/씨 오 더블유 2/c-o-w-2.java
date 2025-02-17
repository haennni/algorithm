import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int count = 0;

        for (int i = 0; i < num; i++){
            if (str.charAt(i) == 'C'){
                for (int j = i + 1; j < num; j++){
                    if (str.charAt(j) == 'O'){
                        for (int k = j + 1; k < num; k++){
                            if (str.charAt(k) == 'W'){
                                count++;
                            }
                        }
                    }
                }

            }
        }
        System.out.println(count);
    }
}