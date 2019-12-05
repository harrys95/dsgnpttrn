package CS5800;

import java.util.ArrayList;

public class Roster {

	    private String courseName;             
	    private String courseNumber;           
	    private ArrayList<Student> students;   
	    
	
	    public Roster(String name, String number) {
	        this.courseName = name;
	        this.setCourseNumber(number);
	        students = new ArrayList<Student>();
	    }
	    
	    public String getCourseName() {
	        return courseName;
	    }
	  
	    public void addStudent (Student student) {
	        students.add(student);
	    }

		public String getCourseNumber() {
			return courseNumber;
		}

		public void setCourseNumber(String courseNumber) {
			this.courseNumber = courseNumber;
		}

		public AvgDispenser getDispenser() {
			// TODO Auto-generated method stub
			return null;
		}

		public AvgDispenser createDispenser() {
			// TODO Auto-generated method stub
			return null;
		}
	    
	}






