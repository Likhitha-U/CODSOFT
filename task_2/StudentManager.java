import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students =
            new ArrayList<>();

    public void addStudent(Student student) {

        students.add(student);

        System.out.println(
                "Student Added Successfully!"
        );
    }

    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println(
                    "No Students Available"
            );

            return;
        }

        for (Student s : students) {

            System.out.println(
                    "\nID : " + s.getId()
            );

            System.out.println(
                    "Name : " + s.getName()
            );

            int[] marks = s.getMarks();

            for (int i = 0; i < marks.length; i++) {

                System.out.println(
                        "Subject " + (i + 1)
                                + " : " + marks[i]
                );
            }

            double avg =
                    GradeCalculator.calculateAverage(
                            marks
                    );

            String grade =
                    GradeCalculator.calculateGrade(
                            marks
                    );

            System.out.printf(
                    "Average : %.2f\n",
                    avg
            );

            System.out.println(
                    "Grade : " + grade
            );
        }
    }

    public Student searchStudent(int id) {

        for (Student s : students) {

            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    public boolean updateStudentName(
            int id,
            String newName) {

        Student s =
                searchStudent(id);

        if (s != null) {

            s.setName(newName);

            return true;
        }

        return false;
    }

    public boolean deleteStudent(int id) {

        Student s =
                searchStudent(id);

        if (s != null) {

            students.remove(s);

            return true;
        }

        return false;
    }

    public void showTopper() {

        if (students.isEmpty()) {

            System.out.println(
                    "No Students Found"
            );

            return;
        }

        Student topper =
                students.get(0);

        double highest =
                GradeCalculator.calculateAverage(
                        topper.getMarks()
                );

        for (Student s : students) {

            double avg =
                    GradeCalculator.calculateAverage(
                            s.getMarks()
                    );

            if (avg > highest) {

                highest = avg;
                topper = s;
            }
        }

        System.out.println(
                "\nTopper : "
                        + topper.getName()
        );

        System.out.printf(
                "Average : %.2f\n",
                highest
        );
    }
}