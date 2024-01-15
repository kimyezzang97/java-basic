package mini.surprise;

import java.util.Scanner;

// 입력 받은 좌표와 가장 가까운 값
public class SurpriseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ogX = sc.nextInt();
        sc.nextLine();
        int ogY = sc.nextInt();
        sc.nextLine();

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int cnt = 0;
        while(cnt != 10){
            int temp1 = sc.nextInt();
            sc.nextLine();
            int temp2 = sc.nextInt();
            sc.nextLine();
            boolean status = true;
            for(int i = 0; i<arr1.length; i++){
                if(arr1[i] == temp1){
                    if(arr2[i] == temp2) {
                        status = false;
                    }
                }
            }
            if(status) {
                arr1[cnt] = temp1;
                arr2[cnt] = temp2;
                cnt++;
            }
        }

        int sum = 10000;
        int min1 = 0;
        int min2 = 0;
        for(int i=0; i<10; i++){
            int tmpSum1 = 0;
            int tmpSum2 = 0;
            tmpSum1 = arr1[i] - ogX;
            if(tmpSum1 < 0) tmpSum1 *= -1;
            tmpSum2 = arr2[i] - ogY;
            if(tmpSum2 < 0) tmpSum2 *= -1;
            if(sum > tmpSum2 + tmpSum1) {
                min1 = arr1[i];
                min2 = arr2[i];
                sum = min1 + min2;
            }
        }

        System.out.println("(" + min1 + ", " + min2 + ")");
    }
}
