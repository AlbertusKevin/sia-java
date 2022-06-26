package seeders.seeds;

import model.matkul.Matkul;
import model.matkul.MatkulAjar;
import model.matkul.MatkulPilihan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatkulSeeder {
    public List<Matkul> generate(){
        // simpan data yang dibuat ke dalam array, tujuannya berapapun data yang dimasukkan
        // tidak perlu mengubah lagi di baris return
        Matkul[] arrMatkul = {
                new Matkul("IF-301","PBO",3),
                new Matkul("IF-401","PBP",3),
                new Matkul("IF-402","RPL",3),
                new Matkul("IF-201","Pemrograman Web",3),
                new Matkul("IF-102","Web Design",3),
                new Matkul("IF-202","Struktur Data",4),
                new MatkulPilihan("IF-601","PBBO",3,20),
                new MatkulPilihan("IF-701","Deep Learning",3,15)
        };

        // array yang dibuat langsung dikonversi ke tipe List dan di return
        return new ArrayList<>(Arrays.asList(arrMatkul));
    }
}
