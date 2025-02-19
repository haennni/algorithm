import java.util.*;
class Solution {
    public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        Arrays.fill(answer, 1); //우선 대기실을 모두 성공처리
        int[] nx = {0, 1, 0, -1};
        int[] ny = {-1, 0, 1, 0};

        for (int i = 0; i < places.length; i++){    //5개의 대기실을 조회 1 번째 대기실
            String[][] arr = new String[5][5]; //각 방 arr
            
            for (int k = 0; k < 5; k++) {
                arr[k] = places[i][k].split("");
            }

            for (int k = 0; k < places[0].length; k++){ //각 대기실 arr를 만듦
                int count = 0;

                String[] strArr = places[i][k].split("");
                for (String s : strArr){
                    arr[k][count] = s;
                    count++;
                }
            }

            for(int x = 0; x < places[0].length; x++){ // 각 대기실을 조회
                for (int y = 0; y < places[0].length; y++){
                    if (arr[x][y].equals("P")){ //플레이어가 있으면
                        // 거리 2를 지켰는지 확인
                        if (x + 2 < 5 && y + 2 < 5){ 
                            if (arr[x + 2][y].equals("P")){
                                if (! arr[x + 1][y].equals("X")){
                                    answer[i] = 0;
                                }
                            }else if(arr[x][y + 2].equals("P")){
                                if (! arr[x][y + 1].equals("X")){
                                    answer[i] = 0;
                                }
                            }
                             
                        }
                        //대각선에 플레이어가 존재하는데 파티션이 없는 경우
                        if (x + 1 < 5 && x - 1 >= 0 && y + 1 < 5 && y - 1 >= 0){
                            if (arr[x + 1][y - 1].equals("P") && 
                                !(arr[x][y-1].equals("X"))){
                                System.out.println("대각선 파티션에서 오류");
                                answer[i] = 0;
                            }else if(arr[x + 1][y + 1].equals("P") && 
                                !(arr[x][y + 1].equals("X"))){
                                answer[i] = 0;
                                System.out.println("대각선 파티션에서 오류");
                            }
                        }
                        
                        for (int p = 0; p < 4; p++){
                            int newX = x + nx[p]; // y 방향 이동
                            int newY = y + ny[p]; // x 방향 이동
                            if (newX >= 0 && newY >= 0 && newX < 5 && newY < 5){
                                if (arr[newX][newY].equals("P")) { // 바로 상하좌우에 P가 있으면 거리두기 실패
                                    answer[i] = 0;
                                }
                                if (arr[newX][newY].equals("O")){
                                    for (int b = 0; b < 4; b++){ //O 상하좌우로 P가 있는지 검사
                                        int checkX = newX + nx[b];
                                        int checkY = newY + ny[b];
                                        if (checkX >= 0 && checkY >= 0 &&
                                        checkX < 5 &&  checkY < 5){
                                            if (arr[checkX][checkY].equals("P")){
                                                if (checkX != x || checkY != y)
                                                    answer[i] = 0;
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}