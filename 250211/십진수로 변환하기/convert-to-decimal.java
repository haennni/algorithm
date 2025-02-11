/*
1 1 1  0  1
1 3 7 14 29

현재 값 1 * 2 + 첫 번째 값 
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 0;

        for(int i = 0; i < str.length(); i++){
            int n = Character.getNumericValue(str.charAt(i));
            result = (result * 2) + n;
        }

        System.out.println(result);
    }
}