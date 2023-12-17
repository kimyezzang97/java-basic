package basic1;

// 람다식 기초

interface ComputeTool{
    public abstract int compute(int x, int y);
}

public class LamdaStudy {
    public static void main(String[] args) {
        // 기본
        ComputeTool computeTool = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };
        System.out.println(computeTool.compute(1,2));

        // 람다식
        ComputeTool computeTool2 = (x, y) -> {return x + y;};
        System.out.println(computeTool2.compute(1, 2));
    }
}
