package EX1;

import java.util.Scanner;

public class Person {
    private String hoTen;
    private String diaChi;
    public Person() {

    }
    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void input(Scanner scanner){
        System.out.println("Nhap ho va ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Dia chi: ");
        this.diaChi = scanner.nextLine();
        scanner.nextLine();
    }
    public void show(){
        System.out.println("ho va ten: " + hoTen);
        System.out.println("dia chi: "+diaChi);
    }
}
