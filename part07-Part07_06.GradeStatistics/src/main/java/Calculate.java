import java.util.ArrayList;

public class Calculate {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Calculate() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    } 

    public void addPoints(int points) { 
        this.points.add(points);
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        double sum = 0.0;

        for (int number : this.points) {
            sum = sum + number;
        }

        double average = sum / this.points.size();
        return average;
    } 

    public void averageOfPassingGrades() {
        if (this.points.isEmpty()) {
            System.out.println("-");
        }

        double sum = 0.0;
        int numberOfPassingGrades = 0;

        for (int number : this.points) {
            if (number >= 50) {
                sum = sum + number;
                numberOfPassingGrades++;
            }
        }

        if (numberOfPassingGrades > 0) {
            double average = sum / numberOfPassingGrades;
            System.out.println("Point average (passing): " + average);
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public double passPercentage() {
        if (this.points.isEmpty()) {
            return -1;
        }

        double passed = 0.0;
        int participants = this.points.size();

        for (int number : this.points) {
            if (number >= 50) {
                passed++;
            }
        }

        double result = 100 * passed / participants;
        return result;
    }

    public static int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int listOfGrades(int grade) {
        int count = 0;
        for  (int searchFor : this.grades) {
            if (searchFor == grade) {
                count++;
            }
        }
        return count;
    }

    public static void printStars(int stars) { 
        for (int i = stars; i > 0; i--) {
            System.out.print("*");
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.listOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();
            grade = grade - 1;
        }
    }
}
