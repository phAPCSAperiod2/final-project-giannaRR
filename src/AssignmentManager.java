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
        return -1; // in case if assignemnt isnt found
    }
}
