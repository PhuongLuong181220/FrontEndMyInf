package EX1;

import java.util.Scanner;

public class Student extends Person {
    private String iD;
    private String school;

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("ID: ");
        this.iD = scanner.nextLine();
        System.out.println("School: ");
        this.school = scanner.nextLine();
    }

    public Student() {

    }
    public Student(String iD, String school) {
        this.iD = iD;
        this.school = school;
    }


    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("ID"+iD);
        System.out.println("shool: "+school);

    }
}
