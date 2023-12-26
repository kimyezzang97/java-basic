package etc.duck;

public class for4_2 {
    public static void main(String[] args) {
        int num = 3;
        for(int i=0; i<num*2-1; i=i+2){
            for(int j=0; j<i; j=j+2){
                System.out.print(" ");
            }
            for(int k=i; k<(num*2-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=1; i<num; i++){
            for(int j=0; j<num-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k< 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
