class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int count = 0;
        int zero = 0;


        for (int i = 0; i < lottos.length; i++) {
            //만약 모르는 로또 번호일 경우 zero 카운트 ++
            if (lottos[i] == 0) {
                zero++;
            }

            //민우의 로또 번호와 당첨 번호가 일치하는지 카운트
            for (int k = 0; k < win_nums.length; k++) {
                if (lottos[i] == win_nums[k]) {
                    count++;
                }
            }
        }

        //최소 순위는 count
        switch (count) {
            case 2:
                answer[1] = 5;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 4:
                answer[1] = 3;
                break;
            case  5:
                answer[1] = 2;
                break;
            case 6:
                answer[1] = 1;
                break;
            default:
                answer[1] = 6;
                break;
        }

        //최고 순위는 count에 zero를 추가
        switch (count + zero) {
            case 2:
                answer[0] = 5;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 4:
                answer[0] = 3;
                break;
            case  5:
                answer[0] = 2;
                break;
            case 6:
                answer[0] = 1;
                break;
            default:
                answer[0] = 6;
                break;
        }
        return answer;

    }
}