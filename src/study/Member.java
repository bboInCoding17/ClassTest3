package study;

public class Member {
    private String name;
    private int age;

    public void setInfo(String name, int age){
        this.name = name;
        this. age = age;

    }
    public void showInfo(){
        System.out.println("이름 : " +name );
        System.out.println("나이 : " + age );
    }


}
