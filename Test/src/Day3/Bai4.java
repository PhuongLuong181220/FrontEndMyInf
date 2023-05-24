package Day3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai4 {
    public static void main(String[] args){
        //String phoneRegex = "(0|84|\\+84)(\\d{3})((\\.|-)?)(\\d{3})((\\.|-)?)(\\d{3})";
        String phoneRegexV = "((086|096)(\\d{1})((\\.|-)?)(\\d{3})((\\.|-)?)(\\d{3}))";
        String phoneRegexM = "((089|070)(\\d{1})((\\.|-)?)(\\d{3})((\\.|-)?)(\\d{3}))";
        Pattern patternV = Pattern.compile(phoneRegexV);
        Pattern patternM = Pattern.compile(phoneRegexM);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sđt:");
        String phone = scanner.nextLine();
        if(patternV.matcher(phone).find()){
            System.out.println("So " + phone + " la sdt V");
        } else if (patternM.matcher(phone).find()) {
            System.out.println("So " + phone + " la sdt M");
        }else {
            System.out.println("So " + phone + " khong phai sdt");
        }


    }
}
