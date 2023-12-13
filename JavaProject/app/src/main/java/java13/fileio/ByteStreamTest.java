package java13.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
    public static void main(String[] args) {
        // [1] FileInputStream / FileOutputStream
        // Checked Exception
        FileInputStream smuIn = null;
        FileOutputStream smuOut = null;

        try {
            smuIn = new FileInputStream("./JavaProject/app/src/main/java/java13/fileio/smart.txt");
            smuOut = new FileOutputStream("./JavaProject/app/src/main/java/java13/fileio/smart02.txt");

            int ch;
            while ((ch = smuIn.read()) != -1) {
                smuOut.write(ch);
            }
            System.out.println("[1] FileInputStream / FileOutputStream");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // printStackTrace() : error를 console에 상세하게 찍어주는 메소드
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // finally : 모든 exception을 건너뛰고도 무조건 실행해야하는 부분
            try {
                if (smuIn != null)
                    smuIn.close();
                if (smuOut != null)
                    smuOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // [2] try ~ with ~ resource로 FileInputStream / FileOutputStream 구현
        try (
                FileInputStream smuIn2 = new FileInputStream(
                        "./JavaProject/app/src/main/java/java13/fileio/smart02.txt");
                FileOutputStream smuOut2 = new FileOutputStream(
                        "./JavaProject/app/src/main/java/java13/fileio/smart03.txt")) {
            int ch2;
            while ((ch2 = smuIn2.read()) != -1) {
                smuOut2.write(ch2);
            }
            System.out.println("[2] try ~ with ~ 구현");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // [3] BufferedInputStream / BufferedOutputStream. BufferedStream이 더 빠르다
        try (
                BufferedInputStream in = new BufferedInputStream(
                        new FileInputStream("./JavaProject/app/src/main/java/java13/fileio/smart03.txt"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(
                        "./JavaProject/app/src/main/java/java13/fileio/smart04.txt"))) {
            int ch3;
            while ((ch3 = in.read()) != -1) {
                out.write(ch3);
            }
            System.out.println("[3] BufferedInputStream / BufferedOutputStream");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
