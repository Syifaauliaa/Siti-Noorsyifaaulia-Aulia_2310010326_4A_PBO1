# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh aplikasi kasir sederhana menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna memasukkan daftar produk, baik yang mendapatkan diskon maupun tidak, lalu akan menampilkan total belanjaan dan rincian pembelian.

Program ini mengimplementasikan berbagai konsep penting dalam pemrograman berorientasi objek (OOP) seperti:
Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, ArrayList, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** dari class.adala h blueprint dari object. Pada program ini terdapat 4 class:

```bash
public class Produk {
    ...
}

public class ProdukDiskon extends Produk {
    ...
}

public class Transakasi {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. 

```bash
Transaksi transakasi = new Transaksi();

Produk p = new Produk(...);

ProdukDiskon pd = new ProdukDiskon(...);
```

3. **Atribut** adalah variabel yang ada dalam class.

```bash
private String kode;
private String nama;
private double harga;
```

4. **Constructor** adalah method yang dijalankan saat objek dibuat
```bash
public Produk(String kode, String nama, double harga) {
    this.kode = kode;
    this.nama = nama;
    this.harga = harga;
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut.

```bash
public void setHarga(double harga) {
    this.harga = harga;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. 
```bash
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. 

```bash
private String kode;
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain.

```bash
public class ProdukDiskon extends Produk {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda.

```bash
@Override
public double getHarga() {
    return super.getHarga() * (1 - diskon);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi.

```bash
if (diskonYaTidak.equalslgnoreCase("y")){
    ...
} else {
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali.

```bash
for (int i = 0; i < jumlah; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. 

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nama Produk: ");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel.
```bash
private ArrayList<Produk>daftarItem = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. 

```bash
try {
    ...
} catch (NumberFormatException e) {
    System.out.println("Input angka tidak valid!");
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Siti Noorsyifa Aulia
NPM: 2310010326
