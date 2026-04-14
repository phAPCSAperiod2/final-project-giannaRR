import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        ArrayList<Assignment> assignments = new ArrayList<>();

        System.out.print("Enter assignment name: ");
        String name = input.nextLine();

        System.out.print("Enter subject: ");
        String subject = input.nextLine();

        System.out.print("Enter due date (number): ");
        int dueDate = input.nextInt();

        Assignment a = new Assignment(name, subject, dueDate);

        assignments.add(a);

        System.out.println("Stored Assignment:");
        System.out.println(a);

        input.close();
    }
}
