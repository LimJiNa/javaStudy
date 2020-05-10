package sec16.exam01_java_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		String strDateTime = now.getYear() + "�� ";
		strDateTime += now.getMonthValue() + "�� ";
		strDateTime += now.getDayOfMonth() + "�� ";
		DayOfWeek dow = now.getDayOfWeek();
		if (dow == DayOfWeek.MONDAY) {
			strDateTime += "������ ";
		} else if (dow == DayOfWeek.TUESDAY) {
			strDateTime += "ȭ���� ";
		} else if (dow == DayOfWeek.WEDNESDAY) {
			strDateTime += "������ ";
		} else if (dow == DayOfWeek.THURSDAY) {
			strDateTime += "����� ";
		} else if (dow == DayOfWeek.FRIDAY) {
			strDateTime += "�ݿ��� ";
		} else if (dow == DayOfWeek.SATURDAY) {
			strDateTime += "����� ";
		} else {
			strDateTime += "�Ͽ��� ";
		}
		strDateTime += now.getHour() + "�� ";
		strDateTime += now.getMinute() + "�� ";
		strDateTime += now.getSecond() + "�� ";
		strDateTime += now.getNano() + "������";
		System.out.println(strDateTime);

		LocalDate nowDate = now.toLocalDate();
		if (nowDate.isLeapYear()) {
			System.out.println("���ش� ���� : 2���� 29�ϱ��� �ֽ��ϴ�.\n");
		} else {
			System.out.println("���ش� ��� : 2���� 28�ϱ��� �ֽ��ϴ�.\n");
		}

		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� ����� : " + utcDateTime);

		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� Ÿ���� : " + seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("���� �����̵� : " + seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("���� �������� : " + seoulZoneOffset);
	}
}