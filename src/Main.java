import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, x;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin Yarı Çapını Giriniz : " );
        r = inp.nextInt();
        System.out.println("Daire Diliminin Merkez Açısını Giriniz : ");
        x = inp.nextInt();

        /* Formül:
        Daire diliminin alanı = (pi * ( r * r )* a / 360
        a = merkez açısının ölçüsü
         */
        double alan = (pi * (r * r)*x) /360;
        System.out.println("Daire Diliminin Alanı : " + alan);


    }
}