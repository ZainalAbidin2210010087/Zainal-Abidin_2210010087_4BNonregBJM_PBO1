# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `public class DataPenjualanSendal` adalah contoh dari class.

```bash
public DataPenjualanSendal {
    ...
}

class SendalBrandLokal extends Sendal {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
mhs[i] = new MahasiswaDetail(nama, npm);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `Sendal` dan `SendalBrandLokal` adalah contoh atribut.

```bash
protected String merk;
protected int ukuran;
protected double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Mahasiswa(String nama, String npm) {
    this.nama = nama;
    this.npm = npm;
}

public MahasiswaDetail(String nama, String npm) {
    super(nama, npm);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `merk` dan `ukuran` adalah contoh method mutator.

```bash
public Sendal(String merk, int ukuran, double harga) {
    this.merk = merk;
    this.ukuran = ukuran;
    this.harga = harga;
}

public SendalBrandLokal(String merk, int ukuran, double harga, String jenisBrandLokal) {
    super(merk, ukuran, harga); // Memanggil konstruktor kelas induk (Sendal)
    this.SendalBrandLokal = jenisBrandLokal;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `Sendal` dan `SendalBrandLokal` adalah contoh method accessor.

```bash
public String getMerk() {
    return merk;
}

public int getUkuran() {
    return ukuran;
}

public double getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `SendalBrandLokal` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String SendalBrandLokal;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SendalBrandLokal` mewarisi `Sendal` dengan sintaks `extends`.

```bash
class SendalBrandLokal extends Sendal {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo` di `SendalBrandLokal` merupakan overloading method `displayInfo` dan `Sendal` di `SendalBrandLokal` merupakan override dari method `displayInfo` di `Sendal`.

```bash
public SendalBrandLokal(String merk, int ukuran, double harga, String jenisBrandLokal) {
        super(merk, ukuran, harga);
        this.SendalBrandLokal = jenisBrandLokal;
}

@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("Sendal ini di pakai untuk = " + SendalBrandLokal);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `DataPenjualanSendal`.

```bash
System.out.println("Apakah Sendal Ini Brand Lokal? (YA/TIDAK): ");
String jenisBrandLokal = input.next();

// Seleksi
if (jenisBrandLokal.equalsIgnoreCase("Ya")) {
    System.out.println("Jenis Brand lokal / Jenis Brand Import= ");
    jenisBrandLokal = input.next();

    // Membuat objek SendalBrandLokal
    daftarSendal[i] = new SendalBrandLokal(merk, ukuran, harga, jenisBrandLokal);
} else {
    // Membuat objek Sendal
    daftarSendal[i] = new Sendal(merk, ukuran, harga);
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarSendal.length; i++) {

}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `DataPenjualanSendal` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.println("Data Sendal " + (i + 1));
        System.out.println("Merk = ");
        String merk = input.next();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Sendal[] daftarSendal = new Sendal[2];` adalah contoh penggunaan array.

```bash
Sendal[] daftarSendal = new Sendal[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    System.out.println("Ukuran =");
    ukuran = input.nextInt();
    if (ukuran <= 10) {
        throw new IllegalArgumentException("Ukuran sendal harus lebih dari 0.");
    }
    ukuranValid = true;
} catch (InputMismatchException e) {
    System.out.println("Masukan Ukuran Sendal Dalam Bentuk Angka.");
    input.nextLine();
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
    input.nextLine();
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

Nama: Zainal Abidin
NPM: 2210010087
