package stu_manage;

import java.util.Scanner;

public class StudentManage {
    Scanner sc;//스캐너 선언만
    Student[] students; // 학생 정보를 저장할 배열 선언만
    int index ;// 배열 순서 변수 선언

    public StudentManage(){
        sc = new Scanner(System.in);//생성자에서 스캐너 초기화
        students = new Student[3]; //생성자에서 배열 초기화(공간 3)
        index =0; // 생성자에서 순서 초기화, 학생이 얼마나 등록 되었는지 저장하는 변수
    }

    //1. 학생 등록 기능
    public void regStudent(){
        //학생이 3명을 초과하면 등록 금지
        if(index<3){
            System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");

            System.out.print("이름 : " );
            String name = sc.next();

            System.out.print("나이 : " );
            int age = sc.nextInt();

            System.out.print("연락처 : ");
            String tell = sc.next();

            System.out.print("학점 : " );
            String grade = sc.next(); // 키보드로 정보만 입력(저장은 아님),
            //Student 클래스에 키보드 정보 저장할 생성자 생성

            //입력받은 정보를 가진 학생 객체를 생성
            Student stu = new Student(name, age, tell , grade);

            //생성한 객체를 배열에 저장
            students[index] = stu;
            index++;//students 배열의 공간은 3개 [0],[1],[2], index가 3가 되면 오류뜸
            //if문으로 index가 3 이전까지 진행되도록 제한 둠
        }
        else{
            System.out.println("더 이상 등록이 불가합니다.");
        }
    }

    // 학생정보변경(연락처) 기능
    public void setStuInfo(){
        System.out.println("학생의 연락처를 변경합니다.");

        System.out.print("변경 학생 : ");
        String name = sc.next();

    }
    // 학생 정보 출력기능 , 언제 정확하게 이름을 일치하게 입력할 지 모르니 반복 무한 루프를 돌린다.
    //동명이인은 없다는 가정 하에 문제 풀이.
    public void showStuInfo(){
        boolean flag = true;

        while(flag){
            System.out.print("정보를 열람할 학생 : ");
            String inputName = sc.next();//키보드로 학생 이름 받는다.

            //배열 students에 저장된 정보를 가져온다. students에 저장된 정보는 index에 저장되어 있다.
            //Student 클래스의 getName 메소드 사용한다.
            for(int i = 0; i <index; i++){
                //students 배열에 저장된 학생의 이름이 키보드에서 입력된 정보와 같은 지 물어본다.
                if(students[i].getName().equals(inputName)) {
                    System.out.println();//보기 좋게 한 줄 개행
                    System.out.print("정보를 열람할 학생 : " + inputName);
                    students[i].printInfo();//students배열에 저장된 학생의 이름을 찾고, 학생의 정보를 나열한다.
                    flag = false; //for문에서 답을 찾은 후 무한루프를 벗어나기 위함
                    break;//for을 종료
                }
                if(flag) {
                    System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요. ");
                }//while이 true일 때, 입력된 정보와 일치 하지 않는 경우 안내 문구 출력 됨
            }
        }
    }


    // 모든 학생의 정보 출력 기능
    public void showAllInfo(){
        if(index == 0){
            System.out.println("현재 등록 된 학생이 없습니다. ");
        } else {
        System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 "+ index + " 명 입니다.");
        }
        for(int i =0; i<index; i++){
        students[i].printInfo();
        }
    }
}
