package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 강사님코드 {
    //    static List<Inteer> myList;
//
//    static List<List<Integer>> answer;
//    static int count;g
    public static void main(String[] args) {

//        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
//        [[1,2], [1,3] [1,4], ...]
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0; i<myList.size()-1; i++){
//            temp.add(myList.get(i));
//            for(int j=i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                combinations.add(temp);
//                temp.remove(myList.size()-1);
//            }
//            temp.remove(myList.size()-1);
//        }

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> answer = new ArrayList<>();
//        combi(answer, new ArrayList<>(), myList, 2, 0);
//        permutation(answer, new ArrayList<>(), myList, 2, 0, new boolean[myList.size()]);
        System.out.println(answer);
    }
//    static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count ){
//        if(temp.size() == count){
//            answer.add(new ArrayList<>(temp)); //이 시점에 있는 temp 메모리 주소를 참조해라.
//            //그렇다면 재귀 호출을 통해서 temp list가 항상 새로 생길 것 이다.
//            return;
//        }
//        for(int i=start; i<myList.size(); i++){
//
//            temp.add(myList.get(i));
//
//            combi(answer, temp, myList, count ,i+1);
//
//            temp.remove(temp.size()-1);
//        }
//    }

    static void permutation(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start){

        int size = myList.size();
        boolean[] check = new boolean[size];
        for (int i = 0; i < check.length; i++) {
            check[i] = true;
        }

        if(temp.size() == count){
            answer.add(new ArrayList<>(temp)); //이 시점에 있는 temp 메모리 주소를 참조해라.
            //그렇다면 재귀 호출을 통해서 temp list가 항상 새로 생길 것 이다.
            return;
        }

        for(int i=0; i<myList.size(); i++){

            if (check[i] = false) continue;

            temp.add(myList.get(i));
            check[i] = false;
            permutation(answer, temp, myList, count ,i+1);
            temp.remove(temp.size()-1);

        }
    }
}