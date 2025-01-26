import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray(); // 입력값을 문자 배열로 변환
        int max = 0;

        // 모든 자리를 바꿔가며 최대값 계산
        for (int i = 0; i < arr.length; i++) {
            // 현재 자리 반전
            arr[i] = (arr[i] == '0') ? '1' : '0';

            // 2진수 문자열을 10진수로 변환
            String str = new String(arr);
            int num = Integer.parseInt(str, 2); // 2진수 문자열 -> 10진수 변환

            // 최댓값 갱신
            max = Math.max(max, num);

            // 원래 값으로 복구
            arr[i] = (arr[i] == '0') ? '1' : '0';
        }

        System.out.println(max);
    }
}
