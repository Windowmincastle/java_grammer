package 문제풀이;

import java.util.Map;
import java.util.TreeMap;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {

        int n = 1;
        String[] strings = {"sun", "bed", "car"};

        Map<String, String> treemap = new TreeMap<>();

        for (String s : strings) {
            treemap.put(s.charAt(n) + s, s);
        }

        String[] answer = new String[strings.length];

        int cnt = 0;
        for (String s : treemap.values()) {
            answer[cnt] = s;
            cnt++;
        }

    }
}
