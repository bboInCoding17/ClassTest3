package study;

import java.sql.SQLOutput;
import java.util.SortedMap;
//static은 변수 및 메소드에서 사용 가능하다.
//static이 선언된 변수 및 메소드는 공용이다.
//static이 붙은 변수 및 메소드는 자바 문법상 클래스 안에서
//선언 및 초기화 되지만, 클래스에 속한 것은 아니다.
//(java는 기본적으로 모든 코드는 클래스 안에서 작성되어야 한다는
//규칙 상 변수나 메소드가 작성되는 거임! )
//static 변수 및 메소드는 객체가 생성되기 전에 선언 및 초기화 된다.
public class CntTest {
    public static void main(String[] args) {
        Cnt c1 = new Cnt();
        Cnt c2 = new Cnt();
        Cnt c3 = new Cnt();
        //객체 생성할 때, 별도로 num의 값을 가지며 서로 공유하지 않는다.!
        //다만 변수 선언 때, static이 붙으면 각 객체까리 num을 공유한다.
    }
}

class Cnt{
    static int num =0;//Cnt 클래스와 변수 num은 상호작용하지는 않는다.

    public Cnt(){
        num++;
        System.out.println("객체생성 "+num);
    }

}
