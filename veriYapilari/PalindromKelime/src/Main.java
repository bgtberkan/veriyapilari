
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       StcakYapisi yapisi =  new StcakYapisi(100);
       QueueYapisi kuyruk = new QueueYapisi(100);
       Scanner sc = new Scanner(System.in);
       String kelime;
       System.out.println("Kelimeyi giriniz");
       kelime = sc.nextLine();
       int n = kelime.length();
       char [] harfler = kelime.toCharArray();
       int i = 0;
       while (i <n )
       {
           yapisi.push(harfler[i]);
           kuyruk.enqueue(harfler[i]);
           i++;
       }
       boolean sonuc =true;
       while (!yapisi.isEmpty())
       {
           if (yapisi.pop() != kuyruk.dequeue())
           {
               sonuc = false;
               break;
           }


       }
       if (sonuc)
       {
           System.out.println(kelime + " palindromdur");
       }
       else
       {
           System.out.println(kelime + " değildir");
       }
    }
}