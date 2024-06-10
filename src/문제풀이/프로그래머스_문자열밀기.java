package 문제풀이;

public class 프로그래머스_문자열밀기 {

    //코테에서는 StringBuilder 쓰면 된다.
    class Solution {
        public int solution(String A, String B) {
            int answer = -1;
            String temp = A;
            for(int i = 0 ; i < A.length() ; i++){

                if(temp.equals(B)){
                    answer = i;
                    break;
                }
                temp = temp.charAt(A.length()-1) + temp.substring(0, A.length()-1);

            }
            return answer;
        }
    }

    public static void main(String[] args) {

        String A = "hello";
        String B = "ohell";


    }
}
