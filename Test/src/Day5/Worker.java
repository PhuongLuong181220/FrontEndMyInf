package Day5;

import java.util.Scanner;

public class Worker extends Person {
    String congTy;
    long luong;

    @Override
    public void nhapThongTin(Scanner scanner) {
        //super la ham goi cua tk cha
        super.nhapThongTin(scanner);
        System.out.println("cong ty: ");
        this.congTy = scanner.nextLine();
        System.out.println("luong: ");
        this.luong = scanner.nextLong();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("cong ty: "+congTy);
        System.out.println("luong" + luong);
    }

    public String getCongTy() {
        return congTy;
    }

    public void setCongTy(String congTy) {
        this.congTy = congTy;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
}
