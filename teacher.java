package PersonStudentTeacher;

public class teacher extends person{
    private String subject;
      public teacher(){
        super(); 
        subject = " ";
    }
    public teacher(String name, int age, String subject){
        super(name, age );
        this.subject = subject;
    }
    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //Override
    public void print() {
        super.print();
        System.out.println("Subject:\t" + subject);
        
    }    
}
