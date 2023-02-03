package stu_manage;

public class Student {
    private String name;
    private int age;
    private String grade;
    private String tell;

    //StudentMamage에서 키보드로 입력받은 학생 정보를 저장하는 생성자 설정
    public Student(String name, int age, String tell, String grade){
        this.name = name;
        this.age = age;
        this.tell = tell;
        this.grade = grade;

    }
    //학생의 모든 정보를 출력하는 메소드
    //이름 : 장길동, 나이 : 30, 연락처 : 010-0000-0000, 학점 : B
    public void printInfo(){
        System.out.println("이름 : "+ name + ", 나이는 : "+ age +", 연락처 : "+tell +", 학점 : "+grade);
    }
    //이름 정보를 가져 올 수 있는 메소드
    public String getName(){
        return name;
    }



}
