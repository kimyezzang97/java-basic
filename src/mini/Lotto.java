package mini;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 2023.12.07
 * writer : zeroBase backend 20기 김예찬
 * title : lotto
 */
public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("[로또 당첨 프로그램]");

        Scanner sc = new Scanner(System.in);
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        int buyCnt = sc.nextInt();
        sc.nextLine();

        char c = 'A';
        int[][] arr = new int[buyCnt+1][6];
        for(int i=0; i<=buyCnt; i++){
            if(i!=buyCnt) System.out.print((char)(c+i) + "\t");
            for(int j=0; j<6; j++){
                arr[i][j] = (random.nextInt(45)+1);
                for(int k=0; k<j; k++){ // 중복 제거
                    if(arr[i][j] == arr[i][k]){
                        j--;
                        break;
                    }
                }
            }
            Arrays.sort(arr[i]); // 정렬
            for(int j=0; j<6; j++){
                if(i!=buyCnt) System.out.print(String.format("%02d", arr[i][j]));
                if(j!=5 && i!=buyCnt) System.out.print(",");
            }
            System.out.println();
        }

        // 로또 발표
        System.out.println("[로또 발표]");
        System.out.print("\t");
        for(int i=0; i<6; i++){
            System.out.print(String.format("%02d", arr[arr.length-1][i]));
            if(i!=5) System.out.print(",");
        }

        System.out.println("\n\n[내 로또 결과]");
        c = 'A';
        for(int i=0; i<buyCnt; i++){
            int cnt = 0;
            if(i!=buyCnt) System.out.print((char)(c+i) + "\t");
            for(int j=0; j<6; j++){
                for(int k=0; k<6; k++){
                    if(arr[i][j] == arr[arr.length-1][k]) cnt++;
                }
                if(i!=buyCnt) System.out.print(String.format("%02d", arr[i][j]));
                if(j!=5 && i!=buyCnt) System.out.print(",");
            }
            System.out.println(" => " + cnt + "개 일치");
        }
    }
}
