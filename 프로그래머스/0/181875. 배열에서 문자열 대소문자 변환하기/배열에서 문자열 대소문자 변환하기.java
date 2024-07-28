class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;

        for (String s : strArr) {
            if (count % 2 == 0) {
                strArr[count] = s.toLowerCase();
                count++;
            }else{
                strArr[count] = s.toUpperCase();
                count++;
            }
        }
        return strArr;
    }
}