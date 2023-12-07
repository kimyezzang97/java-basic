package mini;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Scanner;

/**
 * 2023.12.07
 * writer : zeroBase backend 20기 김예찬
 * title : 달력 출력
 */
public class CalendarStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        sc.nextLine();

        writeCalendar(year, month);
    }

    public static void writeCalendar(int year, int month){
        int firstYear = year, firstMonth = month - 1;
        int secondYear = year, secondMonth = month;
        int thirdYear = year, thirdMonth = month + 1;
        if(month == 1){ // 입력 날짜가 1월일 경우 전 월은 12월로 계산
            firstYear = year -1;
            firstMonth = 12;
        } else if (month == 12) { // 입력 날짜가 12월 일 경우 다음 월은 내년 1월 계산
            thirdYear = year + 1;
            thirdMonth = 1;
        }
        System.out.print("[" + firstYear + "년 " + String.format("%02d",firstMonth) + "월]\t\t\t\t\t\t\t");
        System.out.print("[" + secondYear + "년 " + String.format("%02d",secondMonth) + "월]\t\t\t\t\t\t\t");
        System.out.println("[" + thirdYear + "년 " + String.format("%02d",thirdMonth) + "월]\t\t\t\t\t\t\t");
        System.out.print("일\t월\t화\t수\t목\t금\t토\t\t\t\t");
        System.out.print("일\t월\t화\t수\t목\t금\t토\t\t\t\t");
        System.out.println("일\t월\t화\t수\t목\t금\t토\t\t\t\t");

        LocalDate firstLocalDate = LocalDate.of(firstYear, firstMonth, 1);
        LocalDate secondLocalDate = LocalDate.of(secondYear, secondMonth, 1);
        LocalDate thirdLocalDate = LocalDate.of(thirdYear, thirdMonth, 1);

        int firstLastDay = firstLocalDate.lengthOfMonth(); // 월의 마지막 일
        String firstDayOfTheWeek = String.valueOf(firstLocalDate.getDayOfWeek()); // 첫 시작 요일
        int secondLastDay = secondLocalDate.lengthOfMonth();
        String secondDayOfTheWeek = String.valueOf(secondLocalDate.getDayOfWeek());
        int thirdLastDay = thirdLocalDate.lengthOfMonth();
        String thirdDayOfTheWeek = String.valueOf(thirdLocalDate.getDayOfWeek());

        int firstChange = changeNum(firstDayOfTheWeek); // 월의 첫 요일 -> 숫자로 의미
        int secondChange = changeNum(secondDayOfTheWeek);
        int thirdChange = changeNum(thirdDayOfTheWeek);

        int sum=0;
        int a=1, b=1, c=1;
        int lineCnt = 0; // 줄 바꿈 카운트 및 해당 달력 출력

        while(a+b+c <= (firstLastDay + secondLastDay + thirdLastDay +2)){ // 세 달의 일수 만큼만 반복 출력
            sum++;
            if(lineCnt <= 6 && a <= firstLastDay && sum > firstChange){
                System.out.print(String.format("%02d",a) + "\t");
                a++;
                lineCnt++;
            } else if (lineCnt >= 10 && lineCnt <=16 && b <= secondLastDay && sum > (secondChange+10)) {
                System.out.print(String.format("%02d",b) + "\t");
                b++;
                lineCnt++;
            } else if (lineCnt >= 20 && lineCnt <= 26 && c <= thirdLastDay && sum > (thirdChange+20)) {
                System.out.print(String.format("%02d",c) + "\t");
                c++;
                lineCnt++;
            } else if (lineCnt == 27) {
                lineCnt = 0;
                System.out.println();
            } else{
                System.out.print("\t");
                lineCnt++;
            }
        }
    }

    // 월의 시작 요일 숫자로 변환
    public static int changeNum(String day){
        if(day.equals("SUNDAY")) return 0;
        else if (day.equals("MONDAY")) return 1;
        else if (day.equals("TUESDAY")) return 2;
        else if (day.equals("WEDNESDAY")) return 3;
        else if (day.equals("THURSDAY")) return 4;
        else if (day.equals("FRIDAY")) return 5;
        else if (day.equals("SATURDAY")) return 6;
        else return 7;
    }
}
