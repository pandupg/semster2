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
public class LaporanPeminjaman {

    public void laporan(KoleksiBuku koleksibbuku) {
        int x = koleksibbuku.getJmlBuku();

        System.out.println();
        System.out.println("Tabel Barang");
        System.out.println();
        System.out.println("Judul Buku \t\tTerbitan Pertama \tPengarang \t\t\tBahasa \t\tPenerbit \t\t\t\t\tHalaman \t\tGenre  \t\t\t\tStok Buku \tHarga Buku");
        for (int i = 0; i < x; i++) {
            System.out.println(koleksibbuku.getNamaBuku(i) + "\t"+ "\t" + koleksibbuku.getTerbitanBuku(i) + "\t" +"\t"  +koleksibbuku.getNamaPengarang(i) + "\t" +"\t" + koleksibbuku.getBahasaBuku(i) + "\t" + koleksibbuku.getPenerbitBuku(i) + "\t" +"\t" + koleksibbuku.getJumlahHalaman(i) + "\t" +"\t" +koleksibbuku.getGenreBuku(i) + "\t" +"\t" +"\t" + koleksibbuku.getStokBuku(i) + "\t" + koleksibbuku.getHargaBuku(i));

        }

    }

    public void laporan(Siswa siswa) {
        int x = siswa.getJumlahsiswa();

        System.out.println();
        System.out.println("Tabel Siswa");
        System.out.println();
        System.out.println("Nama Siswa \tAlamat Siswa\t\tTelepon Siswa \tStatusSiswa");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i) + "\t"+ siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatus(i) );

        }

    }
    
    public void laporan(Petugas petugas) {
        int x = petugas.getJumlahPetugas();

        System.out.println();
        System.out.println("Tabel Petugas");
        System.out.println();
        System.out.println("Nama Petugas \tAlamat Petugas\tTelepon Petugas ");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t"+ petugas.getAlamat(i) + "\t" +"\t"+ petugas.getTelepon(i));

        }

    }

    public void laporan(PeminjamanBuku peminjaman, KoleksiBuku koleksibuku) {
        int x = peminjaman.getJmlPeminjaman();

        System.out.println();
        System.out.println("Laporan Pinjaman");
        System.out.println();
        System.out.println("Nama Barang \tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknyaBuku(i) * koleksibuku.getHargaBuku(peminjaman.getIdBuku(i));
            total += jumlah;
            System.out.println(koleksibuku.getNamaBuku(peminjaman.getIdBuku(i)) + "\t" + "\t" +peminjaman.getBanyaknyaBuku(i) + "\t" + koleksibuku.getHargaBuku(peminjaman.getIdBuku(i)) + "\t" + jumlah);
        }
        System.out.println("Total Profit : " + total);
    }
}
