package Assignment;

import java.util.Scanner;

public class IQ10 {

    static int getGradePoints(int marks){
        if (marks >= 90 && marks <= 100) {
            return 10;
        } else if (marks >= 75 && marks < 90) {
            return 9;
        } else if (marks >= 65 && marks < 75 ) {
            return 8;
        } else if (marks >= 55 && marks < 65) {
            return 7;
        } else if (marks >= 50 && marks < 55) {
            return 6;
        } else if (marks >= 45 && marks < 50) {
            return 5;
        } else if (marks >= 40 && marks < 45) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Subjects : ");
        int n = in.nextInt();

        float totalGradePoints = 0;
        float totalCredits = 0;

        System.out.println("Enter the marks and credits per subject: ");
        for (int i = 0; i < n; i++) {
            int marks = in.nextInt();
            int credits = in.nextInt();
            int gradePoints = getGradePoints(marks);

            // System.out.println(i + " " + marks + " " + credits + " " + gradePoints);

            totalGradePoints += gradePoints*credits;
            totalCredits += credits;
        }

        float CGPA = totalGradePoints / totalCredits;

        System.out.println("Your CGPA is " + CGPA + "!");
        in.close();
    }
}
