public class KuyrukYapisi
{
// Dizi ile kuyruk Yapısı
    int [] dizi;
    int size;
    int front; // baştaki eleman
    int rear; // son eleman

    public KuyrukYapisi(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }
    void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Kuyruk dolu");
        }
        else
        {
            rear++;
            dizi[rear]= data;
            System.out.println(data + " Kuyruğa eklendi");
        }
    }
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Kuyruk boş");
        }
        else
        {
            int sayi  = dizi[front];
            for(int i = 1; i <= rear ; i++)
            {
                dizi[i-1] = dizi[i];
            }
            rear--;
            System.out.println(sayi +" Kuyruktan Çıkarıldı");
        }

    }
    boolean isFull()
    {
        return rear == (size-1);
    }
    boolean isEmpty()
    {
        return rear == -1;
    }
    void itemNum()
    {
        System.out.println("eleman sayisi: " + (rear+1));
    }
    void print()
    {
        int i = rear;
        System.out.print("Son-> " );
        while (i >= 0)
        {
            System.out.print(dizi[i] + "-> ");
            i--;
        }
        System.out.println("Baş");
    }
}
