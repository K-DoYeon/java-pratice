package sec04_ch02;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class If_exam04 {

	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		//포맷 적용
		String nTime = nowTime.format(formatter);
		System.out.println(nTime);
		
		int hour = nowTime.getHour();
		int minute = nowTime.getMinute();
		int second = nowTime.getSecond();
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 입니다." );
		
		switch(hour) {
		case 9:
			System.out.println("출근 시간입니다.");
		break;
		case 17:
			System.out.println("퇴근 시간이 다 되어갑니다.");
		break;
		case 18:
			System.out.println("퇴근 시간입니다.");
		break;
		default:
			System.out.println("그 외에는 관심 없습니다.");
		}
		
	}
	
	/*java 8 이후 
	 * 1.java.time.LocalDate 
	 * 2. java.time.LocalTime 
	 * 3. java.time.LocalDateTime
	 * 
	 * import java.time.Zoneld;
	 * 
	 * 현재날짜 구하기
	 * LocalDate now = LocalDate.now();
	 * 
	 * 파리의 날짜 구하기
	 * LocalDate parisNow = LocalDate.now(Zoneld.of("Europe/Paris"));
	 * 
	 * 
	 * 
	 * java 8 이전
	 * 1.java.util.Date
	 * 2.java.util.Calendar
	 */

}
