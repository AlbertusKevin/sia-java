package model.user.staff;

import model.matkul.MatkulAjar;

import java.util.List;

public class DosenHonorer extends Dosen{
    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String telepon, String ttl, String nik, String departemen, List<MatkulAjar> matkulAjar, double honorPerSKS) {
        super(nama, alamat, telepon, ttl, nik, departemen, matkulAjar);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString()+" DosenHonorer{" +
                "honorPerSKS=" + honorPerSKS +
                "}";
    }
}
