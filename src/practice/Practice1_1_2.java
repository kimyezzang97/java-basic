package practice;

import java.util.Scanner;

/**
 * 아스키 코드 중 알파벳에 대해서 사용자가 입력한 알파벳의 대소문자를 변경하는 프로그램
 */
public class Practice1_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.next().charAt(0);
        sc.nextLine();
        if(num >= 97) num -= 32;
        else num +=32;
        System.out.println((char) num);
    }
}
