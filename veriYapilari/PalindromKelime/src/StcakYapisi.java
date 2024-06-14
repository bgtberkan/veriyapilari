public class StcakYapisi
{
    //adanada
    Node top;
    int size;
    int cnt;

    public StcakYapisi(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }
    void push (char data)
    {
        if(isFull())
        {
            System.out.println("Dolu");
        }
        else
        {
            Node eleman = new Node(data);
            if (isEmpty())
            {
                top = eleman;
            }
            else
            {
                eleman.next = top;
                top = eleman;
            }
            cnt++;
        }
    }
    char  pop()
    {
        if(isEmpty())
        {
            System.out.println("Stcak boş");
            return '-';
        }
        else
        {
            char ch  = top.harf;
            top = top.next;
            cnt--;
            return ch;

        }
    }
    boolean isEmpty()
    {
        return top == null;
    }
    boolean isFull()
    {
        return  size == cnt;
    }

}
