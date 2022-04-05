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
public class Petugas implements user {

    private ArrayList<String> NamaPetugas = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();

    public Petugas() {
        this.NamaPetugas.add("Noval Akbar");
        this.Alamat.add("             Blitar");
        this.Telepon.add("08765906432");

        this.NamaPetugas.add("Aisya Alfina");
        this.Alamat.add("             Jember");
        this.Telepon.add("085854555577");

        this.NamaPetugas.add("Hikamul Wafa");
        this.Alamat.add("Kediri");
        this.Telepon.add("081234789002");

    }

    @Override
    public void setNama(String nama) {
        this.NamaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.Alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.Telepon.add(telepon);
    }

    @Override
    public String getNama(int idpetugas) {
        return this.NamaPetugas.get(idpetugas);
    }

    @Override
    public String getTelepon(int idpetugas) {
        return this.Telepon.get(idpetugas);
    }

    @Override
    public String getAlamat(int idpetugas) {
        return this.Alamat.get(idpetugas);
    }
    public int getJumlahPetugas(){
        return this.NamaPetugas.size();
    }
}
