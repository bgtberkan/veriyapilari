public class kuyruk {
    int [] dizi;
    int size;
    int front;
    int rear;

    public kuyruk(int size) {
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
    int dequeue()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            int sayi  = dizi[front];
            for(int i = 1; i <= rear ; i++)
            {
                dizi[i-1] = dizi[i];
            }
            rear--;
            return sayi;
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
