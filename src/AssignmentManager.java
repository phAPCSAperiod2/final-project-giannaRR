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
                result += a.toString();
            }
        }
        return result;
    }

    public double findDueDate(String name){

        for (Assignment a : Singleassignments){
            if (a.getName().equals(name)){
                return a.getDueDate();
            }
        }
        return -1;
    }

    public void printAllAssignments() {
        System.out.println("Name            Subject         Due Date");
        System.out.println("----------------------------------------");

        for (Assignment a : Singleassignments) {
            System.out.println(a.getName() + "   |   " + a.getSubject() + "    |    " + a.getDueDate()
            );
        }
    }

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

}
