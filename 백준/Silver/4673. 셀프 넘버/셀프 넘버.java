/* 우선 1부터 10000까지 돌아서 셀프넘버가 아닌 수를 구하자
    이후에 1부터 10000까지 돌면서 셀프넘버에 없는 수를 추리자
    반환
*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        int[] arr = new int[10000];
        int index = 0;

        for (int i = 0; i < 10000; i++){
            int sum = i;
            String num = String.valueOf(i);
            int size = num.length();
            for (int j = 0; j < size; j++){
                sum += Character.getNumericValue(num.charAt(j));
            }
            arr[index] = sum;    //생성자 저장
            index++;
        }
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i< 10000; i++){
            int b = Arrays.binarySearch(arr, i);
            if (b < 0 && !(b > 10000)){
                list.add(i);
            }
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
