package Day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("A", "1"));
        studentList.add(new Student("D", "4"));
        studentList.add(new Student("B", "2"));
        studentList.add(new Student("C", "3"));
        //cach 1
//        java.util.Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        //cach 2: implements Comparble
        studentList.sort(null);
        for (Student student: studentList
             ) {
            System.out.println(student.toString());
        }
    }
}
