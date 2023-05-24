package EX1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person p = new Person();
        Student st = new Student();
        p.input(scanner);
        p.show();
        System.out.println("====st======");
        st.input(scanner);
        st.show();

    }
}
