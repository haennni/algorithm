public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int result = 0;
        boolean able = true;
        //1. Skill에 들어가는 문자를 제외한 모든 문자
        String allowedChars = "[^" + skill +"]";

        for (int i = 0; i < skill_trees.length; i++) {
            skill_trees[i] = skill_trees[i].replaceAll(allowedChars, "");
            if (skill.startsWith(skill_trees[i])) result++;
        }
        return result;
    }
}
