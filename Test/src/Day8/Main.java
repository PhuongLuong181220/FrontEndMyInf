package Day8;

import Day8.iso.AbtractISO;
import Day8.iso.BanhKeo;
import Day8.iso.BanhMy;
import Day8.iso.NuocCham;

//Trường tượng
public class Main {
    /*
    bánh my, bánh kẹo nướng chấm
    ISO sản xuất 1 sản phẩm
    1. chuẩn bị vật liệu
    2. sản xuất
    3. an toàn
    */
    public static void main(String[] args) {
        AbtractISO banhMy = new BanhMy();
        AbtractISO banhKeo = new BanhKeo();
        AbtractISO nuocCham = new NuocCham();

        banhMy.sanxuat();
        System.out.println("==============");
        banhKeo.sanxuat();
        System.out.println("==============");
        nuocCham.sanxuat();
        System.out.println("==============");

    }
}
