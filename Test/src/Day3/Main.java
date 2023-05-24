package Day3;

public class Main {
    public static void main(String[] args){
        String h1 = "Xin chao";
        String h2 = new String("Xin chao");
        if(h1==h2){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
        if(h2.equals(h1)){ // trc equals  phai khac null
            System.out.println("3");
        }else {
            System.out.println("4");
        }
        System.out.println("do dai chuoi"+h1.length());
        System.out.println("ky tu tai vi tri 0 "+ h1.charAt(0));
        System.out.println("chuoi bat dau tu vi tri 1 ket thuc 4 "+ h1.substring(1,5));
        //cat chuoi trong th nay gap dau cach
        String split[] =  h1.split("");

        for (int i = 0 ; i< split.length;i++){
            System.out.println(split[i]);
        }

    }
}
