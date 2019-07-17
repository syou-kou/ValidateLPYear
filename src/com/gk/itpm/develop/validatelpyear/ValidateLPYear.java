package com.gk.itpm.develop.validatelpyear;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidateLPYear {

	public static void main(String[] args) {
		LocalDate ld = ValidateLPYear.readDate();
		
		System.out.print(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));
		if (ld.isLeapYear()) {
			System.out.println(" is leap year!");
		} else {
			System.out.println(" is NOT leap year!");
		}
	}
	
	private static LocalDate readDate() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("年月日をYYYY-MM-DD形式で入力してください。");
			System.out.print("入力：");
			String line = sc.nextLine();
			
			try {
				String[] buffers = line.split("-");
				LocalDate ld = LocalDate.of(
					Integer.parseInt(buffers[0]),
					Integer.parseInt(buffers[1]),
					Integer.parseInt(buffers[2])
				);
				return ld;
			} catch (Exception e) {
				System.out.println("日付が不正です。");
				continue;
			}
		}
	}
}
