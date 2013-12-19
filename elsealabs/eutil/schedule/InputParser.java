package elsealabs.eutil.schedule;

import java.util.ArrayList;

public class InputParser {
	
	private String STRING;
	private ArrayList<Character> STRING_ARRAY;
	
	private Course COURSE;
	
	public Course parseInput(String input) {
		
		STRING = input;
		STRING_ARRAY = new ArrayList<Character>();
		for (char a : STRING.toCharArray()) STRING_ARRAY.add(a);
		
		COURSE = new Course();
		
		for (char s : STRING_ARRAY) {
			
			if (Character.isDigit(s)) {
				
			}
			
			else if (Character.isWhitespace(s) || Character.isSpace(s)) {
				
			}
			
			else if (Character.isAlphabetic(s)) {
				
			}
			
			else {
				
			}
			
		}
		
		return null;
	}

}