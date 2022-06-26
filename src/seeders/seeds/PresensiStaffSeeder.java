package seeders.seeds;

import model.interfaces.Status;
import model.presensi.Presensi;
import model.presensi.PresensiStaff;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PresensiStaffSeeder{
    public List<PresensiStaff> generate(){
        // simpan data yang dibuat ke dalam array, tujuannya berapapun data yang dimasukkan
        // tidak perlu mengubah lagi di baris return
        PresensiStaff[] arrPresensiStaff = {
            new PresensiStaff(LocalDate.of(2022,6,20), Status.HADIR, LocalTime.of(8,0)),
            new PresensiStaff(LocalDate.of(2022,6,21), Status.ALPHA, LocalTime.of(8,20)),
            new PresensiStaff(LocalDate.of(2022,6,22), Status.HADIR, LocalTime.of(7,0))
        };

        // array yang dibuat langsung dikonversi ke tipe List dan di return
        return new ArrayList<>(Arrays.asList(arrPresensiStaff));
    }
}
