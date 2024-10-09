package PersonStudentTeacher;

public class student extends person{
   
    private int studentNumber;
    private int score;
    private String major;

    public student(){
        super(); 
        studentNumber = 0;
        score = 0;
        major = "";
    }
    public student(String name, int age, int studentNumber, int score, String major){
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }
    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    //Override
    public void print() {
        super.print();
        System.out.println("StudentNumber:\t" + studentNumber);
        System.out.println("Score:\t" + score);
        System.out.println("Major:\t" + major);
    }
}
