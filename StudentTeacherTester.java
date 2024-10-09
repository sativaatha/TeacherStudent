package PersonStudentTeacher;

import java.util.Scanner;

public class StudentTeacherTester {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Pilih Kategori\n 1. Student\n 2.  Teacher");
        String pilihan = s.nextLine();
        
        if (pilihan.equalsIgnoreCase("1")) {
            System.out.println("--Student--");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Major :");
            String major = s.nextLine();
            System.out.println("Age :");
            int age = s.nextInt();
            System.out.println("Student Number :");
            int studentNumber = s.nextInt();
            System.out.println("Score :");
            int score = s.nextInt();
            student a = new student(name, age, studentNumber, score, major);
            a.print();

        }else if (pilihan.equalsIgnoreCase("2")) {
            System.out.println("Pilih Kategori\n 1.FullTime\n 2.PartTime");
            String guru = s.nextLine();
            if (guru.equalsIgnoreCase("1")) {
                System.out.println("--Full Time Teacher--");
                System.out.println("Name :");
                String name = s.nextLine();
                System.out.println("Subject :");
                String subject = s.nextLine();
                System.out.println("Unit :");
                String unit = s.nextLine();
                System.out.println("Age :");
                int age = s.nextInt();
                System.out.println("Salary :");
                int anualSalary = s.nextInt();
                FullTime c = new FullTime(name, age, subject, anualSalary, unit);
                c.print();
            } else if (guru.equalsIgnoreCase("2")) {
                System.out.println("--Part Time Teacher--");
                System.out.println("Name :");
                String name = s.nextLine();
                System.out.println("Subject :");
                String subject = s.nextLine();
                System.out.println("Age :");
                int age = s.nextInt();
                System.out.println("hoursworked :");
                int hoursworked = s.nextInt();
                PartTime d = new PartTime(name, age, subject, hoursworked);
                d.print();
            }
        }

    }
    
}
