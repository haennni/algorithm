/* 
num = 10
for (num이 216과 같을 때 까지 num++)
    int sum = num
   for(10 -> length를 구하고 그 만큼 도는데)
       sum += num[반복인자]
       만약에 if(sum이 num이면 출력)
)
*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int result = 0;
        
        for (int i = 0; i < M; i++){
            int sum = i; //M값을 담아 줄 변수
            String str = String.valueOf(i); //숫자 i를 문자형으로 변환
            int size = str.length();  //i의 크기
            for (int n = 0; n < size; n++){
                Character c = str.charAt(n);
                sum += Character.getNumericValue(c);
            }
            if (sum == M){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

