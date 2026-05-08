/**
 * Represents a school assignment with a name,
 * subject, and due date.
 */
public class Assignment {
    String name;
    String dueDate;
    String subject;

     /**
     * Creates a new Assignment object.
     *
     * @param name the name of the assignment
     * @param subject the subject of the assignment
     * @param dueDate the due date of the assignment
     */
    public Assignment(String name, String subject, String dueDate){
        this.name = name;
        this.subject = subject;
        this.dueDate = dueDate;
    }

    /**
     * Returns the assignment name.
     *
     * @return the assignment name
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the assignment subject.
     *
     * @return the assignment subject
     */
    public String getSubject(){
        return subject;
    }

    /**
     * Returns the assignment due date.
     *
     * @return the assignment due date
     */
    public String getDueDate(){
        return dueDate;
    }

    /**
     * Returns the assignment information as a string.
     *
     * @return formatted assignment information
     */
    public String toString(){
        return "Name: " + name + " | Subject: " + subject + " | Due : " + dueDate;
    }

}
