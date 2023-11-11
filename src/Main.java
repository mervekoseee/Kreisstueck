import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        int r, a;
        double alan;

        System.out.println("Dairenin Yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.println("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        alan = (pi *(r*r) * a) / 360;
        System.out.println("daire diliminin alanı: " + alan);

    }
}