package Day4;

import java.util.Scanner;

public class Bai1 {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public String getTenSp(){
        return tenSp;
    }

    public void setTenSp(String tenSp){
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public Bai1(String tenSp, double donGia, double giamGia){
        this.tenSp= tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau(){
        return donGia * 0.1;
    }

    public void xuat(){
        System.out.println("ten sp: " +tenSp);
        System.out.println("don gia: "+donGia);
        System.out.println("giam gia: "+giamGia);
        System.out.println("thue nk: "+ getThueNhapKhau());
    }
}
