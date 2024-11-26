class Solution {
    public static String solution(String nums) {
        String[] split = nums.split(" ");

        int max = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[0]);
        
        for (String s : split) {
            min = Math.min(min, Integer.parseInt(s));
            max = Math.max(max, Integer.parseInt(s));
        }
        return  min + " " + max;
    }

    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }
}