package Day4;

public class Main {
    public static void main(String[] args){
        //cap phat bo nho dong
        Oto honda = new Oto();
        honda.bienSoXe = "76r2";
        honda.hangXe = "HONDA";

        Oto yamaha= new Oto();
        yamaha.bienSoXe = "76r21";
        yamaha.hangXe = "YAMAHA";

        honda.chayXe(100);
        yamaha.chayXe(200);

        //phan so
//        PhanSo a = new PhanSo();
//        PhanSo b = new PhanSo();
//        System.out.println("Nhap a: ");
//        a.nhapPhanSo();
//        System.out.println("nhap b: ");
//        b.nhapPhanSo();
//
//
//        PhanSo t = a.cong(b);
//        a.rutGonPhanSo();
//        System.out.println(" + ");
//        b.rutGonPhanSo();
//        System.out.println(" = ");
//        t.rutGonPhanSo();
//
//        PhanSo hieu = a.tru(b);
//        a.rutGonPhanSo();
//        System.out.println(" - ");
//        b.rutGonPhanSo();
//        System.out.println(" = ");
//        hieu.rutGonPhanSo();

        //bai1

//        Bai1 sp =new Bai1("sp1",500, 1000){
//            sp.xuat();
//        }
    }
}
