import java.util.HashSet;

class Solution {
    public static int solution(int[] nums) {
        int able = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.size() < able){
                set.add(num);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }
}