import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        String[] split = s.split(" ", -1);
        List<String> list = Arrays.stream(split).collect(Collectors.toList());

        System.out.println("list.size() = " + list.size());
        for (int i = 0; i < list.size(); i++) {
            String[] upper = list.get(i).split("", 0);
            if (!(upper[0].isEmpty())) {
                String string = list.get(i).replaceFirst(Arrays.toString(upper), upper[0].toUpperCase());
                sb.append(string).append(" ");
            }else{
                sb.append(upper[0]).append(" ");
            }
        }
        int index = sb.lastIndexOf(" ");
        sb.deleteCharAt(index);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("for the   "));
    }
}