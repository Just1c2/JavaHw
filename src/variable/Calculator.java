package variable;

public class Calculator {
    int num1 = 20;
    int num2 = 30;

    public int add(){
        int sum = num1 + num2;

        return sum;
    }
    public int subtract(){
        int sub = num1 - num2;
        return sub;
    }
    public int multi(){
        return num1 * num2;
    }
    public float div(){
        return (float) num1 / num2;
    }

   /* public static void main(String[] args){
        //tao doi tuong aka "banh"
        Calculator calculator = new Calculator();//tao xong 1 doi tuong
        int result = calculator.add();
        System.out.println(result);
        System.out.println(calculator.subtract());
        System.out.println(calculator.multi());
        System.out.println(calculator.div());
    }*/


}
