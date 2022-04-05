/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohuklsemester2help;

import java.util.ArrayList;

/**
 *
 * @author Pandu Putrakelana G
 */
public class KoleksiBuku {

    private ArrayList<String> JudulBuku = new ArrayList<String>();
    private ArrayList<Integer> TerbitanPertama = new ArrayList<Integer>();
    private ArrayList<String> Pengarang = new ArrayList<String>();
    private ArrayList<String> Bahasa = new ArrayList<String>();
    private ArrayList<String> Penerbit = new ArrayList<String>();
    private ArrayList<String> Halaman = new ArrayList<String>();
    private ArrayList<String> Genre = new ArrayList<String>();
    private ArrayList<Integer> StokBuku = new ArrayList<Integer>();
    private ArrayList<Integer> HargaBuku = new ArrayList<Integer>();

    public KoleksiBuku() {
        this.JudulBuku.add("LaskarPelangi");
        this.TerbitanPertama.add(2005);
        this.Pengarang.add("Andrea Hirata");
        this.Bahasa.add("Indonesia      ");
        this.Penerbit.add("Bentang Pustaka (Yogyakarta)         ");
        this.Halaman.add("529 halaman");
        this.Genre.add("Roman       ");
        this.StokBuku.add(3);
        this.HargaBuku.add(55000);

        this.JudulBuku.add("HabibieAinun");
        this.TerbitanPertama.add(2010);
        this.Pengarang.add(" B.J.Habibie  ");
        this.Bahasa.add("Indonesia      ");
        this.Penerbit.add("PT THC Mandiri (Jakarta)             ");
        this.Halaman.add("321 halaman");
        this.Genre.add("Novel           ");
        this.StokBuku.add(2);
        this.HargaBuku.add(40000);

        this.JudulBuku.add("Sapiens");
        this.TerbitanPertama.add(2011);
        this.Pengarang.add("Yuval Noah Harari");
        this.Bahasa.add("Ibrani, Inggris, Hindi");
        this.Penerbit.add("Dvir Publishing House Ltd.(Israel);Harper");
        this.Halaman.add("443 halaman");
        this.Genre.add("Non-fiksi       ");
        this.StokBuku.add(1);
        this.HargaBuku.add(190000);

        this.JudulBuku.add("CCaseClosed");
        this.TerbitanPertama.add(1998);
        this.Pengarang.add("Gosho Aoyama");
        this.Bahasa.add("Indonesia      ");
        this.Penerbit.add("Elex Media Komputindo                ");
        this.Halaman.add("210 halaman");
        this.Genre.add("Komik,Fiksi,Novel grafik");
        this.StokBuku.add(3);
        this.HargaBuku.add(50000);

    }

    public void setNamaBuku(String namaBarang) {
        this.JudulBuku.add(namaBarang);
    }

    public String getNamaBuku(int idBuku) {
        return this.JudulBuku.get(idBuku);
    }

    public void setTerbitanBuku(int TerbitanPertama) {
        this.TerbitanPertama.add(TerbitanPertama);
    }

    public int getTerbitanBuku(int idBuku) {
        return this.TerbitanPertama.get(idBuku);

    }

    public void setNamaPengarang(String namapengarang) {
        this.Pengarang.add(namapengarang);
    }

    public String getNamaPengarang(int idBuku) {
        return this.Pengarang.get(idBuku);
    }

    public void setBahasaBuku(String idBuku) {
        this.Bahasa.add(idBuku);
    }

    public String getBahasaBuku(int idBuku) {
        return this.Bahasa.get(idBuku);

    }

    public void setJumlahHalaman(String Halaman) {
        this.Halaman.add(Halaman);

    }

    public void setPenerbitBuku(String idBuku) {
        this.Penerbit.add(idBuku);
    }

    public String getPenerbitBuku(int idBuku) {
        return this.Penerbit.get(idBuku);

    }

    public String getJumlahHalaman(int idBuku) {
        return this.Halaman.get(idBuku);
    }

    public void setGenreBuku(String GenreBuku) {
        this.Genre.add(GenreBuku);
    }

    public String getGenreBuku(int idBuku) {
        return this.Genre.get(idBuku);

    }

    public void setStokBuku(int stok) {
        this.StokBuku.add(stok);
    }

    public int getStokBuku(int idBuku) {
        return this.StokBuku.get(idBuku);
    }

    public void editStokBuku(int idBuku, int stok) {
        this.StokBuku.set(idBuku, stok);
    }

    public void setHargaBuku(int hargabuku) {
        this.HargaBuku.add(hargabuku);
    }

    public int getHargaBuku(int idBarang) {
        return this.HargaBuku.get(idBarang);
    }

    int getJmlBuku() {
        return this.Penerbit.size();
    }

}
