/* 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
만약에 N이 130이 주어졌다면 1부터130까지의 수 각각에 대해 그 수를 구성하는 수가 등차수열을 만족하는지 보면 된다는 말입니다
N이 130 이니까 1부터 130까지 조사하면서
1: 1하나 뿐이니까 등차수열
2: 같은경우
3: 같은경우
....
10: 길이가 2고 각항이 1 0 인 수열. 공차가 -1인 등차수열임. 체크
11. 길이가 2이고 각항이 1 1 인 수열. 공차가 0 인 등차수열임.체크
...
100: 길이가 3이고 각항이 1 0 0 인 수열. 등차수열이 아님
101:길이가 3이고 각항이 1 0 1 인 수열. 등차수열 아님
...
123: 길이가 3이고 각항이 1 2 3 인 수열.공차가 1인 등차수열임. 체크 */

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        /*첫 번째 자릿수와 두 번째 자릿수의 차이를 구하고, 두 번째 자릿수와 세 번째 자릿수가 차이가 같다면 -> 한수*/

        for (int i = 1; i < input + 1; i++){
            String str = String.valueOf(i);
            int size = str.length();
            boolean isHansu = true;
            if (size >  2){
                int re = Character.getNumericValue(str.charAt(0)) - Character.getNumericValue(str.charAt(1));
                for (int j = 1; j < size - 1; j++) {
                    int num = Character.getNumericValue(str.charAt(j)) - Character.getNumericValue(str.charAt(j + 1));
                    if (re != num) isHansu = false;
                }
            }
            if (isHansu){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
