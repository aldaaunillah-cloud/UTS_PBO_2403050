public class Tugas {
    private int id;
    private String judul;
    private String deskripsi;
    private boolean selesai;

    // Konstruktor
    public Tugas(int id, String judul, String deskripsi) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.selesai = false;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public boolean isSelesai() {
        return selesai;
    }

    public void setSelesai(boolean selesai) {
        this.selesai = selesai;
    }

    // Method tampilkan info tugas
    public void tampilkanInfo() {
        System.out.println(id + ". " + judul + " - " + deskripsi +
            (selesai ? " [Selesai]" : " [Belum Selesai]"));
    }
}
