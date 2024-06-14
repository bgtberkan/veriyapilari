public class QueueYapisi
{
    //Liste ile kuyruk yapısı

    Node front; // head
    Node rear; // tail
    int cnt; // sayac
    int size;

    public QueueYapisi(int size)
    {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }
    void enqueue(int data)
    {
        if(isfull())
        {
            System.out.println("Kuyruk yapısı dolu");
        }
        else
        {
            Node eleman = new Node(data);
            if (isEmpty())
            {
                front = rear = eleman;
                System.out.println(data + " kuyruğa ilk ekeman eklendi ");

            }
            else
            {
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data +  "Kuyruğa eklendi" );
            }
            cnt++;
        }
    }
    void  dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Kuyruk boş");
        }
        else
        {
            System.out.println( front.data + " silindi");
            front = front.next;
            cnt--;
        }
    }
    boolean isEmpty()
    {
        return cnt == 0;
    }

    boolean isfull()
    {
        return cnt == size;
    }
    void print()
    {
       if(isEmpty())
       {
           System.out.println("Kuyruk boş");
       }
       else
       {
           Node temp = front;
           System.out.print("Kuyruk başı-> ");
           while (temp != rear)
           {
               System.out.print( temp.data +"-> ");
               temp = temp.next;
           }
           System.out.println( temp.data +"-> Kuyruk sonu ");
       }
    }
}
