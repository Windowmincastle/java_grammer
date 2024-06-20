package C10Refiection;

import com.mysql.cj.protocol.Message;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.nio.file.Files;

public class C10Validation {

    public static void main(String[] args) throws IllegalAccessException {

        User user = new User("hong", "");
        validate(user);
    }

    static void validate(Object object) throws IllegalAccessException {
//        런타임 이니까 무슨 객체가 들어올지 모르니까 실시간으로 조사해야한다.
        Class<?> myClass = object.getClass();
        Field[] fields = myClass.getDeclaredFields();

        for (Field f : fields) {
            if (f.isAnnotationPresent(NotEmpty.class)) {
                f.setAccessible(true);
                String value = (String) f.get(object);
                if (value == null || value.isEmpty()) {
                    NotEmpty notEmpty = f.getAnnotation(NotEmpty.class);
                    throw new IllegalArgumentException(notEmpty.message());
                }
            }
        }
    }
}

class User{
    @NotEmpty(message="name은 필수 입력이야 임마 ")
    private String name;
    @NotEmpty(message ="이메일도 필수 입력인데요?")
    private String email;

    User(){

    }

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

//직접 만드는 일은 거의 없고 만들어진 것 을 사용할 일 밖에 없다.
//특정 필드의 값이 비어 있는지 아닌지 검사하는 어노테이션
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) // Filed : 변수 적용, Method : 메서드 적용 , TYPE 클래스 적용
//    어디다 이 NotEmpty를 적용할 것 이냐?
@interface NotEmpty{

    String message() default "빈자리 빠짐없이 넣어야지 이 사람아.";

}