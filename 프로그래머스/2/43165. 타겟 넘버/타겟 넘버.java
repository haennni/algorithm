class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);

        return answer;
    }

    void dfs(int n, int sum, int[] numbers, int target) {
        //System.out.println("dfs 실행 | n: " + n + ", sum: " + sum);

        if (n == numbers.length) {
            //System.out.println("길이 일치 | n: " + n + ", sum: " + sum);
            if (sum == target) {
                answer++;
                //System.out.println("타겟 일치 | n: " + n + ", sum: " + sum + ", answer: " + answer);
            }
            return;
        }

        //System.out.println("sum + numbers[" + n + "] 실행");
        dfs(n + 1, sum + numbers[n], numbers, target);  // +1 수행

        //System.out.println("sum - numbers[" + n + "] 실행");
        dfs(n + 1, sum - numbers[n], numbers, target);  // -1 수행
    }
}