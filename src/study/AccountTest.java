package study;



public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();


        a1.iyul =10.0;//정보 변경 설정.
       // a2.iyul =10.0;
        a3.iyul =10.0;

        System.out.println(a1.iyul);//정보 변경 공유
        System.out.println(a2.iyul);
        System.out.println(a3.iyul);

        Account a4 = new Account();//정보 변경 된 상태에서 객체가 추가 되면, 객체는 변경된 정보가 적용 된다.
       // System.out.println(a4.iyul);//10.0 - iyul은 공용 변수로 a4 객체의 것만이 아니다
        System.out.println(Account.iyul); //-공용 변수로 선언된 클래스명.공용변로 로 표현해주다.
    }
}
