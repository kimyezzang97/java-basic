package mini;

/**
 * 2023.12.04
 * writer : zeroBase backend 20기 김예찬
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                writeStringFormat(i, j);
            }
            System.out.println("");
        }
    }

    public static void writeStringFormat(int a, int b){
        System.out.print(String.format("%02d",b) + " X " + String.format("%02d",a) + " = " + String.format("%02d", b*a) + "\t");
    }
}

