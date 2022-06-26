package model.user.staff;

import model.presensi.PresensiStaff;

import java.util.List;

public class Karyawan extends Staff{
    private double salary;
    private List<PresensiStaff> presensiStaff;

    public Karyawan(String nama, String alamat, String telepon, String ttl, String nik, double salary, List<PresensiStaff> presensiStaff) {
        super(nama, alamat, telepon, ttl, nik);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return super.toString()+". Karyawan{" +
                "salary=" + salary +
                ", presensiStaff=" + presensiStaff +
                "}";
    }
}
