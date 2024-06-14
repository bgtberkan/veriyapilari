public class tekYBL {
    Node head = null;
    Node tail = null;

    void basaEkle(int data)
    {
        Node eleman = new Node(data);
        if (head == null)
        {
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else
        {
            tail.next = eleman;
            eleman.next = head;
            head = eleman;
        }
    }
    void sonaEkle(int data)
    {
        Node eleman = new Node(data);
        if (head == null )
        {
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else
        {
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
        }

    }
    void arayaEkle(int indis , int data)
    {
       Node eleman = new Node(data);
       if (head == null)
       {
           head = eleman;
           tail = eleman;
           tail.next = head;
       }
       else if (indis == 0)
       {
           eleman.next = head;
           head = eleman;
           tail.next = head;
       }
       else
       {
           int n = 0;
           Node temp = head;
           while (temp != tail)
           {
               n++;
               temp = temp.next;
           }
           n++;
           if (indis >= n)
           {
               tail.next = eleman;
               tail = eleman;
               tail.next = head;
           }
           else
           {
               temp = head;
               Node temp2 = head;
               int i = 0;
               while (i < indis)
               {
                   temp2 = temp;
                   temp = temp.next;
                   i++;
               }
               temp2.next = eleman;
               eleman.next = temp;
           }
       }
    }
    void bastanSil()
    {
        if (head == null)
        {
            System.out.print("Liste Boş");
        }
        else if (head == tail)
        {
            head = null;
            tail = null;
            System.out.print("Son eleman da silindi");
        }
        else
        {
            head = head.next;
            tail.next = head;
            System.out.println("Baştan eleman silindi");
        }
    }
    void  sondanSil()
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }
        else if (head == tail)
        {
            head = null;
            tail = null;
            System.out.println("Son eleman da silindi");
        }
        else
        {
            Node temp = head.next;
            while (temp.next != tail)
            {
              temp = temp.next;
            }
            tail = temp;
            temp.next = head;
            System.out.println("Sondan silindi");
        }
    }
    void aradanSil(int indis)
    {

        if (head == null)
        {
            System.out.println("Liste boş");
        }
        else if (head == tail)
        {
            head = null;
            tail = null;
            System.out.println("Son eleman da silindi");
        }
        else
        {
            int n = 0;
            Node temp = head;
            Node temp2 =head;
            while (temp!= tail)
            {temp = temp.next;
               n++;
            }
            n++;
            temp = head;
            int i = 0;
            while(i < indis)
            {
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            temp2.next = temp.next;
            System.out.println("Ardan silindi");
        }

    }
    void yazdir()
    {
        if (head == null)
        {
            System.out.println("Liste Boş");
        }
        else
        {
            Node temp = head;
            System.out.print("Liste Başı -> ");
            while (temp != tail)
            {
                System.out.print(temp.data + "-> ");
                temp = temp.next;
            }
            System.out.print(temp.data + "-> liste sonu");
        }
    }
}
