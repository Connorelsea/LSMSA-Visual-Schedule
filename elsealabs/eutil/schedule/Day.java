package elsealabs.eutil.schedule;

import java.io.Serializable;

public class Day implements Comparable<Day>, Serializable {
	private static final long serialVersionUID = 1L;
	
	private int INT;
	private char CHAR;
	private String STRING;
	
	private TimeResource TR;
	
	public Day(int i) throws Exception {
		parseInfoFrom(i);
	}
	
	public Day(char i) throws Exception {
		parseInfoFrom(i);
	}
	
	public Day(String i) throws Exception {
		parseInfoFrom(i);
	}
	
	public Time getTime(int currentTimeValue) {
		
		if (INT == 1 || INT == 3 || INT == 5) {
			
			if (currentTimeValue == 1) return TR.MWF_1;
			if (currentTimeValue == 2) return TR.MWF_2;
			if (currentTimeValue == 3) return TR.MWF_3;
			if (currentTimeValue == 4) return TR.MWF_4;
			if (currentTimeValue == 5) return TR.MWF_5;
			if (currentTimeValue == 6) return TR.MWF_6;
			if (currentTimeValue == 7) return TR.MWF_7;
			if (currentTimeValue == 8) return TR.MWF_8;
			if (currentTimeValue == 9) return TR.MWF_9;
			if (currentTimeValue == 10) return TR.MWF_10;
			
		} else {
			
			if (currentTimeValue == 1) return TR.TR_1;
			if (currentTimeValue == 2) return TR.TR_2;
			if (currentTimeValue == 3) return TR.TR_3;
			if (currentTimeValue == 4) return TR.TR_4;
			if (currentTimeValue == 5) return TR.TR_5;
			if (currentTimeValue == 6) return TR.TR_6;
			if (currentTimeValue == 7) return TR.TR_7;
			if (currentTimeValue == 8) return TR.TR_8;
			if (currentTimeValue == 9) return TR.TR_9;
			if (currentTimeValue == 10) return TR.TR_10;
			
		}
		
		return null;
	}
	
	public void parseInfoFrom(int i) throws Exception {
		
		if (i == 1) setInfo(1, 'M', "Monday");
		else if (i == 2) setInfo(2, 'T', "Tuesday");
		else if (i == 3) setInfo(3, 'W', "Wednesday");
		else if (i == 4) setInfo(4, 'R', "Thursday");
		else if (i == 5) setInfo(5, 'F', "Friday");
		else throw new Exception("Could not parse a day from integer \"" + i + "\"");
	}
	
	public void parseInfoFrom(char i) throws Exception {
		
		System.out.println(i);
		
		if (i == 'M' || i == 'm') setInfo(1, 'M', "Monday");
		else if (i == 'T' || i == 't') setInfo(2, 'T', "Tuesday");
		else if (i == 'W' || i == 'w') setInfo(3, 'W', "Wednesday");
		else if (i == 'R' || i == 'r') setInfo(4, 'R', "Thursday");
		else if (i == 'F' || i == 'f') setInfo(5, 'F', "Friday");
		else throw new Exception("Could not parse a day from char \"" + i + "\"");
	}
	
	public void parseInfoFrom(String i) throws Exception {
		
		String check = i.toLowerCase();
		if (check.equals("monday") || check.contains("monday")) setInfo(1, 'M', "Monday");
		else if (check.equals("tuesday") || check.contains("tuesday")) setInfo(2, 'T', "Tuesday");
		else if (check.equals("wednesday") || check.contains("wednesday")) setInfo(3, 'W', "Wednesday");
		else if (check.equals("thursday") || check.contains("thursday")) setInfo(4, 'R', "Wednesday");
		else if (check.equals("friday") || check.contains("friday")) setInfo(5, 'F', "Friday");
		else throw new Exception("Could not parse a day from String \"" + i + "\"");
		
	}
	
	private void setInfo(int i, char c, String s) {
		INT = i;
		CHAR = c;
		STRING = s;
	}
	
	public int getInt() {
		return INT;
	}
	
	public char getChar() {
		return CHAR;
	}
	
	public String getString() {
		return STRING;
	}

	@Override
	public int compareTo(Day o) {
		return this.getInt() - o.getInt();
	}

}