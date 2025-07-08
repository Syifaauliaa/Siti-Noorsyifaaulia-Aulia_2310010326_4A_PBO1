import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();

        try {
            System.out.print("Masukkan jumlah produk: ");
            int jumlah = Integer.parseInt(input.nextLine());

            for (int i = 0; i < jumlah; i++) {
                System.out.println("\nProduk ke-" + (i + 1));
                System.out.print("Kode Produk: ");
                String kode = input.nextLine();

                System.out.print("Nama Produk: ");
                String nama = input.nextLine();

                System.out.print("Harga: ");
                double harga = Double.parseDouble(input.nextLine());

                System.out.print("Ada Diskon? (y/n): ");
                String diskonYaTidak = input.nextLine();

                if (diskonYaTidak.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan diskon (misal 0.1 untuk 10%): ");
                    double diskon = Double.parseDouble(input.nextLine());
                    ProdukDiskon pd = new ProdukDiskon(kode, nama, harga, diskon);
                    transaksi.tambahItem(pd);
                } else {
                    Produk p = new Produk(kode, nama, harga);
                    transaksi.tambahItem(p);
                }
            }

            System.out.println("\n=========================");
            transaksi.tampilkanTransaksi(); 

        } catch (NumberFormatException e) {
            System.out.println("Input angka tidak valid!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        input.close();
    }
}
