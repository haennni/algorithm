class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        int re = 0;

        for (boolean s : finished) {
            if (!s) {
                count++;
            }
        }

        String[] result = new String[count];

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                result[re] = todo_list[i];
                re++;
            }
        }
        return result;
    }
}