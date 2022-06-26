package seeders;

import model.matkul.Matkul;
import model.matkul.MatkulAjar;
import model.matkul.MatkulAmbil;
import model.presensi.Presensi;
import model.presensi.PresensiStaff;
import model.user.mahasiswa.Mahasiswa;
import model.user.staff.Staff;
import seeders.seeds.*;

import java.util.List;

public class MainData {
    private List<Presensi> listPresensi;
    private List<PresensiStaff> listPresensiStaff;
    private List<Matkul> listMatkul;
    private List<MatkulAmbil> listMatkulAmbil;
    private List<MatkulAjar> listMatkulAjar;
    private List<Mahasiswa> listMhs;
    private List<Staff> listStaff;

    public MainData(){
        this.setListMatkul();
        this.setListPresensi();
        this.setListPresensiStaff();
        this.setListMatkulAjar();
        this.setListMatkulAmbil();
        this.setListMhs();
        this.setListStaff();
    }

    public List<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi() {
        this.listPresensi = (new PresensiSeeder()).generate();
    }

    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff() {
        this.listPresensiStaff = (new PresensiStaffSeeder()).generate();
    }

    public List<Matkul> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul() {
        this.listMatkul = (new MatkulSeeder()).generate();
    }

    public List<MatkulAmbil> getListMatkulAmbil() {
        return listMatkulAmbil;
    }

    public void setListMatkulAmbil() {
        this.listMatkulAmbil = (new MatkulAmbilSeeder()).generate(this.listMatkul, this.listPresensi);
    }

    public List<MatkulAjar> getListMatkulAjar() {
        return listMatkulAjar;
    }

    public void setListMatkulAjar() {
        this.listMatkulAjar = (new MatkulAjarSeeder()).generate(this.listMatkul, this.listPresensiStaff);
    }

    public List<Mahasiswa> getListMhs() {
        return listMhs;
    }

    public void setListMhs() {
        this.listMhs = (new MahasiswaSeeder()).generate(this.listMatkulAmbil);
    }

    public List<Staff> getListStaff() {
        return listStaff;
    }

    public void setListStaff() {
        this.listStaff = new StaffSeeder().generate(this.listMatkulAjar, this.listPresensiStaff);
    }
}
