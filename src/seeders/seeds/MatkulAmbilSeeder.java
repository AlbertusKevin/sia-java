package seeders.seeds;

import model.matkul.Matkul;
import model.matkul.MatkulAmbil;
import model.presensi.Presensi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatkulAmbilSeeder{

    public List<MatkulAmbil> generate(List<Matkul> daftarMatkul, List<Presensi> daftarPresensi) {
        // simpan data yang dibuat ke dalam array, tujuannya berapapun data yang dimasukkan
        // tidak perlu mengubah lagi di baris return
        MatkulAmbil[] arrayMatkulAmbil = {
            new MatkulAmbil(daftarMatkul.get(0),daftarPresensi,50.00f,50.00f,50.00f),
            new MatkulAmbil(daftarMatkul.get(2), daftarPresensi,75.00f,75.00f,75.00f),
            new MatkulAmbil(daftarMatkul.get(4), daftarPresensi,100.00f,100.00f,100.00f)
        };

        // array yang dibuat langsung dikonversi ke tipe List dan di return
        return new ArrayList<>(Arrays.asList(arrayMatkulAmbil));
    }

    public List<MatkulAmbil> generate2(List<Matkul> daftarMatkul, List<Presensi> daftarPresensi) {
        // simpan data yang dibuat ke dalam array, tujuannya berapapun data yang dimasukkan
        // tidak perlu mengubah lagi di baris return
        MatkulAmbil[] arrayMatkulAmbil = {
                new MatkulAmbil(daftarMatkul.get(0),daftarPresensi,80.00f,80.00f,80.00f),
                new MatkulAmbil(daftarMatkul.get(2), daftarPresensi,75.00f,75.00f,75.00f),
                new MatkulAmbil(daftarMatkul.get(4), daftarPresensi,100.00f,100.00f,100.00f)
        };

        // array yang dibuat langsung dikonversi ke tipe List dan di return
        return new ArrayList<>(Arrays.asList(arrayMatkulAmbil));
    }
}
