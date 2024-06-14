//루트(최상단) 패키지는 src
// *을 통해 패키지내에 모든 클래스 import 가능
// *을 통해 패키지까지 포함해서 모든 내용 import는 불가능
// 즉 import java.* 이것은 불가

package C03상속.ProtectedMain;

import C03상속.C0304ProtectedClass;
import C03상속.C0304ProtectedTest;

public class ProtectedMain extends C0304ProtectedClass {

    public static void main(String[] args) {

        C0304ProtectedClass c1 = new C0304ProtectedClass();

        ProtectedMain p1 = new ProtectedMain();

        System.out.println(p1);
    }
}
