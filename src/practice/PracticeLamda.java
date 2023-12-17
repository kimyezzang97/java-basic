package practice;
// Lamda 연습

interface CompareToolPractice {
    public abstract int getMaxNum(int num1, int num2);
}
public class PracticeLamda {
    public static void main(String[] args) {
        CompareToolPractice compareToolPractice = new CompareToolPractice() {
            @Override
            public int getMaxNum(int num1, int num2) {
                return num1 > num2 ? num1 : num2;
            }
        };
        System.out.println(compareToolPractice.getMaxNum(10, 11));

        // 람다식으로 작성
        CompareToolPractice compareToolPractice2 = (x, y) -> {return x > y ? x : y;};
        System.out.println(compareToolPractice2.getMaxNum(10, 11));
    }
}
