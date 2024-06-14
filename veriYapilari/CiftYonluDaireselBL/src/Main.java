public class Main {
    public static void main(String[] args) {
        CiftDiareselBL liste = new CiftDiareselBL();
        liste.basaEkle(1);
        liste.basaEkle(7);
        liste.basaEkle(3);
        liste.arayaEkle(0,5);
        liste.yazdir();
        liste.aradanSil(4);
        liste.yazdir();
    }
}