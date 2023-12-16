package basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputStudy {
    public static void main(String[] args) throws IOException {
        // systemInReadTest();

        // inputStreamReaderTest();

        // bufferedReaderTest();

        // scannerTest();
    }

    public static void systemInReadTest() throws IOException {
        // System.in
        System.out.println("== System.in ==");
        System.out.print("입력 : ");
        int a = System.in.read() - '0'; // 숫자값 입력시 문자를 받아오기에 아스키 코드를 빼서 숫자로 반환한다.
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 뒤에 받아오는 엔터키를 소진하기 위해
    }

    public static void inputStreamReaderTest() throws IOException {
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3];
        System.out.print("입력 : " ); // 12345
        reader.read(c);
        System.out.println(c); // 123
    }

    public static void bufferedReaderTest() throws IOException {
        // BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 : ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }

    public static void scannerTest(){
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력1 : ");
        System.out.println(sc.next());
        sc.nextLine(); // 엔터키 소진

        System.out.print("입력2 : ");
        System.out.println(sc.nextInt()); // 숫자 이외에 값을 입력시 예외가 발생함
        sc.nextLine();

        System.out.print("입력3 : ");
        System.out.println(sc.nextLine());
    }

}

