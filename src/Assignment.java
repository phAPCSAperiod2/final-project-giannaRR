public class Assignment {
    String name;
    String subject;
    int dueDate;

    public static void main(String[] args) throws Exception {

    }

    public Assignment(String name, String subject, int dueDate){
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

    public int getDate(){
        return dueDate;
    }

    public String toString(){
        return "Name: " + name + " | Subject: " + subject + " | Due : " + dueDate;
    }

    public int daysLeft(int currentDate){
        
    }

}
