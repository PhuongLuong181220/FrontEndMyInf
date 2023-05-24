package Buoi5BT;

import java.util.Scanner;

public class Sach extends TaiLieu{
    //thuoctinh
    private String tacGia;
    private int soTrang;


    //phuongthuc
    //ham khoi tao khong doi so
    public Sach() {

    }
    //ham khoi tao co doi so

    public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        loaiTaiLieu = LoaiTaiLieu.SACH;
        super.nhapThongTin(sc);
        System.out.print("nhập tác giả: ");
        tacGia = sc.nextLine();
        System.out.print("nhập số trang: ");
        soTrang= sc.nextInt();sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("tác giả: "+tacGia);
        System.out.println("số trang: "+soTrang);
    }
}
