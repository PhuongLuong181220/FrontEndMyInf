package Buoi5BT;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLySach qls = new QuanLySach();

        qls.nhapDanhSachTL(sc);

        System.out.println("nhập vào loại tài liệu cần tìm: ");
        String loai = sc.nextLine();
        qls.timLoaiTL(loai);

        System.out.println("nhập vào mã tài liệu cần tìm: ");
        String maTL = sc.nextLine();
        qls.timMaTL(maTL);

        sc.close();
    }
}
