package study;

public class MemberTest {
    public static void main(String[] args) {
        //Member 클래스에 대한 객체를 3개 저장할 수 있는 배열을 만들어서
        //각 배열에 Member객체를 저장해보자.


        //Member 객체가 들어갈 수 있는 공간 3개를 생성
        // Member [] members= new Member[];//Member라는 자료형 배열을 선언

        Member[] members;
        members = new Member[3];//자료형 Member에 공간 3개인 주소를 members에 선언

        //Member 객체 생성
        Member m1 = new Member();// 기본 값 null, 0
        m1.setInfo("홍길동", 20);//m1 객체에 값 넣어줌
        members[0] = m1;//members 배열 0번째에 m1 객체 값 넣음



        Member m2 = new Member();// 기본 값 null, 0
        m2.setInfo("이순신", 30);//m2 객체에 값 넣어줌
        members[1] = m2;//members 배열 1번째에 m2 객체 값 넣음


        Member m3 = new Member();// 기본 값 null, 0
        m3.setInfo("유관순", 40);//m3 객체에 값 넣어줌
        members[2] = m3;//members 배열 2번째에 m3 객체 값 넣음


        //members 배열에 0번째 요소에 들어간 회원 정보를 출력
        members[0].showInfo();


        //1. members 배열에 저장된 모든 회원 정보 출력
        for(int i =0; i<members.length; i++){
            members[i].showInfo();
        }


        //2. members 배열에 저장된 모든 회원 정보 출력
        //for - each문
        //for(자료형 e : 객체명)
        //members의 요소에는 Member 자료형을 저장하는 배열이니, 자료형 자체가 Member
      for(Member e : members){
          e.showInfo();

      }



    }
}
