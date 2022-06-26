package seeders.seeds;

import model.matkul.MatkulAjar;
import model.presensi.PresensiStaff;
import model.user.mahasiswa.Sarjana;
import model.user.staff.DosenHonorer;
import model.user.staff.DosenTetap;
import model.user.staff.Karyawan;
import model.user.staff.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaffSeeder {
    public List<Staff> generate(List<MatkulAjar> listMatkulAjar, List<PresensiStaff> listPresensiStaff){
        Staff[] arrStaff = {
            new DosenTetap("dosen tetap 1","Alamat DT 1", "telepon DT 1", "TTL Dosen tetap 1", "nik dosen tetap 1","IF",listMatkulAjar,12000000),
            new DosenHonorer("dosen honorer 1","Alamat DH 1", "telepon DH 1", "TTL Dosen honorer 1", "nik dosen honorer 1","IF",listMatkulAjar,250000),
            new Karyawan("karyawan 1","Alamat karyawan 1", "telepon karyawan 1", "TTL karyawan 1", "nik karyawan 1",4000000,listPresensiStaff)
        };

        return new ArrayList<>(Arrays.asList(arrStaff));
    }
}
