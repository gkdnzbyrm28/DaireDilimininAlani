import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,a, pi=3.14, alan;

        Scanner utp = new Scanner(System.in);
        System.out.print("Yari Capi Giriniz..");
        r = utp.nextDouble();
        System.out.print("Merkez Acinin Olcusunu Giriniz..");
        a = utp.nextDouble();

        alan = (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alani="+ alan);
    }
}
