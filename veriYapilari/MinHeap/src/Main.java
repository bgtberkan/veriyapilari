public class Main {
    public static void main(String[] args) {
        MinPQ heap = new MinPQ(5);
        heap.HeapInsert(4);
        heap.HeapInsert(7);
        heap.HeapInsert(8);
        heap.HeapInsert(5);
        heap.HeapInsert(1);
        heap.HeapExtra_Or_Sort();
        heap.goruntule();
    }
}