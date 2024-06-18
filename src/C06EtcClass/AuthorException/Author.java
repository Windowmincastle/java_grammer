package C06EtcClass.AuthorException;
// 객체 그 자체를 Entity라고 부른다.
// 테이블과 맵핑 되는 개념이다.

/*
id,name,email,password
생성자에서 초기화 한다
getter로만 구성
 */
public class Author {

    private static Long static_id = 0L;
    private Long id = 0L;
    private String name;
    private String email;
    private String password;

    Author() {

    }

    Author(String name, String email, String password) {
        static_id += 1;
        id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
