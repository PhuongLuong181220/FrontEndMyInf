package Buoi5BT;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    public static void luuDanhSachTaiLieu(ArrayList taiLieus, String part) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream(part);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Khai báo mảng
            //Bước 2: Ghi mảng đối tượng vào file
            oos.writeObject(taiLieus);
            //Bước 3: Đóng luồng
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public static ArrayList docDanhsachTaiLieu(String part) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream(part);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Bước 2: Đọc dữ liệu
            ArrayList resul = (ArrayList) ois.readObject();
            //Bước 3: Đóng luồng
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
        return null;
    }
    static final String SACH_PATH = "C:\\Users\\Administrator\\Documents\\2208\\sach.bin";
    static final String BAO_PATH = "C:\\Users\\Administrator\\Documents\\2208\\bao.bin";
    static final String TAPCHI_PATH = "C:\\Users\\Administrator\\Documents\\2208\\tap_chi.bin";
    public static void luuDanhSachTaiLieu(ArrayList<TaiLieu> taiLieus){
        if (taiLieus == null || taiLieus.size() ==0)
            return;
        ArrayList<Sach> saches = new ArrayList<>();
        ArrayList<Bao> baos = new ArrayList<>();
        ArrayList<TapChi> tapchis = new ArrayList<>();
        for (int i = 0; i < taiLieus.size(); i++) {
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.SACH))
                saches.add((Sach) taiLieus.get(i));
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.BAO))
                baos.add((Bao) taiLieus.get(i));
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.TAPCHI))
                tapchis.add((TapChi) taiLieus.get(i));
        }
        luuDanhSachTaiLieu(saches,SACH_PATH);
        luuDanhSachTaiLieu(tapchis, TAPCHI_PATH);
        luuDanhSachTaiLieu(baos,BAO_PATH);
    }

    public static ArrayList<TaiLieu> docDanhSachTaiLieu(){
        ArrayList<Sach> saches = (ArrayList<Sach>) docDanhsachTaiLieu(SACH_PATH);
        ArrayList<Bao> baos = (ArrayList<Bao>) docDanhsachTaiLieu(BAO_PATH);
        ArrayList<TapChi>tapChis  = (ArrayList<TapChi>) docDanhsachTaiLieu(TAPCHI_PATH);

        ArrayList<TaiLieu> taiLieus = new ArrayList<>();
        taiLieus.addAll(saches);
        taiLieus.addAll(baos);
        taiLieus.addAll(tapChis);
        return null;
    }
}

