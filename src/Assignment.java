public class Assignment {
    String name;
    String dueDate;
    String subject;

    public Assignment(String name, String subject, String dueDate){
        this.name = name;
        this.subject = subject;
        this.dueDate = dueDate;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }

    public String getDueDate(){
        return dueDate;
    }

    public String toString(){
        return "Name: " + name + " | Subject: " + subject + " | Due : " + dueDate;
    }

}
