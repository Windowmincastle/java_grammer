import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

//아직 미완성
public class note {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[][] ary = new String[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                ary[i][j] = String.valueOf(line.charAt(j));
            }
        }

//      W로 시작하는 경우
        String case1 = "";
        int cnt = m/2;
        for (int i = 0; i < cnt; i++) {
            case1 += "WB";
        }

//      B로 시작하는 경우
        String case2 = "";
        for (int i = 0; i < cnt; i++) {
            case2 += "BW";
        }

        if (ary[0][0] == "W") {



        } else if (ary[0][0] == "B") {

        }
//      아이디어 1
//      각 열의 개수가 주어지니까
//        행 단위로 W가 몇갠지 B가 몇갠지 둘이 반반이 되어야하니까
//        그걸로 수정해야하는 카운트를 세면 안되나?


        // case1과 case2로 나누어서  8x8로 짜른 체스판의
//        각 행에 접근해서 고쳐야할 수를 카운트한다
//        그리고 min 변수를 두고 각 반복문마다 최소 개수를 갱신해준다.




//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(ary[i][j]);
//            }
//            System.out.println();
//        }

    }
}
