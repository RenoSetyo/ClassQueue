import java.util.ArrayDeque;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contoh_ArrayDeque {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Enqueue elemen ke dalam queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Dequeue elemen dari queue
        int elemenTerhapus = queue.remove();
        System.out.println("Elemen yang dihapus: " + elemenTerhapus);
        System.out.println("Queue setelah penghapusan: " + queue);

        // Melihat elemen pertama di queue
        int elemenDepan = queue.peek();
        System.out.println("Elemen pertama: " + elemenDepan);
        System.out.println("Queue setelah peek: " + queue);

        // Memeriksa apakah queue kosong
        boolean isEmpty = queue.isEmpty();
        System.out.println("Apakah queue kosong? " + isEmpty);

        // Mendapatkan ukuran queue
        int size = queue.size();
        System.out.println("Ukuran queue: " + size);

        // Mengosongkan queue
        queue.clear();
        System.out.println("Queue setelah dikosongkan: " + queue);

        br.readLine();
    }
}
