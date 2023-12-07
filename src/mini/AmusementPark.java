package mini;

import java.util.Scanner;

/**
 * 2023.12.07
 * writer : zeroBase backend 20기 김예찬
 */
public class AmusementPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();
        sc.nextLine();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String merit = sc.nextLine();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = sc.nextLine();

        int result = calResult(age, time, merit, card);
        System.out.print("입장료 : " + result);
    }

    public static int calResult(int age, int time, String merit, String card){
        int result = 0;

        if(age < 3) result = 0;
        else if (time >= 17 || age < 13) result = 4000;
        else if(merit.equals("y") || merit.equals("Y") || card.equals("y") || card.equals("Y")) result = 8000;
        else result = 10000;

        return result;
    }
}
