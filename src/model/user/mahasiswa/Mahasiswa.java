package model.user.mahasiswa;

import model.user.User;

public abstract class Mahasiswa extends User {
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String telepon, String ttl, String nim, String jurusan) {
        super(nama, alamat, telepon, ttl);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString()+" Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", jurusan='" + jurusan + '\'' +
                "}\n";
    }
}
