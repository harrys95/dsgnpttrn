package CS5800;

import java.util.ArrayList;


	public class DropAssignAverage extends Average{

	    
	    public DropAssignAverage(ArrayList<Double> assignments, ArrayList<Double> exams){
	        super(assignments, exams);
	    }
	
	    public double calculateAverage(){
	        double average;
	        average = (EXAM_WEIGHTED * (totalExamsScore()/exams.size()) +
	                (ASSIGN_WEIGHTED * ((totalAssignScore() -
	                        assignments.get(findLowestAssign()))/(assignments.size()-1))));

	        return average;
	    }
	}

