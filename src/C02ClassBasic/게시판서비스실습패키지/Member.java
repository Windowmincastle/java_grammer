package C02ClassBasic.게시판서비스실습패키지;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {

    private static Long static_id = 0L;
    static List<Member> members = new ArrayList<>();
    private Long id = 0L;
    String name;
    String email;

    Member() {

    }

    Member(String inputName, String inputEmail) {
        static_id += 1;
        id = static_id;
        this.name = inputName;
        this.email = inputEmail;
    }

    public void MemberTotalInquiry() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println("전체 사용자 목록 조회");
            System.out.println("-----------------------------");
            System.out.println(members.get(i).getId()+"/"+members.get(i).getId()+"/"+members.get(i).getName()+"/"+members.get(i).getEmail());
        }
    }

    public void SingleInquiry(String inputEmail) {

        System.out.println("회원 정보 상세 조회");
        System.out.println("-----------------");
        for (int i = 0; i < members.size(); i++) {

            if (members.get(i).getEmail().equals(inputEmail)) {
                System.out.println("ID :"+members.get(i).getId());
                System.out.println("Name :"+members.get(i).getName());
                System.out.println("Email :"+members.get(i).getEmail());
                System.out.println("-----------------");
                break;
            }
        }
    }

    public static Long getStatic_id() {
        return static_id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static List<Member> getMembers() {
        return members;
    }
}
