package model.user.staff;

import model.matkul.MatkulAjar;

import java.util.List;

public abstract class Dosen extends Staff{
    private String departemen;
    private List<MatkulAjar> matkulAjar;

    public Dosen(String nama, String alamat, String telepon, String ttl, String nik, String departemen, List<MatkulAjar> matkulAjar) {
        super(nama, alamat, telepon, ttl, nik);
        this.departemen = departemen;
        this.matkulAjar = matkulAjar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public List<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(List<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    @Override
    public String toString() {
        return super.toString()+". Dosen{" +
                "departemen='" + departemen + '\'' +
                ", matkulAjar=" + matkulAjar +
                "}";
    }
}
