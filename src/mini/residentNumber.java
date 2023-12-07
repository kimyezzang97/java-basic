package mini;

import java.util.Random;
import java.util.Scanner;

/**
 * 2023.12.07
 * writer : zeroBase backend 20기 김예찬
 */
public class residentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year = sc.nextLine();

        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = sc.nextLine();

        System.out.print("출생일을 입력해 주세요.(dd):");
        String day = sc.nextLine();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.nextLine();

        System.out.println(result(year, month, day, gender));
    }

    public static String result(String year, String month, String day, String gender){
        String result = year.substring(2) + month + day + "-";
        int birth = Integer.parseInt(year);

        if(birth >= 2000 && gender.equals("m")) result += 3;
        else if (birth < 2000 && gender.equals("m")) result += 1;
        else if (birth >= 2000 && gender.equals("f")) result += 4;
        else result += 2;

        Random random = new Random();
        result += (random.nextInt(999999)+1);

        return result;
    }
}
