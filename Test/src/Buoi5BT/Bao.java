package Buoi5BT;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao() {

    }

    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        loaiTaiLieu = LoaiTaiLieu.BAO;
        super.nhapThongTin(sc);
        System.out.print("nhập ngày phát hành: ");
        ngayPhatHanh = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("ngày phát hành: "+ngayPhatHanh);
    }
}
