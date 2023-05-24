import java.awt.*;
import java.util.Scanner;

import static java.awt.Color.red;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
