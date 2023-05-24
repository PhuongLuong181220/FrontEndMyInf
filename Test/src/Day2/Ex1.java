package Day2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        a = scanner.nextInt();
        System.out.println("b=");
        b = scanner.nextInt();
        System.out.println("c=");
        c = scanner.nextInt();

        if (a+b>c || b+c > a || a+c > b){

        }else {
            System.out.println("ko");
            return;
        }
        if (a==b|| a==c || b== c){
            if (a==b && b==c){
                System.out.println("deu");
            }
            else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a){
                System.out.println("vuong can");
            }
            else {
                System.out.println("can");
            }
        }else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a){
            System.out.println("vong");
        }else {
            System.out.println("tam giac");
        }


    }
}
