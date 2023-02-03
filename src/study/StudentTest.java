package study;

public class StudentTest {
    public static void main(String[] args) {
        //Student 객체가 저장 될 수 있는 5개의 배열 공간 생성
       Student[] students = new Student[5];//Student 가 들어갈 수 있는 길이 5개 형성, 기본값null

        //이름 김길동, 점수는 90점 으로 초기값 갖는 학생 객체 s1 생성(생성자 이용)
        Student s1 = new Student("김길동", 90);

        //이름 이길동, 점수는 80점 으로 초기값 갖는 학생 객체 s2 생성(생성자 이용)
        Student s2 = new Student("이길동", 80);
        //

        //이름 박길동, 점수는 70점 으로 초기값 갖는 학생 객체 s3 생성(생성자 이용)
        Student s3 = new Student("박길동", 70);

        //students 배열의 각 요소에 정보 넣어 줌
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //새 객체 생성 및 값 설정, 변수에 대입 동시에 가능.
        students[3] = new Student("정길동", 60);
        students[4] = new Student("최길동", 50);


        //1. 배열에 들어간 학생 중 이름이 정길동인 학생의 점수를 출력해봐라
        for(int i = 0; i<students.length; i++){
            if(students[i].getName().equals("정길동")){
                System.out.println(students[i].getScore());
                break;
            }// students[i]는 Student 자료형, getName은 String 자료형 -> 자료형 된다
            //자료형 일치 확인 문법은 .equals()
        }

        //1번  for-each문으로 풀어보기
        for(Student e : students){//e -> each, Student 자료형의 students배열 요소 각각 분석
          if(e.getName().equals("정길동")){
              System.out.println(e.getScore());
              break;
          }
        }


        //2. 배열에 저장된 모든 학생들의 점수의 합 출력
        int sum=0;
        for(int i =0; i<students.length; i++){
           sum = sum + students[i].getScore();
            System.out.println(sum);
        }
        //2번 for -each구무능로
        int sum1=0;
        for(Student e : students){
            sum1 = sum1 + e.getScore();
        }


        //3. 배열에 저장된 학생 중 점수가 70점 이상인 학생들의 이름, 점수 출력
       for(int i =0; i<students.length; i++){
           if(students[i].getScore() >=70){
               System.out.println("이름 : " + students[i].getName());
               System.out.println("점수 : " + students[i].getScore());
           }
       }
        for(Student e : students){
           if( e.getScore() >= 70){

           }
        }
    }
}
