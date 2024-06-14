public class Main {
    public static void main(String[] args)
    {
        // Dizi ile kuyruk yapısı
       /* KuyrukYapisi kuyrukYapisi = new KuyrukYapisi(5);
        kuyrukYapisi.enqueue(10);
        kuyrukYapisi.enqueue(20);
        kuyrukYapisi.enqueue(30);
        kuyrukYapisi.enqueue(40);
        kuyrukYapisi.enqueue(50);
        kuyrukYapisi.print();*/

        // Liste ile kuyruk yapısı
        QueueYapisi yapisi = new QueueYapisi(5);
        yapisi.enqueue(10);
        yapisi.enqueue(20);
        yapisi.enqueue(30);
        yapisi.enqueue(40);
        yapisi.enqueue(50);
        yapisi.dequeue();
        yapisi.dequeue();
        yapisi.print();
    }
}