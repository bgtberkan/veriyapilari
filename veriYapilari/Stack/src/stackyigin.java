public class stackyigin
{
    //Diziler İle Yığıt yapısı
    int dizi [];
    int size;
    int indis;

    public stackyigin(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }
    void push(int data) // dizie ekleme
    {
        if(isFull())
        {
            System.out.println("stack dolu");
        }
        else
        {
            indis++;
            dizi[indis] = data;
            System.out.println("Eklenen: " + dizi[indis]);
        }

    }
    int pop() // sil
    {
        if(isEmpty())
        {
            System.out.println("Stack boş");
            return -1;

        }
        else
        {
            return dizi[indis--];
        }

    }
    boolean isFull()
    {
        return (indis == size-1);
    }
    boolean isEmpty()
    {
        return (indis == -1);
    }

}
