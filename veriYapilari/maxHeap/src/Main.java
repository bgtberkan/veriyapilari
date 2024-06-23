public class Main {
    public static void main(String[] args) {
        MaxPQ heap = new MaxPQ(4);
        heap.HeapInsert(4);
        heap.HeapInsert(7);
        heap.HeapInsert(8);
        heap.HeapInsert(5);
        heap.HeapExtra_Or_Sort();
        heap.goruntule();
    }
}