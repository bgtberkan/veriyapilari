public class QueueYapisi
{
    Node front;
    Node rear;
    int cnt , size;

    public QueueYapisi(int size) {
        this.size = size;
        front = null;
        rear = null;
        cnt = 0;
    }
    void enqueue(char data)
    {
        if (isFull())
        {
            System.out.println("dolu");
        }
        else
        {
            Node eleman = new Node(data);
            if (isEmpty())
            {
                front = eleman;
                rear = eleman;

            }
            else
            {
                rear.next = eleman;
                rear = eleman;
            }
            cnt++;
        }
    }
    char dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Kuyruk boş");
            return  '-';
        }
        else
        {
            char ch = front.harf;
            front = front.next;
            cnt--;
            return ch;
        }
    }
    private boolean isFull()
    {
        return  cnt == size;
    }

    boolean isEmpty()
    {
        return cnt == 0;
    }
}
