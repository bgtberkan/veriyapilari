public class StackYapisi
{
    //Liste ile Yığıt yapısı
    int size;
    int cnt; // sayac
    Node top; // en üst düğümü tutan gösterici
    public StackYapisi(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }
    void push(int data)
    {
        Node eleman = new Node(data);
        if(isFull())
        {
            System.out.println("Stcak dolu ekleme yapılamadı");
        }
        else
        {
            if (isEmpty())
            {
                top = eleman;
                cnt++;
                System.out.println("Stack'e ilk eleman eklendi \neklenen: " + top.data);
            }
            else
            {
                eleman.next = top;
                top = eleman;
                cnt++;
                System.out.println( top.data +" stack'e eklendi");
            }
        }

    }
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack boş eleman çıkarılamaz");
        }
        else
        {
            System.out.println(top.data + " stack'ten çıkarıldı");
            top = top.next;
            cnt--;

        }
    }

    boolean isEmpty()
    {
        return (cnt == 0);
    }
    boolean isFull()
    {
        return (cnt == (size-1));
    }

    void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack Boş");
        }
        else
        {
            Node temp = top;
            System.out.print("Stack başı-> ");
            while (temp != null)
            {
                System.out.print(temp.data + "-> " );
                temp = temp.next;
            }
            System.out.println("Son");
        }
    }
    void topPrint()
    {
        if (isEmpty())
        {
            System.out.println("Stack boş");
        }
        else
        {
            System.out.println("en üstteki elemanın değeri: " + top.data);
        }
    }

}
