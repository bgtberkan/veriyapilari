public class bListe {
    Node head = null;
    Node tail = null;

    void listedolumu()
    {
        if (head == null)
        {
            System.out.println("Liste Boş");
        }
        else
        {
            System.out.println("Liste boş değil");
        }
    }
    void ekle(int x) { // ekle metodunu
        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi");
        } else {
            tail.next = eleman;
            tail = eleman;
            System.out.println("Listeye eleman eklendi");
        }
    }
    void yazdir() // Listeyi görüntüleme
    {
        if (head == null)
        {
            System.out.println("Liste Boş");
        }
        else
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Liste Sonu");
        }
    }

    void basaEkle(int x) // Listeyin başına eleman ekleme
    {
        Node eleman = new Node();
        eleman.data = x;

        if (head == null)
        {
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else
        {
            eleman.next = head;
            head = eleman;
            System.out.println("başa eleman eklendi");
        }

    }
    void sonaEkle(int x) // Listeyin sonuna eleman ekleme
    {
        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;
        if (head == null)
        {
            head = eleman;
            tail = eleman;
            System.out.println("Sona eklendi");
        }
        else
        {
            tail.next = eleman;
            eleman = tail;
        }
    }
    void arayaEkle(int indis ,int x )  // istenilen indise eleman ekleme
    {
        Node eleman = new Node();
        eleman.data = x;
        if(head == null && indis == 0)
        {
            eleman.next = head;
            head = eleman;
            tail = eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        }
        else if (head != null && indis == 0)
        {
            eleman.next = head;
            head = eleman;
            System.out.println(indis+ "'inci sıraya yeni eleman eklendi");
        }
        else
        {
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp != null ) // indis sayısını bulma
            {
                n++;
                temp2 = temp;
                temp = temp.next;

            }
            if (n == indis) // Kullanıcıyın girdiği indis son indis mi?
            {
               temp2.next = eleman;
               eleman.next = temp;
                System.out.println(indis+ "'inci sıraya yeni eleman eklendi");


            }
            else // Kullanıcıyın girdiği indise elamanı eklme
            {
                temp = head;
                temp = head;
                int i = 0;
                while (i != indis)
                {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(indis+ "'inci sıraya yeni eleman eklendi");
            }

        }
    }
    void bastanSil()
    {
       if (head == null)
       {
           System.out.println("Listede Silinecek eleman yok");
       }
       else if (head.next == null)
       {
           head = null;
           tail = null;
           System.out.println("Listede kalan son eleman silindi");
       }
       else
       {
           head = head.next;
           System.out.println("Baştan eleman silindi");
       }
    }
    void sondanSil()
    {
        if (head == null)
        {
            System.out.println("Liste Boş");
        }
        else if (head.next == null)
        {
            head = null;
            tail = null;
            System.out.println("Lİstede kalan son eleman silindi");
        }
        else
        {
            Node  temp = head;
            Node temp2 = head;
            while (temp.next != null)
            {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
            System.out.println("sondan eleman silindi");
        }
    }
    void aradanSil(int indis)
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }
        else if ( head.next == null && indis == 0)
        {
            head = null;
            tail = null;
            System.out.println("liste Kalan son eleman silindi");
        }
        else if (head.next != null && indis == 0)
        {
            head = head.next;
            System.out.println("Baştan silindi");
        }
        else
        {
            Node temp = head;
            int i = 0;
            Node temp2 = head;
            while (temp != null)
            {
                i++;
                temp2 = temp;
                temp = temp.next;
            }
            if (i == indis)
            {
                temp2.next = null;
                tail = temp2;
                System.out.println("Listedeki son eleman silindi");
            }
            else
            {
                temp = head;
                temp2 = head;
                int j = 0;
                while (j != indis )
                {
                    temp2 = temp;
                    temp = temp.next;
                    j++;
                }
                temp2.next = temp.next;
                System.out.println("Aradan silindi");
            }
        }
    }
}
