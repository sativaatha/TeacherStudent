package PersonStudentTeacher;

public class FullTime extends teacher{
    private int annualSalary;
    private String unit;
    
    public int getAnualSalary() {
        return this.annualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.annualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public FullTime(){
        super();
        unit = "";
        annualSalary = 0;
    }
    public FullTime(String name, int age, String subject, int annualSalary, String unit){
        super(name, age, subject);
        this.unit = unit;
        this.annualSalary = annualSalary;
    }
    public void print() {
        super.print();
        System.out.println("Unit: \t" + unit) ;
        System.out.println("AnualSalary:\t" + annualSalary);
    }    
}
