package Day5;

import java.util.Scanner;

public class Student extends Person {
    String truong;
    String maSoSV;

    //ghi de len cha
    @Override
    public void nhapThongTin(Scanner scanner) {
        //super la ham goi cua tk cha
        super.nhapThongTin(scanner);
        System.out.println("truong hoc: ");
        this.truong = scanner.nextLine();
        System.out.println("Nhap MSV: ");
        this.maSoSV = scanner.nextLine();
    }
// ghi đè lê hàm của tk cha
    @Override
    public void show() {
        super.show();
        System.out.println("Truong hoc: "+truong);
        System.out.println("MSV" + maSoSV);
    }
    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getMaSoSV() {
        return maSoSV;
    }

    public void setMaSoSV(String maSoSV) {
        this.maSoSV = maSoSV;
    }
}
