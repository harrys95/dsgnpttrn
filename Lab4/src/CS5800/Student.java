package CS5800;

import java.util.ArrayList;

public class Student implements Observable {


		    private String name;                    
		    private ArrayList<Double> assignments;  
		    private ArrayList<Double> exams;        
		 
			public Student(String name) {
				this.name = name;
		        assignments = new ArrayList<Double>();
		        exams = new ArrayList<Double>();
			}

			public String getName() {
				return name;
			}

			public void addAssignmentScore (double as) {
				assignments.add(as);
			}
			
			public void addExamScore (double es) {
				exams.add(es);
			}

			public double getAverage(Average average) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void notifyObservers() {
				
			}

			@Override
			public void setChanged() {
				
			}

			@Override
			public void setDropLowestAssign(boolean avgSelect) {
				
			}

			public double getAverage() {
				return 0;
			}
}