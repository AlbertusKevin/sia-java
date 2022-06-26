package seeders.seeds;

import model.interfaces.Status;
import model.matkul.Matkul;
import model.matkul.MatkulPilihan;
import model.presensi.Presensi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PresensiSeeder{
    public List<Presensi> generate(){
        // simpan data yang dibuat ke dalam array, tujuannya berapapun data yang dimasukkan
        // tidak perlu mengubah lagi di baris return
        Presensi[] arrMatkul = {
                new Presensi(LocalDate.of(2022,6,20), Status.ALPHA),
                new Presensi(LocalDate.of(2022,6,21), Status.HADIR),
                new Presensi(LocalDate.of(2022,6,22), Status.HADIR),
                new Presensi(LocalDate.of(2022,6,27), Status.HADIR),
                new Presensi(LocalDate.of(2022,6,28), Status.ALPHA),
                new Presensi(LocalDate.of(2022,6,29), Status.HADIR)
        };

        // array yang dibuat langsung dikonversi ke tipe List dan di return
        return new ArrayList<>(Arrays.asList(arrMatkul));
    }
}
