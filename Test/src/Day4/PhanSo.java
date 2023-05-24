package Day4;

import java.util.Scanner;

public class PhanSo {
    int tuSo;
    int mauSo;
    void ganTuSo(){
        this.tuSo = tuSo;
    }
    void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b==0){
            System.out.println("sai. moi ban nhap lai");
            b = sc.nextInt();
        }
        this.tuSo = a;
        this.mauSo = b;
    }

    void rutGonPhanSo(){
        int UCLN;
        int a = Math.abs(this.tuSo);
        int b = Math.abs(this.mauSo);
        while (a!=b){
            if (a>b){
                a = a-b;
            }else {
                b = b-a;
            }
        }
        UCLN = a;
        System.out.println("phan so "+ this.tuSo/UCLN + "/ "+ this.mauSo/UCLN);

    }
    PhanSo cong(PhanSo other){
        PhanSo tong = new PhanSo();
        tong.tuSo = this.tuSo * other.mauSo + this.mauSo*other.tuSo;
        tong.mauSo = this.mauSo* other.mauSo;
        return tong;
    }

    PhanSo tru(PhanSo other){
        PhanSo tong = new PhanSo();
        tong.tuSo = this.tuSo * other.mauSo - this.mauSo*other.tuSo;
        tong.mauSo = this.mauSo* other.mauSo;
        return tong;
    }



}
