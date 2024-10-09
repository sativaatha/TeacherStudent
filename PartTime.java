package PersonStudentTeacher;

public class PartTime extends teacher{
    private int hoursworked;


    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }
    
    public PartTime(){
        super(); 
        hoursworked = 0;    
    }
    public PartTime(String name, int age, String subject, int hoursworked){
        super(name, age, subject);
        this.hoursworked = hoursworked;

    }
    public void print() {
        super.print();
        System.out.println("Hoursworked:\t" + hoursworked);

    }
}
