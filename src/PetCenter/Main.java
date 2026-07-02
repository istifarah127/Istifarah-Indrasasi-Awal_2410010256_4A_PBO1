package PetCenter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Hewan[] data = new Hewan[100];

        data[0] = new Hotel("Milo", 2, 10);

        data[1] = new Grooming("Bruno", 3, "Premium");

        data[2] = new Hotel("Kitty", 1, 5);

        int jumlah = 3;

        int menu;

        do {

            System.out.println("\n======================================");
            System.out.println("   PET HOTEL & GROOMING CENTER");
            System.out.println("======================================");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Tampilkan Tagihan");
            System.out.println("4. Cari Hewan");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");

            try {

                menu = input.nextInt();
                input.nextLine();

                switch (menu) {

                    case 1:

                        System.out.print("Nama Hewan : ");
                        String nama = input.nextLine();

                        System.out.print("Umur Hewan : ");
                        int umur = input.nextInt();
                        input.nextLine();

                        System.out.println("\nJenis Layanan");
                        System.out.println("1. Pet Hotel");
                        System.out.println("2. Grooming");
                        System.out.print("Pilih : ");
                        int layanan = input.nextInt();
                        input.nextLine();

                        if (layanan == 1) {

                            System.out.print("Lama Inap (Hari) : ");
                            int lamaInap = input.nextInt();
                            input.nextLine();

                            data[jumlah] = new Hotel(
                                    nama,
                                    umur,
                                    lamaInap);

                        } else if (layanan == 2) {

                            System.out.print("Paket (Basic/Premium) : ");
                            String paket = input.nextLine();

                            data[jumlah] = new Grooming(
                                    nama,
                                    umur,
                                    paket);
                        }

                        jumlah++;

                        System.out.println("\nData berhasil ditambahkan.");

                        break;

                    case 2:

                        System.out.println("\n======================================");
                        System.out.println("         DATA PELANGGAN");
                        System.out.println("======================================");

                        for (int i = 0; i < jumlah; i++) {

                            System.out.println("Data Ke-" + (i + 1));

                            System.out.println("Nama : "
                                    + data[i].getNama());

                            System.out.println("Umur : "
                                    + data[i].getUmur()
                                    + " Tahun");

                            if (data[i] instanceof Hotel) {

                                Hotel h = (Hotel) data[i];

                                System.out.println("Layanan : Pet Hotel");

                                System.out.println("Lama Inap : "
                                        + h.getLamaInap()
                                        + " Hari");

                            } else if (data[i] instanceof Grooming) {

                                Grooming g =
                                        (Grooming) data[i];

                                System.out.println("Layanan : Grooming");

                                System.out.println("Paket : "
                                        + g.getPaket());

                            }

                            System.out.println("--------------------------------------");
                        }

                        break;

                    case 3:

                        double totalPendapatan = 0;

                        System.out.println("\n======================================");
                        System.out.println("             TAGIHAN");
                        System.out.println("======================================");

                        for (int i = 0; i < jumlah; i++) {

                            System.out.println("Nama : "
                                    + data[i].getNama());

                            double biaya =
                                    data[i].hitungBiaya();

                            System.out.println("Total : Rp "
                                    + biaya);

                            totalPendapatan += biaya;

                            System.out.println("--------------------------------------");

                        }

                        System.out.println("TOTAL PENDAPATAN");

                        System.out.println("Rp "
                                + totalPendapatan);

                        break;

                    case 4:

                        System.out.print("Masukkan Nama Hewan : ");

                        String cari = input.nextLine();

                        boolean ditemukan = false;

                        for (int i = 0; i < jumlah; i++) {

                            if (data[i].getNama()
                                    .equalsIgnoreCase(cari)) {

                                System.out.println("\nDATA DITEMUKAN");

                                System.out.println("Nama : "
                                        + data[i].getNama());

                                System.out.println("Umur : "
                                        + data[i].getUmur()
                                        + " Tahun");

                                if (data[i] instanceof Hotel) {

                                    Hotel h = (Hotel) data[i];

                                    System.out.println("Layanan : Pet Hotel");

                                    System.out.println("Lama Inap : "
                                            + h.getLamaInap()
                                            + " Hari");

                                } else {

                                    Grooming g =
                                            (Grooming) data[i];

                                    System.out.println("Layanan : Grooming");

                                    System.out.println("Paket : "
                                            + g.getPaket());

                                }

                                ditemukan = true;

                            }

                        }

                        if (!ditemukan) {

                            System.out.println("\nData tidak ditemukan.");

                        }

                        break;

                    case 5:

                        System.out.println("\nTerima kasih.");

                        break;

                    default:

                        System.out.println("\nMenu tidak tersedia.");

                }

            }

            catch (Exception e) {

                System.out.println("\nERROR!");
                System.out.println("Input harus berupa angka.");

                input.nextLine();

                menu = 0;

            }

        } while (menu != 5);

        input.close();

    }

}

