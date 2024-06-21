public class Main {
    public static void main(String[] args) {
        // Örnek bir dizi oluşturuluyor
        int [] dizi1 = {7, 3, 5, 1, 9};

        // Diziyi ekrana yazdırma
        diziGoster(dizi1);

        // Sıralama algoritmalarından herhangi biriyle sıralamak için ilgili satırı açın
        // insertSort(dizi1);
        // selectionSort(dizi1);
        // bubbleSort(dizi1);

        System.out.println("Sıralama Bitti");

        // Diziyi hızlı sıralama algoritması ile sırala
        int n = dizi1.length;
        quickSort(dizi1, 0, n - 1);

        // Sıralanmış diziyi ekrana yazdır
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i] + "-");
        }
    }

    // Diziyi ekrana yazdırma metodu
    private static void diziGoster(int [] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "-");
        }
        System.out.println(" ");
    }

    // Eklemeli sıralama (Insertion Sort) algoritması
    private static void insertSort(int[] dizi) {
        for (int i = 1; i < dizi.length; i++) {
            for (int k = i; k > 0; k--) {
                if (dizi[k] < dizi[k - 1]) {
                    // Elemanları yer değiştir
                    int temp = dizi[k];
                    dizi[k] = dizi[k - 1];
                    dizi[k - 1] = temp;
                }
            }
        }
    }

    // Seçmeli sıralama (Selection Sort) algoritması
    private static void selectionSort(int [] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            int min = i; // Minimum değeri tutan indeks
            for (int j = i; j < dizi.length; j++) {
                if (dizi[min] > dizi[j]) {
                    min = j; // Yeni minimum değeri bul
                }
            }
            // Minimum elemanı yerine koy
            int temp = dizi[min];
            dizi[min] = dizi[i];
            dizi[i] = temp;
        }
    }

    // Kabarcık sıralama (Bubble Sort) algoritması
    private static void bubbleSort(int [] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 1; j < dizi.length - i; j++) {
                if (dizi[j - 1] > dizi[j]) {
                    // Elemanları yer değiştir
                    int temp = dizi[j - 1];
                    dizi[j - 1] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
    }

    // Hızlı sıralama (Quick Sort) algoritması
    public static void quickSort(int[] dizi, int low, int high) {
        if (low < high) {
            // Pivot elemanını bul ve elemanları pivotun sol ve sağına ayır
            int pi = partition(dizi, low, high);

            // Pivotun solundaki elemanları sırala
            quickSort(dizi, low, pi - 1);

            // Pivotun sağındaki elemanları sırala
            quickSort(dizi, pi + 1, high);
        }
    }

    // Diziyi bölme ve pivotu yerleştirme metodu
    public static int partition(int[] dizi, int low, int high) {
        int pivot = dizi[high]; // Pivot olarak son elemanı seç
        int i = (low - 1); // Küçük elemanların indeksini tutar

        for (int j = low; j < high; j++) {
            if (dizi[j] < pivot) {
                i++;

                // Elemanları yer değiştir
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
            }
        }

        // Pivotu doğru yerine yerleştir
        int temp = dizi[i + 1];
        dizi[i + 1] = dizi[high];
        dizi[high] = temp;

        return i + 1;
    }
}
