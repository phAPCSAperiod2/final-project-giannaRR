import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AssignmentManager manager = new AssignmentManager();

        String choice = "yes";

        while (choice.equals("yes")){
            System.out.println(" ");
            System.out.print("Enter assignment name: ");
            String name = input.nextLine();

            System.out.print("Enter subject (Math, English, Psychology): ");
            String subject = input.nextLine();

            System.out.print("Enter due date (April 22 : 4.22): ");
            double dueDate = input.nextDouble();
            input.nextLine();

            Assignment a = new Assignment(name, subject, dueDate);
            manager.addAssignment(a);

            System.out.print("Enter another assignment? (yes/no): ");
            choice = input.nextLine();
        }

        System.out.println(" ");
        System.out.println("Total assignments needed to be completed: " + manager.getTotalAssignments());

        System.out.println(" ");
        System.out.println("Do you want to know how many assignments you have per subject? (yes/no)");
        String answer = input.nextLine();
        if (answer.equals("yes") || answer.equals("Yes")){
            System.out.println("What subject would you like to check?");
            String subAnswer = input.nextLine();
            System.out.println(manager.getAssignmentsBySubject(subAnswer));
        }

        input.close();
    }
}
