# 🐾 PetCenter - Pet Hotel & Grooming Center

Aplikasi **PetCenter** merupakan program sederhana berbasis **Java** yang menerapkan konsep **Object-Oriented Programming (OOP)**. Program ini mensimulasikan layanan **Pet Hotel** dan **Pet Grooming** dengan menu interaktif menggunakan console.

---

## 📖 Deskripsi

PetCenter memungkinkan pengguna untuk:

- Menambahkan data pelanggan.
- Menampilkan seluruh data pelanggan.
- Menghitung biaya layanan.
- Mencari data hewan berdasarkan nama.
- Menampilkan total pendapatan dari seluruh layanan.

Program dibuat sebagai implementasi materi dasar **Pemrograman Berorientasi Objek (PBO)**.

---

## 🚀 Fitur

- ✅ Tambah pelanggan
- ✅ Menampilkan data pelanggan
- ✅ Menghitung tagihan layanan
- ✅ Pencarian data hewan
- ✅ Total pendapatan
- ✅ Penanganan error input

---

## 📂 Struktur Project

```
PetCenter/
│── Main.java
│── Hewan.java
│── Hotel.java
└── Grooming.java
```

---

# 📚 Implementasi Materi

| No | Materi | Implementasi |
|----|--------|--------------|
| 1 | Class | Menggunakan class `Hewan`, `Hotel`, `Grooming`, dan `Main`. |
| 2 | Object | Membuat objek seperti `new Hotel(...)` dan `new Grooming(...)`. |
| 3 | Attribute | Class `Hewan` memiliki atribut `nama` dan `umur`, sedangkan `Hotel` memiliki `lamaInap` dan `Grooming` memiliki `paket`. |
| 4 | Constructor | Constructor digunakan untuk menginisialisasi objek melalui `super()` maupun constructor masing-masing class. |
| 5 | Mutator | Method `setNama()` dan `setUmur()` digunakan sebagai setter. |
| 6 | Accessor | Method `getNama()`, `getUmur()`, `getLamaInap()`, dan `getPaket()` digunakan sebagai getter. |
| 7 | Encapsulation | Seluruh atribut dibuat `private` dan hanya dapat diakses melalui getter dan setter. |
| 8 | Inheritance | Class `Hotel` dan `Grooming` mewarisi class `Hewan` menggunakan `extends`. |
| 9 | Polymorphism | Method `hitungBiaya()` dioverride pada class `Hotel` dan `Grooming`. |
| 10 | Seleksi | Menggunakan `if`, `else if`, `else`, dan `switch-case`. |
| 11 | Perulangan | Menggunakan `for` untuk menampilkan dan mencari data serta `do-while` untuk menu utama. |
| 12 | IO Sederhana | Menggunakan `Scanner` sebagai input dan `System.out.println()` sebagai output. |
| 13 | Array | Menyimpan data pelanggan dalam array `Hewan[] data = new Hewan[100];`. |
| 14 | Error Handling | Menggunakan `try-catch` untuk menangani kesalahan input angka. |

---

# 🧩 Konsep OOP

### Class Induk

`Hewan`

Berisi informasi dasar seluruh hewan:

- Nama
- Umur
- Method `hitungBiaya()`

---

### Class Turunan

#### 🏨 Hotel

Mewarisi class `Hewan`.

Atribut tambahan:

- Lama Inap

Perhitungan biaya:

- Rp50.000/hari
- Diskon 10% jika menginap lebih dari 7 hari.

---

#### ✂️ Grooming

Mewarisi class `Hewan`.

Atribut tambahan:

- Paket Grooming

Biaya:

| Paket | Harga |
|-------|-------:|
| Basic | Rp75.000 |
| Premium | Rp150.000 |
| Lainnya | Rp100.000 |

---

# 📋 Menu Program

```
======================================
   PET HOTEL & GROOMING CENTER
======================================
1. Tambah Pelanggan
2. Tampilkan Data
3. Tampilkan Tagihan
4. Cari Hewan
5. Keluar
```

---

## ▶️ Cara Menjalankan

### Compile

```bash
javac PetCenter/*.java
```

### Jalankan

```bash
java PetCenter.Main
```

---

# 💻 Contoh Data Awal

Program telah menyediakan beberapa data default:

| Nama | Umur | Layanan |
|------|------:|----------|
| Milo | 2 Tahun | Hotel (10 hari) |
| Bruno | 3 Tahun | Grooming Premium |
| Kitty | 1 Tahun | Hotel (5 hari) |

---

# 📌 Perhitungan Biaya

### Hotel

```
Biaya = Lama Inap × Rp50.000
```

Jika lebih dari 7 hari:

```
Diskon 10%
```

---

### Grooming

| Paket | Biaya |
|-------|-------:|
| Basic | Rp75.000 |
| Premium | Rp150.000 |
| Selain itu | Rp100.000 |

---

# ⚠️ Error Handling

Program menggunakan `try-catch` untuk menghindari kesalahan input.

Contoh:

```
ERROR!
Input harus berupa angka.
```

---

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


# 👨‍💻 Author

Nama : Istifarah Indrasasi Awal
NPM : 2410010256
Kelas : 4A TI Nonreg BJM
Mata Kuliah: Pemrograman Berorientasi Objek (PBO) 1
Project:PetCenter - Pet Hotel & Grooming Center
