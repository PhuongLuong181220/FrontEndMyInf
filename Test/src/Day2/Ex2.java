package Day2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String [] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        giaiPTBacNhat(a,b);
        giaiPTBacHai(a,b,c);
    }
        static void giaiPTBacNhat(int a, int b){
            if (a == 0) {
                if (b == 0) {
                    System.out.println("vo so");
                } else {
                    System.out.println("ko co");
                }
            } else {
                double Nghiem = (double) -b / a;
                System.out.println(Nghiem);
            }
            return;
        }
        static void giaiPTBacHai(int a, int b, int c){
            if (a==0){
                giaiPTBacNhat(b,c);
            }else {
                int delta = b*b -4*a*c;
                if(delta==0){
                    System.out.println("Phương trình nghiệm kép:"+(double)-b/(2*a));
                }else if(delta>0){
                    System.out.println("Phương trình có 2 nghiệm");
                    System.out.println("x1=" + (-b + Math.sqrt(delta)) / (2 * a));
                    System.out.println("x2=" + (-b - Math.sqrt(delta)) / (2 * a));
                }else {
                    System.out.println("vo nghiem");
                }
            }
    }
}
