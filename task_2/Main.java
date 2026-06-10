import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager =
                new StudentManager();

        while (true) {

            System.out.println(
                    "\n===== MENU ====="
            );

            System.out.println(
                    "1. Add Student"
            );

            System.out.println(
                    "2. View Students"
            );

            System.out.println(
                    "3. Search Student"
            );

            System.out.println(
                    "4. Update Student Name"
            );

            System.out.println(
                    "5. Delete Student"
            );

            System.out.println(
                    "6. Show Topper"
            );

            System.out.println(
                    "7. Exit"
            );

            System.out.print(
                    "Enter Choice : "
            );

            int choice =
                    sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Enter ID : "
                    );

                    int id =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Enter Name : "
                    );

                    String name =
                            sc.nextLine();

                    System.out.print(
                            "Enter Number of Subjects : "
                    );

                    int n =
                            sc.nextInt();

                    int[] marks =
                            new int[n];

                    for (int i = 0; i < n; i++) {

                        while (true) {

                            System.out.print(
                                    "Marks Subject "
                                            + (i + 1)
                                            + " : "
                            );

                            int mark =
                                    sc.nextInt();

                            if (mark >= 0 &&
                                    mark <= 100) {

                                marks[i] = mark;
                                break;
                            }

                            System.out.println(
                                    "Invalid Marks!"
                            );
                        }
                    }

                    Student student =
                            new Student(
                                    id,
                                    name,
                                    marks
                            );

                    manager.addStudent(
                            student
                    );

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.print(
                            "Enter ID : "
                    );

                    int searchId =
                            sc.nextInt();

                    Student found =
                            manager.searchStudent(
                                    searchId
                            );

                    if (found != null) {

                        System.out.println(
                                "Student Found"
                        );

                        System.out.println(
                                "Name : "
                                        + found.getName()
                        );
                    } else {

                        System.out.println(
                                "Student Not Found"
                        );
                    }

                    break;

                case 4:

                    System.out.print(
                            "Enter ID : "
                    );

                    int updateId =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Enter New Name : "
                    );

                    String newName =
                            sc.nextLine();

                    if (manager.updateStudentName(
                            updateId,
                            newName
                    )) {

                        System.out.println(
                                "Updated Successfully"
                        );

                    } else {

                        System.out.println(
                                "Student Not Found"
                        );
                    }

                    break;

                case 5:

                    System.out.print(
                            "Enter ID : "
                    );

                    int deleteId =
                            sc.nextInt();

                    if (manager.deleteStudent(
                            deleteId
                    )) {

                        System.out.println(
                                "Deleted Successfully"
                        );

                    } else {

                        System.out.println(
                                "Student Not Found"
                        );
                    }

                    break;

                case 6:

                    manager.showTopper();

                    break;

                case 7:

                    System.out.println(
                            "Exiting..."
                    );

                    System.exit(0);

                default:

                    System.out.println(
                            "Invalid Choice"
                    );
            }
        }
    }
}