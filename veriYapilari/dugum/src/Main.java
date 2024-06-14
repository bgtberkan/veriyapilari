public class Main {
    public static void main(String[] args) {
        dugumSinif nesne1 = new dugumSinif();  // Bellekte düğüm oluşturduk
        dugumSinif nesne2 = new dugumSinif();
        dugumSinif nesne3 = new dugumSinif();

        nesne1.sayi = 11; // Düğümlere değer atadık
        nesne2.sayi = 22;
        nesne3.sayi = 33;



        //Düğümleri birbirine bağlama

        nesne1.next = nesne2;
        nesne2.next = nesne3;
        nesne3.next = null;

        //Düğümlerde dolaşma
        dugumSinif temp = nesne1;
        while (temp != null)
        {
            System.out.println(temp.sayi);
            temp = temp.next;
        }
    }
}