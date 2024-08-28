import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String[] str = String.valueOf(n).split("");
        long[] list = new long[str.length];

        for (int i = 0; i < str.length; i++) {
            list[i] = Long.parseLong(str[i]);
        }

        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();

        for (long l : list) {
            sb.append(l);
        }

        answer = Long.parseLong(sb.reverse().toString());

        return answer;
    }
}