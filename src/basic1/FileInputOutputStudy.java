package basic1;

import java.io.*;

public class FileInputOutputStudy {
    public static void main(String[] args) throws IOException {
        // fileWriterTest();

        // printWriterTest();

        // appendFileWriterTest();

        // appendPrintWriterTest();

        // bufferFileReadTest();


    }

    public static void fileWriterTest() throws IOException {
        // 1. 파일 쓰기
        // FileWriter
        FileWriter fw = new FileWriter("./memo.txt");
        String memo = "헤드라인 \n";
        fw.write(memo);

        memo = "1월 1일 날씨 맑음";
        fw.write(memo);
        fw.close(); // 파일이 쓰인 후에는 항상 닫아줘야 한다.
    }

    public static void printWriterTest() throws FileNotFoundException {
        //PrintWriter
        PrintWriter pw = new PrintWriter("./memo2.txt");
        String memo2 = "헤드 라인-printWriter";
        pw.println(memo2);

        memo2 = "1월 1일 날씨 맑음-printWriter";
        pw.println(memo2);

        pw.close();
    }

    public static void appendFileWriterTest() throws IOException {
        // 파일 이어쓰기
        FileWriter fw2 = new FileWriter("./memo.txt", true); // append가 true면 파일을 이어 쓰겠다 라는 의미

        String memo3 = "\n12월 25일 크리스마스";
        fw2.write(memo3);

        fw2.close();
    }

    public static void appendPrintWriterTest() throws IOException {
        // printWriter로 파일 이어쓰기
        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt",true));

        String memo = "12월 26일은 크리스마스 다음날!!";
        pw2.println(memo);
        pw2.close();
    }

    public static void bufferFileReadTest() throws IOException {
        // 2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));
        while (true){
            String line = br.readLine();

            if ( line == null) {
                break;
            }
            System.out.println(line);
        }
        br.close();
    }
}
