package Buoi5BT;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }


    public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, String soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        loaiTaiLieu = LoaiTaiLieu.TAPCHI;
        super.nhapThongTin(sc);
        System.out.print("nhập số phát hành: ");
        soPhatHanh = sc.nextLine();
        System.out.print("nhập tháng phát hành: ");
        thangPhatHanh = sc.nextInt(); sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("số phát hành: "+soPhatHanh);
        System.out.println("tháng phát hành: "+thangPhatHanh);
    }
}
