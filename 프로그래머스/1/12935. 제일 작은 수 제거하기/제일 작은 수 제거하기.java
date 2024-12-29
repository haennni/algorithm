import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        /* 1.  배열의 사이즈가 1이하 일 시 -1 리턴*/
        if (arr.length <= 1) return new int[]{-1};
        /* 2. arr 카피본 만들기 */
        int[] copy = Arrays.copyOfRange(arr, 0, arr.length);
        /* 3. arr 오름차순 정렬해 가장 작은 숫자 알아내기 */
        Arrays.sort(arr);
        int num = arr[0];
        /* 4. 가장 작은 번호만 제외한 int 배열 반환*/
        return Arrays.stream(copy).filter(n -> !(n == num)).toArray();
    }
}
