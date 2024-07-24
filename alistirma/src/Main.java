public class Main {
    public static void main(String[] args) {
        // Bu calışmamızda verilen iki dizinin dizi birin içerisinde sırasıyla altdizi varmı
        // diye kontrol edeceğiz
       int [] dizi = {1,4,7,8,5,2,3,6,9};
       int [] altdizi = {1,4};
       kuyruk kuyruk = new kuyruk(dizi.length);

       //dizi'yi kuyruğa ekliyoruz
        for(int i = 0 ; i < dizi.length ; i++)
        {
            kuyruk.enqueue(dizi[i]);
        }
        int sayac = 0;
        for(int j = 0 ; j <= altdizi.length -1 ; j++ )
        {
            if (kuyruk.isEmpty())
            {
                System.out.println("kuyrukta eleman bitti");
                break;
            }
            else {
                if(altdizi[j] == kuyruk.dequeue())
                {
                    System.out.println(j);
                    sayac = sayac + 1;
                }
                else
                {
                    j = -1;
                    sayac = 0;
                }
            }
        }
        if (sayac == altdizi.length )
        {
            System.out.println("alt küme");
        }
        else
        {
            System.out.println("değil");
        }
    }
}