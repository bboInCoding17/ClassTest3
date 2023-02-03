package calculator;

import java.util.Scanner;

public class Calculator_풀이Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator_풀이 c = new Calculator_풀이();



        System.out.print("첫 번째 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 : ");
        String oper = sc.next();

        //c객체의 num1과 num2에 입력받은 수를 저장
        //첫 번째 방법 : 두 수를 세팅하는 메소드 정의
        c.setData(num1,num2);
        //두 번째 방법 : c라는 객체 생성과 동시에 두 수를 세팅
        //Calculator_풀이 c1 = new Calculator_풀이(num1,num2);//객체 선언


        //조건이 범위 일 때 if
        //특정한 범위, 값으로 설정되어 있다면 switch case 이용하기

        //if 문으로 쓰려면 a.equals(b) 사용해서 문법 조건문 사용하기

        switch (oper){
            case "+":
                System.out.print(num1 + " "+ oper +" "+ num2+" "+ " = " + c.sum());
                break;
            case "-":
                System.out.print(num1 + " "+ oper +" "+ num2+" "+ " = " + c.sub());
                break;
            case "*":
                System.out.print(num1 + " "+ oper +" "+ num2+" "+ " = " + c.multi());
                break;
            case "/":
                System.out.print(num1 + " "+ oper +" "+ num2+" "+ " = " + c.divide());
                break;
            default :
                System.out.println("잘못 입력하셨습니다.");
        }

















    }
}
