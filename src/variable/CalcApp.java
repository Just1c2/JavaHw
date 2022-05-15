package variable;

public class CalcApp {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Sum: "+calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multi());
        System.out.println(calculator.div());
    }
}
