package Day3;

public class Bai4_3 {
    public static void main(String[] args) {
        String CHUOI = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";
        //step 1 thay the cac dau
        String text =  CHUOI.replaceAll("," , "").replaceAll("\\.", "")
                .replaceAll(":", "");
        System.out.println(text);

        // step 2 cat chuoi

        String split[] = text.split("");
        for (int i = 0 ; i< split.length-1; i++){
            int count =1;
            if (split[i].equals("")) continue;
            for (int j = i+1 ; j< split.length;j++){
                if(split[i].equals(split[j])){
                    count ++;
                    split[j] ="";
                }
            }
            System.out.println("Tu " + split[i] + " xuat hien " + count + " tu");
        }
        String split2[] = CHUOI.split("");
        for (int i = 0 ; i< split2.length -1 ; i++){
            System.out.println(split2[i].substring(0,1).toUpperCase()+ split2[i].substring(1));
        }

    }
}
