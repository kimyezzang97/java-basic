package practice;

import java.util.Scanner;

/**
 * 문제 : 입력된 정수 자료형의 숫자를 거꾸로 변환하는 프로그램
 * ex) 12345 -> 54321
 * ex) 100 -> 1
 * ex) -12345 -> -54321
 */
public class Practice1_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();
        if(num < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb.append("-");
            String str = String.valueOf(num).substring(1);
            sb2.append(str).reverse();
            sb.append(sb2);
        } else {
            sb.append(num);
            sb.reverse();
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
