class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        String[] result = s.split("");

        for (String r : result) {
            if (r.equals("p") || r.equals("p".toUpperCase())) {
                p++;
            }
            if (r.equals("y") || r.equals("y".toUpperCase())) {
                y++;
            }
        }

        if (! (p == y)) {
            answer = false;
        }

        return answer;
    }
}