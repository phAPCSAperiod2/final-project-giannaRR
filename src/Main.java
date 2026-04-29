import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AssignmentManager manager = new AssignmentManager();

        manager.intro();

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
        System.out.println("Assignments Table:");

        String[][] table = manager.getAssignmentsAsTable();

        System.out.println("Name            Subject         Due Date");
        System.out.println("----------------------------------------");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++){
                // \t means tab, so everything is more organized (used with AI help)
                System.out.print(table[i][j] + "\t|");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Total assignments needed to be completed: " + manager.getTotalAssignments());


        System.out.println(" ");
        System.out.println("Do you want to know how many assignments you have per subject? (yes/no)");
        String answer = input.nextLine();
        while (answer.equals("yes")){
            System.out.println("What subject would you like to check?");
            String subAnswer = input.nextLine();
            System.out.println(manager.getAssignmentsBySubject(subAnswer));
            System.out.println("Do you want to check again? (yes/no)");
            answer = input.nextLine();
        }

        System.out.println("You got this! Make sure you finish all your work. 📚 💪 🤗");

        input.close();
    }
}
