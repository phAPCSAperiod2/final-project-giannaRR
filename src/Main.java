import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter assignment name: ");
        String name = input.nextLine();

        System.out.print("Enter subject (Math, English, Psychology): ");
        String subject = input.nextLine();

        System.out.print("Enter due date (April 22 : 4.22): ");
        int dueDate = input.nextInt();

        System.out.println("Stored Assignment:");

        input.close();
    }
}
