package CS5800;

import java.util.ArrayList;

public class Average extends AverageS{

	    
	    public Average(){
	        super(assignments, exams);
	    }
	    
	    public Average(ArrayList<Double> assignments, ArrayList<Double> exams) {
			// TODO Auto-generated constructor stub
		}

		public double calculateAverage(){
	        //System.out.println("DEBUG: In standardAverage()");
	        double average;
	        average = (EXAM_WEIGHTED * (totalExamsScore()/exams.size())) +
	                (ASSIGN_WEIGHTED * (totalAssignScore()/assignments.size()));
	        return average;
	    }
	}


