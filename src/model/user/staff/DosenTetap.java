package model.user.staff;

import model.matkul.MatkulAjar;

import java.util.List;

public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(String nama, String alamat, String telepon, String ttl, String nik, String departemen, List<MatkulAjar> matkulAjar, double salary) {
        super(nama, alamat, telepon, ttl, nik, departemen, matkulAjar);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+". DosenTetap{" +
                "salary=" + salary +
                "}";
    }
}
