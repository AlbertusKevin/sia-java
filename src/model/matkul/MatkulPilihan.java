package model.matkul;

public class MatkulPilihan extends Matkul{
    private int minMhs;

    public MatkulPilihan(String kode, String nama, int SKS, int minMhs) {
        super(kode, nama, SKS);
        this.minMhs = minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }

    @Override
    public String toString() {
        return super.toString()+". MatkulPilihan{" +
                "minMhs=" + minMhs +
                "}";
    }
}
