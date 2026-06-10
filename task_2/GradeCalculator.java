public class GradeCalculator {

    public static double calculateAverage(int[] marks) {

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public static String calculateGrade(int[] marks) {

        for (int mark : marks) {
            if (mark < 40) {
                return "F";
            }
        }

        double avg = calculateAverage(marks);

        if (avg >= 90) return "S";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        if (avg >= 40) return "E";

        return "F";
    }
}