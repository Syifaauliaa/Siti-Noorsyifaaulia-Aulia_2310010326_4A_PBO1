public class ProdukDiskon extends Produk {
    private double diskon;

    public ProdukDiskon(String kode, String nama, double harga, double diskon) {
        super(kode, nama, harga);
        this.diskon = diskon;
    }

    @Override
    public double getHarga() {
        return super.getHarga() * (1 - diskon);
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Harga Setelah Diskon: " + getHarga());
    }
}
