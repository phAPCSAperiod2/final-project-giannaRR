public class Assignment {
    String name;
    String subject;
    double dueDate;

    public Assignment(String name, String subject, double dueDate){
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

    public double getDueDate(){
        return dueDate;
    }

    public String toString(){
        return "Name: " + name + " | Subject: " + subject + " | Due : " + dueDate;
    }

    public int daysLeft(int currentDate){
        return dueDate - currentDate;
    }

}
