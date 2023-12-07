package mini;

import java.util.Random;
import java.util.Scanner;


/**
 * 2023.12.07
 * writer : zeroBase backend 20기 김예찬
 * title : 가상 선거
 */
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int totalVote = sc.nextInt();
        sc.nextLine();

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int candidateCnt = sc.nextInt();
        sc.nextLine();

        String[] arrStr = new String[candidateCnt];
        int[] arrInt = new int[candidateCnt];
        for(int i=0; i<candidateCnt; i++){
            System.out.print((i+1)+"번째 후보자이름을 입력해주세요.");
            arrStr[i] = sc.nextLine();
        }

        int max = 0;
        int maxNum = 0;

        Random random = new Random();
        for(int i=1; i<=totalVote; i++){
            int vote = (random.nextInt(candidateCnt)+1);
            System.out.print("\n[투표진행률]: ");
            System.out.printf("%.2f",((double)i / totalVote * 100));
            System.out.println("%, " + i + "명 투표 => " + arrStr[vote-1]);

            arrInt[vote-1] = (arrInt[vote-1] + 1);

            for(int j=0; j<candidateCnt; j++){
                System.out.print("[기호:" + (j+1) + "] " + arrStr[j] + ":\t");
                System.out.printf("%.2f",(arrInt[j] / (double)i) * 100);
                System.out.println("%\t" + "(투표수: " + arrInt[j] + ")");
            }

            for(int k=0; k<candidateCnt; k++){
                if(max<arrInt[k]) {
                    max = arrInt[k];
                    maxNum = k;
                }
            }
        }
        System.out.println("[투표결과] 당선인 : " + arrStr[maxNum]);
    }
}
