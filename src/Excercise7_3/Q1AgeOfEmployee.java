package Excercise7_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Q1AgeOfEmployee{
	public static void main(String[] args) {
		LocalDate birthday= LocalDate.of(1997, 01, 9);
		LocalDate today=LocalDate.now();
		 long years=ChronoUnit.YEARS.between(birthday, today);
		 
		 Period p=Period.between(birthday, today);
		 System.out.println("Years:"+p.getYears());
		 System.out.println("Months:"+p.getMonths());
		 System.out.println("Days:"+p.getMonths());
	}
}
