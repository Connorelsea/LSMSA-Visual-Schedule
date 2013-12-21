package elsealabs.eutil.schedule;

import java.io.Serializable;
import java.util.ArrayList;

public class CourseContainer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Course> COURSES;
	
	public CourseContainer() {
		COURSES = new ArrayList<Course>();
	}
	
	public void addCourse(Course course) {
		COURSES.add(course);
	}
	
	public ArrayList<Course> getCourses() {
		return COURSES;
	}
	
	public ArrayList<Course> getAllCoursesOn(Day day) {
		
		ArrayList<Course> crs = new ArrayList<Course>();
		
		for (Course c : COURSES) {
			for (int i = 0; i <= c.getTimeDayHolder().getDays().size() - 1; i++) {
				if (c.getTimeDayHolder().getDays().get(i).getString().equals(day.getString())) crs.add(c);
			}
		}
		
		return crs;
	}

}