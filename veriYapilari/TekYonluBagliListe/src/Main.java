public class Main {
    public static void main(String[] args) {
        bListe liste = new bListe();
        liste.listedolumu();
        liste.ekle(11);
        liste.ekle(22);
        liste.ekle(33);
        liste.listedolumu();
        liste.yazdir();
        liste.basaEkle(00);
        liste.yazdir();
        liste.sonaEkle(44);
        liste.yazdir();
        liste.arayaEkle(2,5);
        liste.yazdir();
        liste.aradanSil(5);
        liste.yazdir();

    }
}