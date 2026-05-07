import java.util.ArrayList;

public class AssignmentManager {

    private ArrayList<Assignment> Singleassignments;

    public AssignmentManager(){
        Singleassignments = new ArrayList<>();
    }

    public void addAssignment(Assignment assignment){
        Singleassignments.add(assignment);
    }

    public int getTotalAssignments(){
        return Singleassignments.size();
    }

    public String getAssignmentsBySubject(String subject){

        String result = " ";

        for (Assignment a: Singleassignments){
            if (a.getSubject().equals(subject)){
                result += a.getName() + " - Due: " + a.getDueDate() + " || ";
            }
        }
        return result;
    }

    public String findDueDate(String name){

        for (Assignment a : Singleassignments){
            if (a.getName().equals(name)){
                return a.getDueDate();
            }
        }
        return " ";
    }

    // actual implementation of 2D array (working)
    public String[][] getAssignmentsAsTable() {
        String[][] table = new String[Singleassignments.size()][3];

        for (int i = 0; i < Singleassignments.size(); i++) {
            Assignment a = Singleassignments.get(i);
            table[i][0] = a.getName();
            table[i][1] = a.getSubject();
            table[i][2] = String.valueOf(a.getDueDate());
        }

        return table;
        }

    public void intro(){
        System.out.println("==================================");
        System.out.println("🖊️  📖 Assignment Tracker Program ✏️  📚");
        System.out.println("==================================");
        System.out.println("This program helps you keep track of your homework.");
        System.out.println("You will enter assignment name, subject, and due date below.");
    }

    public void removeAssignment(int index){
        if (index >= 0 && index < Singleassignments.size()) {
            Singleassignments.remove(index);
            System.out.println("Assignment completed!");
        }
        else {
        System.out.println("Invalid assignment number.");
        }
    }

}
