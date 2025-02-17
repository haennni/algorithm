import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean win = false;
        int win_color = 0;
        int[][] win_map = new int[2][2];
        int win_line = 0; //세로 라인이면 1, 가로 라인이면 2
        int map[][] = new int[19][19];
        /* 입력 값 받기*/
        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                map[i][j] = sc.nextInt();
            }
        }
        //System.out.println("[]" + );
        for (int i = 0; i < 18; i++){
            if (win){
                    break;
            }
            for (int k = 0; k < 18; k++){   //한 칸씩 전진
                if (win){
                    break;
                }
                int point = map[i][k]; //첫 칸만 추출하기
                //System.out.println("[point] = " + i + "," + k);
                int count = 0;

                for (int r = 1; r < 5; r++){ //오른쪽 검사
                    //System.out.println("[오른쪽 검사 시작] r = " + r);
                    if (k + r > 18){
                        break;
                    }
                    if (map[i][k + r] != point || point == 0){
                        int n = k + r;
                        //System.out.println("[오른쪽 검사 중 포인트 다름] point = " + point + "[현재] point =" + map[i][k + r]);
                        break;
                    }
                    count++;
                    
                    if (count == 4){
                        win_color = point;
                        win_map[0][1] = i + 1;
                        win_map[1][0] = k + r - 1;
                        win = true;
                    }
                }
                count = 0;
                for (int d = 1; d < 5; d++){ //아래 검사
                    //System.out.println("[아래검사 시작] d = " + d);
                    int ex = k + d;
                    if (i + d > 18){
                        break;
                    }
                    if (map[i + d][k] != point || point == 0){
                        //System.out.println("[아래 검사 중 포인트 다름] point = " + point + "[현재] point =" + map[i + d][k]);
                        break;
                    }
                    count++;

                    if (count == 4){
                        win_color = win_color = point;
                        win_map[0][1] = i + d - 1;
                        win_map[1][0] = k + 1;
                        win = true;
                    }
                }
                count = 0;
                for (int w = 1; w < 5; w++){ //대각선 검사
                    if (k + w > 18 || i + w > 18){
                        break;
                    }
                    if (map[i + w][k + w] != point || point == 0){
                        break;
                    }
                    count++;
                    
                    if (count == 4){
                        win_color = point;
                        win_map[0][1] = i + w - 1;
                        win_map[1][0] = k + w - 1;
                        win = true;
                    }
                }
                count = 0;
                for (int f = 1; f < 5; f++){ //대각선 검사
                    if (i + f >= 19 || k - f < 0) {
                        break;
                    }
                    if (point == 0) {
                            break;
                        }

                    if (map[i + f][k - f] != point){
                        break;
                    }else {
                        //System.out.println("[대각선 검사 중 포인트 찾음] point = " + point + ",[현재] point =" + map[i - f][k - f] + "[좌표] =" + i + k + f);
                    }
                    count++;
                    
                    if (count == 4){
                        win_color = point;
                        //System.out.println("[대각선 검사 중 포인트 다름] point = " + point + "[현재] point =" + map[i - f][k - f]);
                        win_map[0][1] = i + f - 1;
                        win_map[1][0] = k - 1;
                        win = true;
                    }
                }
            }
        }
        System.out.println(win_color);
        System.out.println(win_map[0][1] + " " + win_map[1][0]);

    }
}