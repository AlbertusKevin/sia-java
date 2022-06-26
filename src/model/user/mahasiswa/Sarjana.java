package model.user.mahasiswa;

import model.matkul.MatkulAmbil;

import java.util.List;

public class Sarjana extends Mahasiswa{
    private List<MatkulAmbil> matkulAmbil;

    public Sarjana(String nama, String alamat, String telepon, String ttl, String nim, String jurusan, List<MatkulAmbil> matkulAmbil) {
        super(nama, alamat, telepon, ttl, nim, jurusan);
        this.matkulAmbil = matkulAmbil;
    }

    public List<MatkulAmbil> getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(List<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    @Override
    public String toString() {
        return super.toString() + ". Sarjana{" +
                "matkulAmbil=" + matkulAmbil +
                '}';
    }
}
