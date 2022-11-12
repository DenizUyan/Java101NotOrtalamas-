package NotOrtalamasiProje;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int mat, fizik,kimya;

        Scanner ort = new Scanner(System.in);

        System.out.println("Mat Notu Gir: ");
        mat = ort.nextInt();

        System.out.println("Fizik Notu Gir:");
        fizik = ort.nextInt();

        System.out.println("Kimya Notu Gir:");
        kimya = ort.nextInt();

        int toplam = (mat + fizik + kimya);
        int sonuc = toplam / 3;

        System.out.println("Ortalamanız:" + sonuc);


    }
}
