package etc.duck;

public class for4 {
    public static void main(String[] args) {
        for(int i=5; i>0; i=i-2){
            for(int k=5; k>i+1; k=k-2){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(" ");
        for(int k=0; k<3; k++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.print("*");
        }
    }
}
