package Day5;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Person {

    //private chỉ trong class
    //public không  giới hạn
    // default trong pakage
    private String hoVaTen;
    private int tuoi;
    private String ngaySinh;



    //String queQuan;

    public void nhapThongTin(Scanner scanner){
        System.out.println("Nhap ten: ");
        this.hoVaTen = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi = scanner.nextInt();

        System.out.println("Nhap ngay sinh(dd/mm/yyyy): ");
        this.ngaySinh = scanner.nextLine();
    }

    //overload: 1. cùng tên hàm cùng kiểu trả về
    //2. khác tham số truyền vào(số lượng, kiểu dữ liêu)
    //hàm khởi tạo có tham số.mặc định
    public Person(String hoVaTen, int tuoi, String ngaySinh) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
    }
//hàm khởi tạo ko tham số
    public Person() {

    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setHoVaTen(String hoVaTen) {
        if (hoVaTen == null) return;
        this.hoVaTen = hoVaTen;
    }

    public void show(){
        System.out.println("Ten: "+ hoVaTen);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Ngay Sinh: "+ ngaySinh);
    }
}
