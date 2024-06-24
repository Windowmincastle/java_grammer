import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine()); // 목표 값 읽기
        int count = 0; // 가능한 방법의 수를 세기 위한 변수
        int start = 1; // 시작 포인터
        int end = 1; // 끝 포인터
        int currentSum = 1; // 현재 합계

        while (start <= end) {

            if (currentSum == target) { // 현재 합계가 목표 값과 같다면
                count++; // 방법의 수 증가
            }

            if (currentSum < target) { // 현재 합계가 목표 값보다 작다면
                end++; // 끝 포인터 이동
                currentSum += end; // 현재 합계에 끝 포인터 값 추가
            } else { // 현재 합계가 목표 값보다 크거나 같다면
                currentSum -= start; // 현재 합계에서 시작 포인터 값 제거
                start++; // 시작 포인터 이동
            }
        }
        System.out.println(count); // 결과 출력
    }
}
