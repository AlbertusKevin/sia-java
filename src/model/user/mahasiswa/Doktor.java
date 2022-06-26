package model.user.mahasiswa;

public class Doktor extends Mahasiswa{
    private String judulDisertasi;
    private float nilaiSidang1;
    private float nilaiSidang2;
    private float nilaiSidang3;

    public Doktor(String nama, String alamat, String telepon, String ttl, String nim, String jurusan, String judulDisertasi, float nilaiSidang1, float nilaiSidang2, float nilaiSidang3) {
        super(nama, alamat, telepon, ttl, nim, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public float getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(float nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public float getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(float nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public float getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(float nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString()+". Doktor{" +
                "judulDisertasi='" + judulDisertasi + '\'' +
                ", nilaiSidang1=" + nilaiSidang1 +
                ", nilaiSidang2=" + nilaiSidang2 +
                ", nilaiSidang3=" + nilaiSidang3 +
                '}';
    }
}
