import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Produk> daftarProduk;

    public Transaksi() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahItem(Produk p) {
        daftarProduk.add(p);
    }

    public void tampilkanTransaksi() {
        double total = 0;
        System.out.println("==========================");
        System.out.println("Daftar Belanja:");

        for (Produk p : daftarProduk) {
            System.out.println("- " + p.getNama() + " : Rp " + p.getHarga());
            total += p.getHarga();
        }

        System.out.println("--------------------------");
        System.out.println("Total Bayar: Rp " + total);
    }
}
