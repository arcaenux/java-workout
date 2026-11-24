import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter examination score: ");
        int examScore = input.nextInt();

        System.out.print("Enter assessment score: ");
        int assessmentScore = input.nextInt();

        System.out.print("Enter amount of fee paid: ");
        double feePaid = input.nextDouble();

        int totalScore = examScore + assessmentScore;
        boolean examPassed;
        if (examScore >= 25) {
            examPassed = true;
        } else {
            examPassed = false;
        }

        boolean assessmentPassed;
        if (assessmentScore >= 15) {
            assessmentPassed = true;
        } else {
            assessmentPassed = false;
        }

        boolean requirement1Satisfied;
        if (examPassed && assessmentPassed) {
            requirement1Satisfied = true;
        } else {
            requirement1Satisfied = false;
        }
        boolean requirement2Satisfied;
        if (totalScore == 39) {
            requirement2Satisfied = true;
        } else {
            requirement2Satisfied = false;
        }
        boolean fullFeePaid;
        if (feePaid >= 100) {
            fullFeePaid = true;
        } else {
            fullFeePaid = false;
        }

        boolean certificateIssued;
        if (requirement1Satisfied &&
            requirement2Satisfied && fullFeePaid) {
            certificateIssued = true;
        } else {
            certificateIssued = false;
        }
        boolean failed;
        if (!requirement1Satisfied ||
            !requirement2Satisfied) {
            failed = true;
        } else {
            failed = false;
        }
        boolean repeatRequired;
        if (!examPassed && !assessmentPassed) {
            repeatRequired = true;
        } else {
            repeatRequired = false;
        }


        System.out.println("\n===== STUDENT GRADING RESULTS =====");
        System.out.println("Examination score: " + examScore);
        System.out.println("Assessment score: " + assessmentScore);
        System.out.println("Total score: " + totalScore);

        if (examPassed) {
            System.out.println("Examination result: PASSED");
        } else {
            System.out.println("Examination result: FAILED");
        }

        if (assessmentPassed) {
            System.out.println("Assessment result: PASSED");
        } else {
            System.out.println("Assessment result: FAILED");
        }

        if (requirement2Satisfied) {
            System.out.println("Condonation: YES");
        } else {
            System.out.println("Condonation: NO");
        }

        if (failed) {
            System.out.println("Overall status: FAILED");
        } else {
            System.out.println("Overall status: PASSED");
        }

        if (repeatRequired) {
            System.out.println("Repeat: YES");
        } else {
            System.out.println("Repeat: NO");
        }

        if (fullFeePaid) {
            System.out.println("Full fee paid: YES");
        } else {
            System.out.println("Full fee paid: NO");
        }

        if (certificateIssued) {
            System.out.println("Certificate: ISSUED");
        } else {
            System.out.println("Certificate: NOT ISSUED");
        }

        System.out.println("\nNote: Passing both components requires at least 40, but condonation requires exactly 39.");
        System.out.println("The program applies the requirements as written.");

        input.close();
    }
}