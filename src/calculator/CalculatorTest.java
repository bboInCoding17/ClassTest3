package calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("첫 번째 수 : ");
        int q = sc.nextInt();

        System.out.print("두 번째 수 : ");
        int qq = sc.nextInt();

        System.out.print("연산자 : ");
        String qqq = sc.next();
        c.setA();

        String result = "";
        result = q + qqq + qq;

        System.out.print(c.getNum1() + qqq + qq + " = "+ (result));

    }
}
