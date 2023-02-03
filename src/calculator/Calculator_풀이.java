package calculator;

public class Calculator_풀이 {
    private int num1, num2;
    private String oper;

    public Calculator_풀이(){

    }

    public Calculator_풀이(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setData(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }



    public int sum(){
        return num1 +num2;
    }

    public int sub(){
        return num1 - num2;

    }
    public int multi(){
        return num1 * num2;

    }
    public double divide(){
        return num1 / (double)num2;

    }

}
