public class MinPQ {
    int [] heap;
    int heapsize;

    public MinPQ(int capacite) {
        heap = new int[capacite];
        heapsize = 0;
    }
    public int Left(int i) {
        return 2 * (i + 1) - 1;
    }

    public int Right(int i) {
        return 2 * (i + 1);
    }

    public int Parent(int i) {
        return (i - 1) / 2;
    }
    public boolean HeapControl(int[] dizi) {
        return heapsize < heap.length;
    }
    public void HeapInsert(int key) {
        if (HeapControl(heap)) {
            int i = heapsize;
            heapsize++;
            heap[i] = key;

            while (i > 0 && heap[Parent(i)] > heap[i]) {
                int temp = heap[i];
                heap[i] = heap[Parent(i)];
                heap[Parent(i)] = temp;
                i = Parent(i);
            }
        }
    }
    public void BuildHeap(int[] dizi) {
        heapsize = dizi.length;
        for (int i = 0; i < dizi.length; i++) {
            heap[i] = dizi[i];
        }
        for (int i = (heapsize - 1) / 2; i >= 0; i--) {
            heapify(heap, i);
        }
    }

    private void heapify(int[] dizi, int i) {
        int largest = i;
        int L = Left(i);
        int R = Right(i);

        if (L < heapsize && dizi[L] < dizi[largest]) {
            largest = L;
        }
        if (R < heapsize && dizi[R] < dizi[largest]) {
            largest = R;
        }
        if (largest != i) {
            int temp = dizi[i];
            dizi[i] = dizi[largest];
            dizi[largest] = temp;
            heapify(dizi, largest);
        }
    }

    public void goruntule() {
        for (int i = 0; i < heapsize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public void HeapExtra_Or_Sort() {
        BuildHeap(heap);
        int originalSize = heapsize;
        for (int i = heapsize - 1; i >= 0; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            heapsize--;
            heapify(heap, 0);
        }
        heapsize = originalSize;
    }
}

