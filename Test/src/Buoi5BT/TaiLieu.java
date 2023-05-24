package Buoi5BT;

import java.io.Serializable;
import java.util.Scanner;

public class TaiLieu implements Serializable {// dạng mã hoá lưu file đọc file để phân biệt
    // thuoctinh
    private String maTaiLieu;
    private String tenNXB;
    private int soBanPhatHanh;
    protected LoaiTaiLieu loaiTaiLieu;



    //phuongthuc
    //kham khoi tao khong doi so

    public TaiLieu() {
    }

    //hamkhoi tao co doi so

    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public LoaiTaiLieu getLoaiTaiLieu() {
        return loaiTaiLieu;
    }

    public void setLoaiTaiLieu(LoaiTaiLieu loaiTaiLieu) {
        this.loaiTaiLieu = loaiTaiLieu;
    }

    //nhap
    public void nhapThongTin(Scanner sc){
        System.out.print("nhập mã tài liệu: ");
        maTaiLieu = sc.nextLine();
        System.out.print("nhập tên nhà xuất bản: ");
        tenNXB = sc.nextLine();
        System.out.print("số bản phát hành: ");
        soBanPhatHanh = sc.nextInt(); sc.nextLine();
    }

    //ham hien thị
    public void hienThiThongTin(){
        System.out.println("mã tài liệu: "+maTaiLieu);
        System.out.println("tên nhà xuất bản: "+tenNXB);
        System.out.println("số bản phát hành: "+soBanPhatHanh);
    }

    //lay ra ma tai lieu
    public String getMaTaiLieu(){
        return maTaiLieu;
    }
}
