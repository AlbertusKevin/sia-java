package controller;

import model.matkul.MatkulAmbil;
import model.user.mahasiswa.Doktor;
import model.user.mahasiswa.Mahasiswa;
import model.user.mahasiswa.Sarjana;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NilaiController extends Controller{
    // untuk pemanggilan ke controller lain
    private MatkulController matkulController;

    // inisiasi controller di construct agar hanya satu kali saja dibuatnya
    public NilaiController(){
        this.matkulController = new MatkulController();
    }

    public float hitungNilaiAkhir(Mahasiswa mhs, MatkulAmbil matkulAmbil){
        if(mhs instanceof Sarjana){
            return (matkulAmbil.getNilai1() + matkulAmbil.getNilai2() + matkulAmbil.getNilai3()) / 3;
        }

        Doktor doktor = (Doktor)mhs;
        return (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3;
    }

    public float hitungRataRataNAMatkulDariSeluruhMhs(String kodeMk, List<Mahasiswa> daftarMhs){
        var nilaiAkhir = 0.0f;
        var totalNilaiAkhir = 0.0f;
        var totalMhsyangAmbil = 0;

        // cari matkul dengan kode MK yang diinput dari setiap daftar matkul ambil milik mhs
        for (var mhs : daftarMhs){
            if(mhs instanceof Sarjana){
                MatkulAmbil matkulAmbil = matkulController.cariMatkulMhs(kodeMk,((Sarjana)mhs).getMatkulAmbil());

                if(matkulAmbil != null){
                    nilaiAkhir = hitungNilaiAkhir(mhs,matkulAmbil);
                    totalNilaiAkhir += nilaiAkhir;
                    totalMhsyangAmbil++;
                }
            }
        }

        // hitung rata-rata nilai akhir dari kode mk tertentu
        return totalNilaiAkhir / totalMhsyangAmbil;
    }

    public Map<String, Integer> hitungTotalKelulusanSebuahMk(String kodeMk, List<Mahasiswa> daftarMhs){
        var nilaiAkhir = 0.0f;
        var totalTidakLulus = 0;
        var totalMhsyangAmbil = 0;

        for (var mhs : daftarMhs){
            if(mhs instanceof Sarjana){
                // cari matkul dengan kode MK yang diinput dari setiap daftar matkul ambil milik mhs
                MatkulAmbil matkulAmbil = matkulController.cariMatkulMhs(kodeMk,((Sarjana)mhs).getMatkulAmbil());

                if(matkulAmbil != null){
                    nilaiAkhir = hitungNilaiAkhir(mhs,matkulAmbil);
                    if(nilaiAkhir < 56){
                        totalTidakLulus++;
                    }
                    totalMhsyangAmbil++;
                }
            }
        }

        HashMap<String, Integer> data = new HashMap<>();
        data.put("totalAmbil",totalMhsyangAmbil);
        data.put("totalTidakLulus",totalTidakLulus);

        return data;
    }
}
