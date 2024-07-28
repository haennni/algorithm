class Solution {
    public static int solution(String myString, String pat) {
        int answer = 0;

        String temp = myString.replace("A", "X");
        String string = temp.replace("B", "A").replace("X", "B");
        System.out.println("string = " + string);
        if (string.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}