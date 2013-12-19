package elsealabs.eutil.schedule;

public class Day {
	
	private int INT;
	private char CHAR;
	private String STRING;
	
	public Day(int i) {
		
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
		
		if (i == 'M' || i == 'm') setInfo(1, 'M', "Monday");
		else if (i == 'T' || i == 't') setInfo(2, 'T', "Tuesday");
		else if (i == 'W' || i == 'w') setInfo(3, 'W', "Wednesday");
		else if (i == 'R' || i == 'r') setInfo(4, 'R', "Thursday");
		else if (i == 'F' || i == 'f') setInfo(5, 'F', "Friday");
		else throw new Exception("Could not parse a day from char \"" + i + "\"");
	}
	
	public void parseInfoFrom(String i) {
		
	}
	
	private void setInfo(int i, char c, String s) {
		INT = i;
		CHAR = c;
		STRING = s;
	}

}