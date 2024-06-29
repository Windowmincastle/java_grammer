package C06EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0604Iterator {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("슈가슈가룬");
        lst.add("피구왕통키");
        lst.add("원피스");

//        enhanced for 문 : 원본 변경 불가
        for (String s : lst) {
            System.out.println(s);
        }

//      Iterator는 원본을 변경할 수 있다. 앵간한 컬렉션 객체에는 내장이 되어있다.
//      참조하고있는 원본데이터 삭제 가능
        System.out.println("iters문 실행");
        Iterator<String> iters2 = lst.iterator();
        while (iters2.hasNext()) {
            if (iters2.next().equals("슈가슈가룬")) {
                iters2.remove();
            }

        }

        System.out.println(lst);
    }

}
