package mini.surprise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// java 시스템 속성 -> html 변환
public class SurpriseOne {
    public static void main(String[] args) {

        try {
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("<head>");
            writer.write("<meta charset=\"UTF-8\" />");

            writer.write("<style>");
            writer.write("table { border-collapse: collapse; width: 100%;}");
            writer.write("th,td { border: solid 1px #000;}");
            writer.write("</style>");
            writer.write("</head>");
            writer.write("<body>");
            writer.write("<h1>자바 환경정보</h1>");
            writer.write("<table>");
            for(Object k : System.getProperties().keySet()){
                String key = k.toString();
                String value = System.getProperty(key);
                //System.out.println("key : " + key + ", value : " + value);
                writer.write("<tr>");
                writer.write("<td>");
                    writer.write(key);
                writer.write("</td>");
                writer.write("<td>");
                writer.write(value);
                writer.write("</td>");
                writer.write("</tr>");
            }
            writer.write("</table>");
            writer.write("</body>");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
