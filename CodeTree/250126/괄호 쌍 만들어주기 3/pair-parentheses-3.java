import java.util.*;
import java.lang.*;


public class Main {

    public static int cal(char[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '('){
                for (int j = i + 1; j < arr.length; j++){
                    if (arr[j] == ')'){
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();

        System.out.println(cal(arr));
    }
}
    /*
    )(()())

    1. for문으로 시작함 (i = 0)
        2. arr[i]의 값이 '('일 경우
           for문을 시작함 (j = i + 1)
            arr[j]의 값이 ')'일 경우
            count++;
        
    */