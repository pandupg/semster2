/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohuklsemester2help;

/**
 *
 * @author Pandu Putrakelana G
 */
import java.util.ArrayList;

import java.util.Scanner;

public class PeminjamanBuku {

    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> Banyak = new ArrayList<Integer>();

    public PeminjamanBuku() {
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.Banyak.add(1);

        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.Banyak.add(2);

        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.Banyak.add(3);

        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.Banyak.add(4);

        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.Banyak.add(5);

    }

    public void prosesPeminjamanBuku(Siswa siswa, PeminjamanBuku Peminjaman, KoleksiBuku koleksibbuku) {
        Scanner scan = new Scanner(System.in);
        System.out.println("SEMANGAT LITERASI!<3");
        System.out.println("Masukkan ID Siswa");

        int idSiswa = scan.nextInt();
        System.out.println("Selamat Datang Di Website Resmi Perpustakaan SMK Telkom Malang " + siswa.getNama(idSiswa));
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        if (siswa.getStatus(idSiswa) == false) {
            System.out.println("Tidak Bisa Pinjam");
        } else {
            do {
                System.out.print("Masukkan Kode Buku : ");
                temp = scan.nextInt();
                if (temp != 99) {

                    idBuku.add(temp);
                    System.out.print(koleksibbuku.getNamaBuku(idBuku.get(i)) + " Sebanyak : ");
                    banyak.add(scan.nextInt());
                    i++;

                }
            } while (temp != 99);

            System.out.println("Transaksi Belanja " + siswa.getNama(idSiswa) + " Sebagai Berikut");
            System.out.println("Nama Barang \tQty \tHarga \tJumlah ");
            int total = 0;
            int x = idBuku.size();
            for (int j = 0; j < x; j++) {
                int jumlah = banyak.get(j) * koleksibbuku.getHargaBuku(idBuku.get(j));
                total += jumlah;

                System.out.println(koleksibbuku.getNamaBuku(idBuku.get(j)) + "\t"+ banyak.get(j) + "\t"+ koleksibbuku.getHargaBuku(idBuku.get(j)) + "\t"+ jumlah);
                Peminjaman.setPinjaman(koleksibbuku, idSiswa, idBuku.get(j), banyak.get(j));
            }

            System.out.println("Total Belanja : " + total);
            siswa.editStatus(idSiswa, false);
        }
    }

    public void setPinjaman(KoleksiBuku koleksibbuku, int idSiswa, int idBuku, int banyaknya) {

        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.Banyak.add(banyaknya);
        koleksibbuku.editStokBuku(idBuku, koleksibbuku.getStokBuku(idBuku) - banyaknya);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyaknyaBuku(int id) {
        return this.Banyak.get(id);
    }

    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    public int getJmlTransaksi() {
        return this.idSiswa.size();
    }

    public int getJmlPeminjaman() {
        return this.idSiswa.size();
    }

}
