package com.shweta.date.service;

import com.shweta.date.MyDate;

public class DateDifferenceProvider {
	
	private static int DAYS_IN_LEAP_YEAR = 366;
	private static int DAYS_IN_NON_LEAP_YEAR = 365;
	private static int FEB = 2;
	private static int DAY_IN_JAN = 31;
	private static int DAY_IN_FEB = 28;
	private static int DAY_IN_MAR = 31;
	private static int DAY_IN_APR = 30;
	private static int DAY_IN_MAY = 31;
	private static int DAY_IN_JUN = 30;
	private static int DAY_IN_JUL = 31;
	private static int DAY_IN_AUG = 31;
	private static int DAY_IN_SEP = 30;
	private static int DAY_IN_OCT = 31;
	private static int DAY_IN_NOV = 30;
	private static int DAY_IN_DEC = 31;
	
	public static int daysInMonth[] = { DAY_IN_JAN,
			DAY_IN_FEB,
			DAY_IN_MAR,
			DAY_IN_APR,
			DAY_IN_MAY,
			DAY_IN_JUN,
			DAY_IN_JUL,
			DAY_IN_AUG,
			DAY_IN_SEP,
			DAY_IN_OCT,
			DAY_IN_NOV,
			DAY_IN_DEC };

	public static long getDateDifference(MyDate startDate, MyDate endDate) {

		if(sameDate(startDate, endDate)&&
				sameMonth(startDate, endDate)&&
				sameYear(startDate, endDate)) {
			return 0;
		}
		else if(sameYear(startDate, endDate)&&
				sameMonth(startDate, endDate)) {
			return endDate.getDd()-startDate.getDd();
		}
		else if(sameYear(startDate, endDate)&&
				!sameMonth(startDate, endDate)) {
			return remainingDaysInMonth(startDate) + //25
					daysInIntervingMonth(startDate, endDate)+
					leadingMonth(endDate);
		}
		else
		{
			return remainingDaysInYear(startDate)+ //287
					leadingYear(endDate)+
					daysInIntervingYear(startDate, endDate);
		}
	
	}

	private static long daysInIntervingYear(MyDate startDate, MyDate endDate) {
		int days=0;
		for(int index=startDate.getYyyy()+1;index<endDate.getYyyy();index++)
		{
			days+=DAYS_IN_NON_LEAP_YEAR;
			if(isLeapYear(index))
				days+=1;
		}
		return days;
		
	}

	private static long leadingYear(MyDate endDate) {
		MyDate firstDateOfYear = new MyDate(1, 1, endDate.getYyyy()); 
		return remainingDaysInMonth(firstDateOfYear)
				+daysInIntervingMonth(firstDateOfYear,endDate)+leadingMonth(endDate);
		
	}

	private static long remainingDaysInYear(MyDate startDate) {
		MyDate lastDateOfYear=new MyDate(DAY_IN_DEC, 12, startDate.getYyyy());
		return remainingDaysInMonth(startDate)+daysInIntervingMonth(startDate,lastDateOfYear)+leadingMonth(lastDateOfYear)+1;
	}

	private static long daysInIntervingMonth(MyDate startDate, MyDate endDate) {
		long days=0;
		for(int index = startDate.getMm(); index < endDate.getMm()-1; index++)
		{
			if(index==FEB-1 && isLeapYear(startDate.getYyyy()))
			{
				days=+1;
			}
			days += daysInMonth[index];
		}
		return days;
	}

	private static long leadingMonth(MyDate endDate) {
		return endDate.getDd();
	}

	private static long remainingDaysInMonth(MyDate startDate) {
        int daysInBetween=0;
        daysInBetween=daysInMonth[startDate.getMm() - 1] - startDate.getDd();
        if(isLeapYear(startDate.getYyyy()) && startDate.getMm()==FEB)
        {
               daysInBetween+=1;
        }
        
        return daysInBetween;

	}

	private static boolean isLeapYear(int yearBeingChecked) {
		
		if (yearBeingChecked % 400 == 0) {
			return true;
		} else if (yearBeingChecked % 100 == 0) {
			return false;
		} else if (yearBeingChecked % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean sameDate(MyDate startDate, MyDate endDate) {
		if(endDate.getDd() == startDate.getDd())
			return true;
		else
		  return false;
	}
	
	private static boolean sameMonth(MyDate startDate, MyDate endDate) {
		if(endDate.getMm() == startDate.getMm()) {
			return true;
		}
		return false;
	}	

	private static boolean sameYear(MyDate startDate, MyDate endDate) {
		if(endDate.getYyyy() == startDate.getYyyy()) {
			return true;
		}
		return false;
	}

	

}
