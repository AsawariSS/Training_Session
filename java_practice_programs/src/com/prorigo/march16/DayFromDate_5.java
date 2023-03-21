package com.prorigo.march16;

import java.util.*;

public class DayFromDate_5 {

	public static void main(String[] args) {
		int date;
		int month;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date:");
		date = sc.nextInt();
		System.out.println("Enter Month:");
		month = sc.nextInt();
		System.out.println("Enter Year");
		year = sc.nextInt();
		int weekday = searchWeekDay(date, month, year);
		String weekdaystring = getWeekday(weekday);
		System.out.println("Day is" + " " + weekdaystring);

	}

	public static int searchWeekDay(int date, int month, int year) {
		int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		if (month < 3) {
			year -= 1;
		}
		int weekday = (year + year / 4 - year / 100 + year / 400 + t[month - 1] + date) % 7;
		return weekday;
	}

	public static String getWeekday(int weekday) {
		String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		return weekdays[weekday];
	}
}
