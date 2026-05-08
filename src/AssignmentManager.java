import java.util.ArrayList;
/**
 * Manages a list of Assignment objects.
 * Provides methods for adding, removing, searching, and displaying assignments.
 */
public class AssignmentManager {

    private ArrayList<Assignment> Singleassignments;

    /**
     * Creates a new AssignmentManager object with an empty assignment list.
     */
    public AssignmentManager(){
        Singleassignments = new ArrayList<>();
    }

    /**
     * Adds an assignment to the assignment list.
     *
     * @param assignment the assignment to add
     */
    public void addAssignment(Assignment assignment){
        Singleassignments.add(assignment);
    }

     /**
     * Returns the total number of assignments.
     *
     * @return the number of assignments
     */
    public int getTotalAssignments(){
        return Singleassignments.size();
    }

    /**
     * Returns all assignments that match the given subject.
     *
     * @param subject the subject to search for
     * @return a formatted string of matching assignments
     */
    public String getAssignmentsBySubject(String subject){

        String result = " ";

        for (Assignment a: Singleassignments){
            if (a.getSubject().equals(subject)){
                result += a.getName() + " - Due: " + a.getDueDate() + " || ";
            }
        }
        return result;
    }

     /**
     * Finds the due date of an assignment using the assignment name.
     *
     * @param name the name of the assignment
     * @return the due date of the assignment
     */
    public String findDueDate(String name){

        for (Assignment a : Singleassignments){
            if (a.getName().equals(name)){
                return a.getDueDate();
            }
        }
        return " ";
    }

    /**
     * Converts the assignment list into a 2D array table format.
     *
     * @return a 2D array containing assignment information
     */
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

     /**
     * Displays the introduction message for the Assignment Tracker program.
     */
    public void intro(){
        System.out.println("==================================");
        System.out.println("🖊️  📖 Assignment Tracker Program ✏️  📚");
        System.out.println("==================================");
        System.out.println("This program helps you keep track of your homework.");
        System.out.println("You will enter assignment name, subject, and due date below.");
    }

     /**
     * Removes an assignment from the list using its index number.
     *
     * @param index the index of the assignment to remove
     */
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
