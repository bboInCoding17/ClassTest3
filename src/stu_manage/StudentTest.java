package stu_manage;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManage sm = new StudentManage();

        System.out.println("학생관리 프로그램을 실행합니다.");

        //
        while(true){
            System.out.print("1)학생 등록 2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력 5)프로그램 종료 : ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    sm.regStudent();
                    break;
                case 2:
                    sm.setStuInfo();
                    break;
                case 3:
                    sm.showStuInfo();
                    break;
                case 4:
                    System.out.println("모든 학생 정보 출력");
                    sm.showAllInfo();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);//프로그램 종료(무한루프 종료)
            }
        }



    }
}
