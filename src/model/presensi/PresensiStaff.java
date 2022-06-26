package model.presensi;

import java.time.LocalDate;
import java.time.LocalTime;

public class PresensiStaff extends Presensi{
    private LocalTime jam;

    public PresensiStaff(LocalDate tanggal, int status, LocalTime jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }

    public LocalTime getJam() {
        return jam;
    }

    @Override
    public String toString() {
        return super.toString()+"PresensiStaff{" +
                "jam=" + jam +
                "}";
    }
}
