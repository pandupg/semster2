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
public class aplikasipeminjamanbuku {

    public static void main(String[] args) {
        Siswa S = new Siswa();
        KoleksiBuku K = new KoleksiBuku();
        Petugas P = new Petugas();
        PeminjamanBuku B = new PeminjamanBuku();
        LaporanPeminjaman L = new LaporanPeminjaman();
        L.laporan(K);
        L.laporan(S);
        L.laporan(P);
        L.laporan(B, K);
        B.prosesPeminjamanBuku(S, B, K);
        L.laporan(B, K);
        L.laporan(K);
        L.laporan(S);
        L.laporan(P);

    }
}
