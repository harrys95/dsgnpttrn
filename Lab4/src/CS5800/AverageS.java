package CS5800;

import java.util.ArrayList;

abstract public class AverageS {

		    static double EXAM_WEIGHTED = .60; 
		    static double ASSIGN_WEIGHTED = .40; 
		    static double MAX_GRADE = 100.00; 
		    static ArrayList<Double> assignments;
		    static ArrayList<Double> exams;

		    public AverageS(){/* DO NOTHING */}

		    public AverageS(ArrayList<Double> assignments, ArrayList<Double> exams){
		        AverageS.assignments = assignments;
		        AverageS.exams = exams;
		    }

		    public double totalExamsScore(){
		        double totalExams = 0;
		        for (double exam : exams) {
		            totalExams += exam;
		        }
		        return totalExams;
		    }

		    public double totalAssignScore(){
		        double totalAssign = 0;
		        for (double assignment : assignments) {
		            totalAssign += assignment;
		        }
		        return totalAssign;
		    }
		    
		    public int findLowestAssign(){
		        double lowest = MAX_GRADE;
		        int indexLowest = 0;
		        for (double assignment : assignments){
		            if(assignment < lowest){
		                indexLowest = assignments.indexOf(assignment);
		                lowest = assignment;
		            }
		        }
		        return indexLowest;
		    }

		    abstract public double calculateAverage();
		}



