class Solution {
    public String[] solution(String my_string) {
        String replace = my_string.trim().replaceAll("\\s+", " ");
        return replace.split(" ");
    }
}