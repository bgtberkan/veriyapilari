public class Main {
    public static void main(String[] args) {
        //Dizi ile Yığıt yapısı
        /*stackyigin stackyigin = new stackyigin(5);
        stackyigin.push(1);
        stackyigin.push(2);
        stackyigin.push(3);
        stackyigin.push(4);
        stackyigin.push(5);
        System.out.println(stackyigin.pop());
        System.out.println(stackyigin.pop());*/

        //Liste ile Yığıt yapısı
        StackYapisi stack = new StackYapisi(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.topPrint();
        stack.pop();
        stack.print();

    }
}