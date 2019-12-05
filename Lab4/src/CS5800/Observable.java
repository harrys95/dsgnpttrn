package CS5800;

import java.util.ArrayList;

public interface Observable {
	public default double getAverage(boolean avgSelect, ArrayList<Double> assignments, ArrayList<Double> exams) {
		double averageGrade = -1; 
		if (!avgSelect) {

			Average grade = new Average (assignments, exams);
			averageGrade = grade.calculateAverage();
		} else {
			// Select the 60/40 (drop) average grade algorithm
			if (assignments.size() >= 2) {
				DropAssignAverage grade = new DropAssignAverage(assignments, exams);
				averageGrade = grade.calculateAverage();
			} else {
				System.out.println("Cannot drop lowest! Must have at least" +
						"2 assignments posted.");
			}
		}

		setChanged();
		notifyObservers();
		return averageGrade;
	}

	public void notifyObservers();

	public void setChanged();

	public void setDropLowestAssign(boolean avgSelect);
}


