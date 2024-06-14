public class BagliListe {
    // Çift Yönlü bağlı Liste
    Node head = null;
    Node tail = null;

    void basaEkle(int data)
    {
        Node eleman = new Node(data);
        if (head == null)
        {
            head = eleman;
            tail = eleman;
        }
        else
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }
    void  sonaEkle(int data)
    {
        Node eleman = new Node(data);
        if (head == null)
        {
            head = eleman;
            tail = eleman;
        }
        else
        {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }
    void yazdir()
    {
        Node temp = head;
        System.out.print("liste başı -> ");
        while (temp != null )
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("liste sonu");

    }
    void  sondanYazdir()
    {
        Node temp = tail;
        System.out.print("liste sonu -> ");
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("liste başı");
    }
    void arayaekle(int indis , int data )
    {
        Node eleman = new Node(data);
        if (head == null)
        {
            head = eleman;
            tail = eleman;
        }
        else if (head != null && indis == 0)
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
        else
        {
            Node temp = head;
            int n = 0;
            while (temp != null)
            {
                temp = temp.next;
                n++;
            }
            temp = head;
            if( indis > n )
            {
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
            }
            else
            {
                int i = 0;
                while (i != indis)
                {
                    temp = temp.next;
                    i++;
                }
                eleman.prev = temp.prev;
                temp.prev.next = eleman;
                eleman.next = temp;
                temp.prev = eleman;

            }
        }
    }
    void bastanSilme()
    {
        if (head != null)
        {
            if(head.next == null)
            {
                head = null;
                tail = null;
            }
            else
            {
                head = head.next;
                head.prev = null;
            }
        }
    }
    void sondanSil()
    {
        if(head != null)
        {
            if(head.next == null)
            {
                head = null;
                tail = null;
            }
            else
            {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    void aradanSil(int indis)
    {
        if(head != null)
        {
            if (head.next == null)
            {
                head = null;
                tail = null;
            }
            else if(head.next != null && indis <= 0 )
            {
                head = head.next;
                head.prev = null;
            }
            else
            {
                int n = 0;
                Node temp = head;
                while (temp != null )
                {
                    temp = temp.next;
                    n++;
                }
                if(n-1 <= indis)
                {
                    tail = tail.prev;
                    tail.next = null;
                }
                else
                {
                    temp = head;
                    int i = 0;
                    while (i < indis)
                    {
                        temp = temp.next;
                        i++;
                    }
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }
            }
        }
    }
}
