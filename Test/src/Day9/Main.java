package Day9;


import java.util.*;

/// colection
public class Main {
    public static void main(String[] args) {
        /*LIST
//        int [] arrays = new int[10];
//        arrays[0] = 1;
//        // xoa phan tu thu nam
//        // thay phan tu thu 5 thanh thu 6, thu 6 thanh thu 7 .....
//        arrays[5] = arrays[6];
//        arrays[6] = arrays[7];

        List<Integer> list = new ArrayList<>(); // mac dinh la 10 phan tu neu day tu tang 1.5
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println("do lon cua size: " +list.size());
        for (Integer i: list
             ) {
            System.out.println(i);

        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i);
//        }
        list.remove(1);
        for (Integer i: list
        ) {
            System.out.println(i);

        }

        LinkedList<Integer> linkedList = new LinkedList<>(); //tao 1 doi tuong sex tao 1 du lieu moc ra dang sau tiet kiem hon list
        linkedList.add(1);
        */
        //SET
        //la mot danh sach nhung 2 phan tu ko dc giong nhau
        //HashSet -> ko phan tu trung nhau
        Set<Student> students = new HashSet<>();
        students.add(new Student("A", "1"));
        students.add(new Student("A", "1"));
        students.add(new Student("A", "1"));
        System.out.println("do lon cua set: "+ students.size());
        //TreeSet -> ko co phan tu trung nhau + sap xep
        Set<Student> studentst = new TreeSet<>();
        studentst.add(new Student("B", "2"));
        studentst.add(new Student("A", "1"));
        studentst.add(new Student("C", "3"));
        for (Student student: studentst
             ) {
            System.out.println("tree set: " +student.toString());

        }

        //MAP
        // map can truyen 2 tham so laf key va value
        // key ko duoc trung nhau
        Map<String, Student> stringStudentMap = new HashMap<>();
        stringStudentMap.put("123", new Student("A","1"));
        stringStudentMap.put("456", new Student("A", "1"));
        for (Map.Entry<String, Student> entry: stringStudentMap.entrySet()
             ) {
            System.out.println("key: "+entry.getKey()+ ", value: " +entry.getValue().getName()+
                    " " + entry.getValue().getCode());
        }
    }
}
