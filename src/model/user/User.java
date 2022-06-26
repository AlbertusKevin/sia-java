package model.user;

import model.user.mahasiswa.Mahasiswa;

public abstract class User{
    private String nama;
    private String alamat;
    private String telepon;
    private String ttl;

    public boolean login(User user){
        if(user instanceof Mahasiswa){
            // do login logic
        }

        return false;
    }

    public User(String nama, String alamat, String telepon, String ttl) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.ttl = ttl;
    }

    @Override
    public String toString() {
        return "User{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", telepon='" + telepon + '\'' +
                ", ttl='" + ttl + '\'' +
                "}\n";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}
