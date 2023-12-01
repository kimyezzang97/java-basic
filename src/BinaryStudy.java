public class BinaryStudy {
    public static void main(String[] args) {
        int numBase2 = 0b1100; // 2진수 대입 방법
        System.out.println("2진수 : " + numBase2);
        int numBase8 = 014; // 8진수 대입 방법
        System.out.println("8진수 : " + numBase8);
        int numBase16 = 0xC; // 16진수 대입 방법
        System.out.println("16진수 : " + numBase16);

        // 그대로 출력 방법
        System.out.println("0b" + Integer.toBinaryString(numBase2)); // 2진수
        System.out.println("0" + Integer.toOctalString(numBase8)); // 8진수
        System.out.println("0x" + Integer.toHexString(numBase16)); // 16진수
    }
}
