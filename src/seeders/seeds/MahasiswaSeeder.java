package seeders.seeds;

//import controller.data.MainDataSeeder;
import model.matkul.MatkulAmbil;
import model.user.mahasiswa.Doktor;
import model.user.mahasiswa.Magister;
import model.user.mahasiswa.Mahasiswa;
import model.user.mahasiswa.Sarjana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MahasiswaSeeder {
    public List<Mahasiswa> generate(List<MatkulAmbil> listMatkulAmbil){
        // untuk pengujian nomor 4
        var listMatkulAmbil2 = (new MatkulAmbilSeeder()).generate2(new MatkulSeeder().generate(),(new PresensiSeeder()).generate());

        Mahasiswa[] arrMhs = {
            new Sarjana("sherlock","Baker Street 221B", "123456789", "Bandung, 17 Agustus 1945", "1122098","IF",listMatkulAmbil),
            new Magister("watson","Baker Street 221B", "987654321", "Bandung, 17 Agustus 1945", "1123008","IF",listMatkulAmbil2, "Judul Tesis"),
            new Doktor("moriarty","London", "555444", "Bandung, 30 April 1943", "1523028","TI", "Judul Disertasi", 90.00f,90.00f,95.00f)
        };

        return new ArrayList<>(Arrays.asList(arrMhs));
    }
}
