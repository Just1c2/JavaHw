package trainning.filetraining;

import trainning.filedemo.ReadFileData;

import java.io.*;


public class ReadWriteObject {
    public static void readData() {
        try {
            File f = new File("text.txt");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i = bis.read()) != - 1) {
                System.out.println((char) i);
            }
            System.out.println("");
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void writeData(String str) {
        byte[] b = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("text.txt");
            fos.write(b);
            fos.flush();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadFileData d = new ReadFileData();
        readData();
        writeData("hom nay hoc java.io");
    }
}
