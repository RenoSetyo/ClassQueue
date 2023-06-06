import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contoh_LinkedList {
    public static void main(String[] args) throws IOException {
        Queue<String> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Enqueue elemen ke dalam queue
        queue.add("Elemen 1");
        queue.add("Elemen 2");
        queue.add("Elemen 3");

        System.out.println("Queue: " + queue);

        // Dequeue elemen dari queue
        String elemenTerhapus = queue.remove();
        System.out.println("Elemen yang dihapus: " + elemenTerhapus);
        System.out.println("Queue setelah penghapusan: " + queue);

        // Melihat elemen pertama di queue
        String elemenDepan = queue.peek();
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