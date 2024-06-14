import java.lang.annotation.ElementType;

public class CiftDiareselBL
{
    Node head = null;
    Node tail = null;
    int indis;
    void basaEkle(int data)
    {
        Node eleman = new Node(data);
        if (head == null )
        {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;

            System.out.println("Liste Oluşturuldu ve başa eleman eklendi");
        }
        else
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }
    void sonaEkle(int data)
    {
        Node eleman = new Node(data);
        if(head == null)
        {
            head = eleman;
            tail = eleman;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else
        {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            tail.next = head;
            head.prev = tail;

        }
    }
    void arayaEkle(int indis , int data)
    {
        Node eleman = new Node(data);
        if (head == null)
        {
            head = eleman;
            tail = eleman;
            head.next = tail;
            head.prev = tail;
            tail.prev = head;
            tail.next = head;
        }
        else if (indis == 0)
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;
        }
        else
        {
            Node temp = head;
            int n = 0;
            while (temp != tail)
            {
                n++;
                temp = temp.next;
            }
            n++;
            if (indis >= n)
            {
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
                tail.next = head;
                head.prev = tail;
                System.out.println(",cddc");
            }
            else
            {
                int i = 0;
                temp = head;
                while (i < indis-1 )
                {
                    temp = temp.next;
                    i++;

                }
                temp.next.prev = eleman;
                eleman.next = temp.next;
                temp.next = eleman;
                eleman.prev = temp;

            }

        }
    }
    void bastanSil()
    {
        if (head == null)
        {
            System.out.println("Liste Boş");
        }
        else if (head == tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
        }
    }
    void sondanSil()
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }
        else if (head == tail)
        {
            head = null;
            tail = null;
            System.out.println("Listedeki tek eleman da silindi");
        }
        else
        {
            head.prev = tail.prev;
            tail.prev.next = head;
            tail = tail.prev;
        }
    }
    void aradanSil(int indis)
    {
        if (head == null)
        {
            System.out.println("Listede silineccek eleman yok");
        }
        else if (head == tail && indis == 0)
        {
            head = null;
            tail = null;
        }
        else
        {
            if (indis == 0 )
            {
                tail.next = head.next;
                head.next.prev = tail;
                head = head.next;
            }
            else
            {
                Node temp = head;
                int n = 0;
                while (temp != tail)
                {
                    n++;
                    temp = temp.next;
                }
                temp = head;
                if (indis >= n )
                {
                    head.prev = tail.prev;
                    tail.prev.next = head;
                    tail = tail.prev;
                }
                else
                {
                    int i = 1;
                    while (i < indis)
                    {
                        temp = temp.next;
                        i++;
                    }
                    temp.next = temp.next.next;
                    temp.next.next.prev = temp;
                }
            }
        }
    }
    void yazdir()
    {
        Node temp = head;
        System.out.print("liste başı -> " );
        while (temp != tail )
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(tail.data +" -> liste sonu");
    }
    void terstenYazdir()
    {
        Node temp = tail;
        System.out.print("Liste sonu -> ");
        while (temp != head)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println(temp.data + " -> Liste başı");
    }
}
