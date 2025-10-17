import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList todo = new ToDoList();
        int pilih;
        int id = 1;

        do {
            System.out.println("\n====================================");
            System.out.println("       APLIKASI TO-DO LIST");
            System.out.println("====================================");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Daftar Tugas");
            System.out.println("3. Ubah Status Tugas");
            System.out.println("4. Hapus Tugas");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // hapus newline

            switch (pilih) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Deskripsi: ");
                    String desk = sc.nextLine();
                    todo.tambahTugas(new Tugas(id++, judul, desk));
                    break;

                case 2:
                    todo.tampilkanSemua();
                    break;

                case 3:
                    System.out.print("Nomor tugas yang ingin diubah: ");
                    int ubah = sc.nextInt();
                    todo.ubahStatus(ubah);
                    break;

                case 4:
                    System.out.print("Nomor tugas yang ingin dihapus: ");
                    int hapus = sc.nextInt();
                    todo.hapusTugas(hapus);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}
