package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {

//    자바에서는 비교를 위한 인터페이스 2개를 제공한다.
//    Comparable , Comparator
//    COmparable 인터페이스에는 CompareTo메서드 선언
//    Comparator 인터페이스에는 compare메서드 선언
//    두 문자열의 각 자리를 순차적으로 비교한다.
//    문자열의 비교는 유니코드 값의 차이를 반환한다.
    public static void main(String[] args) {
    //    String 클래스에 compareTo 내장 (Comparable을 구현)
//        String a = "hello";
//        String b = "horld";
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 10; // 래퍼클래스에서만 가능한가?
//        System.out.println(a1.compareTo(a2));

        List<String> lst = new ArrayList<>();
        lst.add("java");
        lst.add("python");
        lst.add("javascript");

//        정렬 1
        Collections.sort(lst);//내부적으로 Comparabble의 compareTo 메서드를 구현하여 정렬
        System.out.println(lst);
//        정렬 2
        Collections.sort(lst, Comparator.reverseOrder());
        System.out.println(lst);

        lst.sort(Comparator.naturalOrder());
        lst.sort(Comparator.reverseOrder());

        Student stn1 = new Student("김민성", 33);
        Student stn2 = new Student("김수연", 34);
        Student stn3 = new Student("황요한", 35);
        Student stn4 = new Student("홍예지", 36);
        Student stn5 = new Student("최아영", 37);

        List<String> stnlst = new ArrayList<>();
        stnlst.add(stn1.name);
        stnlst.add(stn2.name);
        stnlst.add(stn3.name);
        stnlst.add(stn4.name);
        stnlst.add(stn5.name);

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim",24));
        students.add(new Student("park",21));
        students.add(new Student("lee",35));
        students.add(new Student("park",15));
        students.add(new Student("choi",30));
        students.add(new Student("kim",26));

        Collections.sort(students); //이렇게 찍으면 메모리 주소가 나옴

        for (Student s : students) {
            System.out.print(s.getName()+",");

        }
        System.out.println();
        for (Student s : students) {
            System.out.print(s.getAge()+",");
        }



//        students.sort(Comparator.reverseOrder()); 이것도 안됌
//        객체 정렬은 많이 안 해봤기 때문에 꼭 필요한 내용이다.

//  방법 1.       Student 객체에서 Comparable을 구현 => compareTo메서드를 오버라이딩
//  방법 2.     Comparator를 구현한 익명 객체를 sort에 주입
//        방법 2. Comparator를 구현한 익명객체를 sort에 주입
        Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
                return o1.getName().compareTo(o2.getName());
            }
        };


//        students.sort((o1,o2) -> o1.getAge() - o2.getAge());
        students.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));

        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }

//
        String[] str2 = {"hello", "java", "C++", "world2"};
        Arrays.sort(str2, Comparator.reverseOrder());
//        요구사항 : 아래 문자열을 글자길이 순서로 내림차순 정렬 하여라
        Arrays.sort(str2, (a, b) -> b.length() - a.length());
        System.out.println(Arrays.toString(str2));

//      [4,5],[1,2],[5,0],[3,1]
// 위 배열이 들어간 아래 리스트를 1번쨰를 기준으로 내림차순 정렬
        List<int[]> lst2 = new ArrayList<>();
        lst2.add(new int[]{4, 5});
        lst2.add(new int[]{1, 2});
        lst2.add(new int[]{5, 0});
        lst2.add(new int[]{3, 1});
//        lst2.sort((a, b) -> Integer.compare(b[0], a[0]));
        lst2.sort((a,b)->b[1]-a[1]);


}

class Student implements Comparable<Student> {

    String name;
    int age;

    Student() {

    }

    Student(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
    }

//    toString 클래스를 객체 안에 적절하게 선언할 수 있다.
//    모든 클래스의 조상 클래스인 object 클래스의 조상 클래스인 Object 클래스의 toString 메서드를 오버라이딩하여
//    객체 호출시에 자동으로 toString메서드 호출


    //나중에 객체 개발할 때 활용하면 되겟다.
    @Override
    public String toString() {
        return "이름:" + this.name+", 나이: " + this.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Student s) {
//        return this.name.compareTo(s.getName());
        return this.age - s.getAge();
    }
  }
}
