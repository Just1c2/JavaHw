package trainning.filetraining;

import java.io.*;


public class Ex2 {
    public void readStu() {
        try {
            File file = new File("Student.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("");
            fileInputStream.close();
        }catch (Exception ex) {ex.printStackTrace();}
    }

    public void writeStu(String str) {
        byte[] b = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");
            fileOutputStream.write(b);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception ex) {ex.printStackTrace();}
    }

    public static void main(String[] args) {
        Ex2 d = new Ex2();
        d.readStu();
        d.writeStu("");
    }
}
