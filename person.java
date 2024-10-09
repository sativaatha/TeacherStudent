package PersonStudentTeacher;

public class person {
    private String name;
    private int age;

    public person(){
        name = "";
        age = 17;
    } 
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     //Override
     public void print() {
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
    }
}
