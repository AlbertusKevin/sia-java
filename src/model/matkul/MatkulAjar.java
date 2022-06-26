package model.matkul;

import model.presensi.PresensiStaff;

import java.util.List;

public class MatkulAjar{
    private Matkul matkul;
    private List<PresensiStaff> presensiStaff;

    public MatkulAjar(Matkul matkul, List<PresensiStaff> presensiStaff) {
        this.matkul = matkul;
        this.presensiStaff = presensiStaff;
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return "MatkulAjar{" +
                "matkul=" + matkul +
                ", presensiStaff=" + presensiStaff +
                "}\n";
    }
}
