import java.util.*;

class Solution {
    class Word{
        String word;
        int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<Word> q = new LinkedList<>();

        q.offer(new Word(begin, 0));

        while (!q.isEmpty()) {
            Word poll = q.poll();
            if (poll.word.equals(target)) return poll.count;

            for (int i = 0; i < words.length; i++) {
                int count = 0;
                if (visited[i]) continue;
                for (int j = 0; j < words[i].length(); j++) {
                    char c = words[i].charAt(j);
                    if (!(poll.word.charAt(j) == c))
                        count++;
                }
                if (count == 1) {
                    q.offer(new Word(words[i], poll.count + 1));
                    visited[i] = true;
                }
            }
            
        }
        return 0;
    }
}