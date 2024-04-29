import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 현재 날짜 가져오기
        LocalDate today = LocalDate.now();

        // 날짜 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 형식에 맞게 날짜를 문자열로 변환하여 출력
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
