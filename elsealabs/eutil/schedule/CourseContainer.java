package elsealabs.eutil.schedule;

import java.util.ArrayList;

public class CourseContainer {
	
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

}