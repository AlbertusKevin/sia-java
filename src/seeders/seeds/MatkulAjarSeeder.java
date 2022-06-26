package seeders.seeds;

//import controller.data.MainDataSeeder;
import model.matkul.Matkul;
import model.matkul.MatkulAjar;
import model.matkul.MatkulAmbil;
import model.presensi.Presensi;
import model.presensi.PresensiStaff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatkulAjarSeeder{
    public List<MatkulAjar> generate(List<Matkul> daftarMatkul, List<PresensiStaff> daftarPresensiStaff) {
        // ambil data yang dibutuhkan untuk instansiasi matkul ajar
//        List<Matkul> daftarMatkul = new MatkulSeeder().generate();
//        List<PresensiStaff> daftarPresensiStaff = new PresensiStaffSeeder().generate();

        // simpan data yang dibuat ke dalam array, tujuannya berapapun data yang dimasukkan
        // tidak perlu mengubah lagi di baris return
        MatkulAjar[] arrayMatkulAjar = {
            new MatkulAjar(daftarMatkul.get(1),daftarPresensiStaff),
            new MatkulAjar(daftarMatkul.get(3), daftarPresensiStaff),
            new MatkulAjar(daftarMatkul.get(5), daftarPresensiStaff)
        };

        // array yang dibuat langsung dikonversi ke tipe List dan di return
        return new ArrayList<>(Arrays.asList(arrayMatkulAjar));
    }
}
