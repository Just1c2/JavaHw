package trainning.exception;

public class TryCatchDemo {
   public void TryCatchDemo() {
       int a = 10;
       int b = 0;
       try {
           int c = a / b;
           System.out.println(c);
       }catch (Exception e) {
           System.out.println("lop exception");
       }finally {
           System.out.println("luon dc thuc thi");
       }
   }
}
