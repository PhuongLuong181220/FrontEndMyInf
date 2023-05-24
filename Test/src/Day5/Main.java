package Day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ham khởi tạo mặc định
//        Person person = new Person();//Tạo ra 1 người
//        person.setHoVaTen("A");
//        person.setTuoi(22);
//        person.setNgaySinh("22/10/2000");
//
//        Person person1 = new Person("B",22,"18/12/2000");
//
//        person.show();
//        System.out.println("==============");
//        person1.show();


        Scanner scanner = new Scanner(System.in);
        Person p  = new Person();
        p.nhapThongTin(scanner);
        p.show();
        System.out.println("==========");
        Student st = new Student();
        st.nhapThongTin(scanner);
        st.show();
        System.out.println("=====");
        Worker w = new Worker();
        w.nhapThongTin(scanner);
        w.show();
    }
}
