package model.matkul;

public class Matkul {
    private String kode;
    private String nama;
    private int SKS;

    public Matkul(String kode, String nama, int SKS) {
        this.kode = kode;
        this.nama = nama;
        this.SKS = SKS;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    @Override
    public String toString() {
        return "Matkul{" +
                "kode='" + kode + '\'' +
                ", nama='" + nama + '\'' +
                ", SKS=" + SKS +
                "}\n";
    }
}
