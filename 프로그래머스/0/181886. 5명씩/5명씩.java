class Solution {
    public String[] solution(String[] names) {
        int group = 0;

        String[] name = new String[((names.length - 1) / 5) + 1];

        for (int i = 0; i < names.length; i++) {
            if (i == 0 || i % 5 == 0) {
                name[group] = names[i];
                group++;
            }
        }

        return name;
    }
}