import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Tugas> daftarTugas = new ArrayList<>();

    // Tambah tugas
    public void tambahTugas(Tugas tugas) {
        daftarTugas.add(tugas);
        System.out.println("✅ Tugas berhasil ditambahkan!");
    }

    // Lihat semua tugas
    public void tampilkanSemua() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Belum ada tugas yang tersimpan.");
        } else {
            System.out.println("=== DAFTAR TUGAS ===");
            for (Tugas t : daftarTugas) {
                t.tampilkanInfo();
            }
        }
    }

    // Ubah status selesai
    public void ubahStatus(int id) {
        if (id > 0 && id <= daftarTugas.size()) {
            Tugas t = daftarTugas.get(id - 1);
            t.setSelesai(!t.isSelesai());
            System.out.println("Status tugas berhasil diubah!");
        } else {
            System.out.println("Nomor tugas tidak valid.");
        }
    }

    // Hapus tugas
    public void hapusTugas(int id) {
        if (id > 0 && id <= daftarTugas.size()) {
            daftarTugas.remove(id - 1);
            System.out.println("Tugas berhasil dihapus!");
        } else {
            System.out.println("Nomor tugas tidak valid.");
        }
    }
}
