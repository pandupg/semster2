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
public class Siswa implements user {

    public int getJumlahsiswa() {
        return this.Statussiswa.size();
    }
    private ArrayList<String> Namasiswa = new ArrayList<String>();
    private ArrayList<String> Alamatsiswa = new ArrayList<String>();
    private ArrayList<String> Teleponsiswa = new ArrayList<String>();
    private ArrayList<Boolean> Statussiswa = new ArrayList<Boolean>();

    public Siswa() {
        this.Namasiswa.add("Gizella");
        this.Alamatsiswa.add("Kediri");
        this.Teleponsiswa.add("             0858479092113        ");
        this.Statussiswa.add(true);

        this.Namasiswa.add("Lia");
        this.Alamatsiswa.add("Sulawesi Selatan");
        this.Teleponsiswa.add("085879902113");
        this.Statussiswa.add(true);

        this.Namasiswa.add("Rehan");
        this.Alamatsiswa.add("Bogor");
        this.Teleponsiswa.add("             0858443216113        ");
        this.Statussiswa.add(true);

        this.Namasiswa.add("Diva");
        this.Alamatsiswa.add("Lampung");
        this.Teleponsiswa.add("             085847909913         ");
        this.Statussiswa.add(true);

        this.Namasiswa.add("Mareta");
        this.Alamatsiswa.add("Jember");
        this.Teleponsiswa.add("             085847862113         ");
        this.Statussiswa.add(true);

    }

    @Override
    public void setNama(String namasiswa) {
        this.Namasiswa.add(namasiswa);
    }

    @Override
    public void setAlamat(String alamat) {
        this.Alamatsiswa.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.Teleponsiswa.add(telepon);
    }

    @Override
    public String getNama(int idsiswa) {
        return this.Namasiswa.get(idsiswa);
    }

    @Override
    public String getTelepon(int idsiswa) {
        return this.Teleponsiswa.get(idsiswa);
    }

    @Override
    public String getAlamat(int idsiswa) {
        return this.Alamatsiswa.get(idsiswa);
    }

    void editStatus(int idSiswa, boolean Status) {
        this.Statussiswa.set(idSiswa, Status);
    }

    Boolean getStatus(int idsiswa) {
        return this.Statussiswa.get(idsiswa);
    }

}
