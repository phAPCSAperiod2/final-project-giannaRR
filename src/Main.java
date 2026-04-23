import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AssignmentManager manager = new AssignmentManager();

        String choice = "yes";

        while (choice.equals("yes")){
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

        input.close();
    }
}
