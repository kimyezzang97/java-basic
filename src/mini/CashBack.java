package mini;

import java.util.Scanner;

/**
 * 2023.12.07
 * writer : zeroBase backend 20기 김예찬
 */
public class CashBack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액): ");
        int tran = sc.nextInt();
        sc.nextLine();
        int cashBack = (tran / 10) > 300 ? 300 : (tran / 10);
        cashBack = (cashBack / 100) * 100;
        System.out.println("결제 금액은 " + tran + "원이고, 캐시백은 " + cashBack + "원 입니다.");
    }
}
