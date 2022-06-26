package model.matkul;

import model.presensi.Presensi;

import java.util.List;

public class MatkulAmbil {
    private Matkul matkul;
    private List<Presensi> presensi;
    private float nilai1;
    private float nilai2;
    private float nilai3;

    public MatkulAmbil(Matkul matkul, List<Presensi> presensi, float nilai1, float nilai2, float nilai3) {
        this.matkul = matkul;
        this.presensi = presensi;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    public List<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<Presensi> presensi) {
        this.presensi = presensi;
    }

    public float getNilai1() {
        return nilai1;
    }

    public void setNilai1(float nilai1) {
        this.nilai1 = nilai1;
    }

    public float getNilai2() {
        return nilai2;
    }

    public void setNilai2(float nilai2) {
        this.nilai2 = nilai2;
    }

    public float getNilai3() {
        return nilai3;
    }

    public void setNilai3(float nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil{" +
                "matkul=" + matkul +
                ", presensi=" + presensi +
                ", nilai1=" + nilai1 +
                ", nilai2=" + nilai2 +
                ", nilai3=" + nilai3 +
                "}\n";
    }
}
