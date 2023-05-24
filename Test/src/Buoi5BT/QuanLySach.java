package Buoi5BT;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dstl;

    public QuanLySach() {
        dstl = new ArrayList<TaiLieu>(10);
    }

    //them moi 1 tai liệu
    public void themTaiLieu(TaiLieu tl){

        dstl.add(tl);
        //FileUtils.luuDanhSachTaiLieu();
    }


    // nhap danh sach tai lieu
    public void nhapDanhSachTL(Scanner sc){
        String stop;
        TaiLieu tl;
        do {
            System.out.print("chọn loại tài liệu (1-sach ; 2-tạp chí; 3-báo)");
            int chon = sc.nextInt();sc.nextLine();
            switch (chon){
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new TapChi();
                    break;
                case 3:
                    tl = new Bao();
                    break;
                default:
                    tl=new Sach();
                    break;
            }

            tl.nhapThongTin(sc);
            themTaiLieu(tl);
            System.out.print("bạn có muốn nhập vào nữa không ( c/k )!");
            stop = sc.nextLine();
        }while (stop.equals("c"));
    }
    // tim kim theo ma tai lieu
    public void timMaTL(String maTL){
        for (TaiLieu tl :dstl){
            if (maTL.equals(tl.getMaTaiLieu())){
                tl.hienThiThongTin();
            }
        }
    }

    // tim kim theo loại tài liệu
    public void timLoaiTL(String loai){
        for (TaiLieu tl: dstl){
            if (loai.equals("sach")&&(tl instanceof Sach)) {
                tl.hienThiThongTin();
            } else if (loai.equals("TapChi")&&(tl instanceof TapChi)) {
                tl.hienThiThongTin();
            } else if (loai.equals("Bao")&&(tl instanceof Bao)) {
                tl.hienThiThongTin();
            }
        }
    }
}
