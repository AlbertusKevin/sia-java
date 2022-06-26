package model.user.mahasiswa;

import model.matkul.MatkulAmbil;

import java.util.List;

public class Magister extends Sarjana{
    private String judulTesis;

    public Magister(String nama, String alamat, String telepon, String ttl, String nim, String jurusan, List<MatkulAmbil> matkulAmbil, String judulTesis) {
        super(nama, alamat, telepon, ttl, nim, jurusan, matkulAmbil);
        this.judulTesis = judulTesis;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString()+". Magister{" +
                "judulTesis='" + judulTesis + '\'' +
                '}';
    }
}
