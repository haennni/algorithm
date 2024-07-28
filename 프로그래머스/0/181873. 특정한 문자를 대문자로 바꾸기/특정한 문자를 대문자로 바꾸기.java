class Solution {
    public static String solution(String my_string, String alp) {
        if (my_string.contains(alp)) {
            my_string = my_string.replace(alp, alp.toUpperCase());
        }
        return my_string;
    }
}