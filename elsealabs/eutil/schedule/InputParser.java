package elsealabs.eutil.schedule;

import java.util.ArrayList;

public class InputParser {
	
	private String STRING;
	private ArrayList<Character> STRING_ARRAY;
	
	private TimeDayHolder TD_HOLDER;
	
	private int CURRENT_TIME_VAL;
	private boolean TRACKING_CTV;
	private boolean CTV_INTERRUPTION;
	
	private String CURRENT_LETTER;
	private boolean TRACKING_LETTER;
	
	private Day DAY;
	private Time TIME;
	
	public TimeDayHolder parseInput(String input) throws Exception {
		
		STRING = input;
		STRING_ARRAY = new ArrayList<Character>();
		for (char a : STRING.toCharArray()) STRING_ARRAY.add(a);
		
		TD_HOLDER = new TimeDayHolder();
		
		for (char s : STRING_ARRAY) {
			
			if (Character.isDigit(s)) {
				
				// check if tracking for next number
				if (TRACKING_CTV == true) {
					
					// if was interrupted by whitespace, replace previous CTV
					if (CTV_INTERRUPTION == true) {
						CURRENT_TIME_VAL = Integer.parseInt(s + "");
					}
					// if wasn't interrupted by CTV, make CTV two-digit number
					else {
						String ctv = CURRENT_TIME_VAL + s + "";
						CURRENT_TIME_VAL = Integer.parseInt(ctv);
					}
					
				}
				// if wasn't tracking for next number
				else {
					TRACKING_CTV = true;
					CURRENT_TIME_VAL = Integer.parseInt(s + "");
				}
				
			}
			
			else if (Character.isWhitespace(s)) {
				
				// if whitespace while tracking CTV, alert of interruption
				if (TRACKING_CTV == true) CTV_INTERRUPTION = true;
				
			}
			
			else if (Character.isAlphabetic(s)) {
				
				// alphabet while tracking CTV is an indication of CTV finalization
				if (TRACKING_CTV == true) {
					
					TRACKING_CTV = false;
					TRACKING_LETTER = true;
				}
				
				if (TRACKING_CTV == false && TRACKING_LETTER == true) {
					
					CURRENT_LETTER = s + "";
					
					try {
						
						DAY = new Day(CURRENT_LETTER.toCharArray()[0]);
						TIME = (Time) DAY.getTime(CURRENT_TIME_VAL).clone();
						TD_HOLDER.addSet(DAY, TIME);
						
					} catch (Exception ex) {
						ex.printStackTrace();
						throw new Exception("Letter \"" + CURRENT_LETTER + "\" is incorrect");
					}
					
				}
				
				else if (TRACKING_CTV == false && TRACKING_LETTER == false) {
					throw new Exception("No time to assign day to");
				}
				
			}
			
		}
		
		return TD_HOLDER;
	}

}