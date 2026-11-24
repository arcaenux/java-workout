import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Double examScore, assessmentScore, totalScore, feePaid;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter examination score: ");
        examScore = input.nextDouble();

        System.out.print("Enter assessment score: ");
        assessmentScore = input.nextDouble();

        System.out.print("Enter amount of fee paid: ");
        feePaid = input.nextDouble();


        totalScore = examScore + assessmentScore;

        System.out.println("\n===== STUDENT GRADING RESULTS =====");
        System.out.println("Examination score: " + examScore);
        System.out.println("Assessment score: " + assessmentScore);
        System.out.println("Total score: " + totalScore);
        if (examScore >= 25) {
            System.out.println("Examination result: Passed");
        } else {
            System.out.println("Examination result: Failed");
        }

        if (assessmentScore >= 15) {
            System.out.println("Assessment result: Passed");
        } else {
            System.out.println("Assessment result: Failed");
        }
        if (totalScore == 39) {
            System.out.println("Student is condoned");
        } else {
            System.out.println("Student is not condoned");
        }

        if (feePaid >= 100) {
            System.out.println("Fee payment: Fully Paid");
        } else {
            System.out.println("Fee payment: Not Fully Paid");
        }
        if (examScore >= 25 && assessmentScore >= 15 && totalScore == 39 && feePaid >= 100) {
            System.out.println("Certificate: Issued");
        } else {
            System.out.println("Certificate: Not to be Issued");
        }

        if ((examScore < 25 || assessmentScore < 15) || totalScore != 39) {
            System.out.println("Overall result: Failed");
        } else {
            System.out.println("Overall result: Passed");
        }
        if (examScore < 25 && assessmentScore < 15) {
            System.out.println("Repeat");
        } else {
            System.out.println("No Repeat");
        }

        input.close();
    }
}
