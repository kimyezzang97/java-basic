import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 선언

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다. // 엔터 전까지 가져온다.
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt(); // 입력을 int로 가져온다.
        System.out.println("입력한 정수 : " + intValue);

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble(); // 입력을 double로 가져온다.
        System.out.println("입력한 실수 : " + doubleValue);
    }
}
