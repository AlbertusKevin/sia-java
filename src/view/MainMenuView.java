package view;

public class MainMenuView {
    public String showMainMenu(){
        return new InputView().inputForm(this.title()+
                this.menu()+
                this.question());
    }

    public String title(){
        return "=====================\n" +
                "\tMain Menu SIA\n" +
                "=====================\n";
    }

    public String menu(){
        return  "1. Print User Data\n" +
                "2. Print Nilai Akhir Matkul Tertentu dari Seorang Mahasiswa\n" +
                "3. Hitung Rata-rata Nilai Akhir seluruh Mahasiswa dengan MK tertentu\n" +
                "4. Hitung jumlah kelulusan dari MK tertentu\n" +
                "5. Print presensi setiap matkul dari mahasiswa tertentu\n" +
                "6. Hitung total jam dosen mengajar\n" +
                "7. Hitung gaji staff tertentu\n" +
                "0. Exit\n";
    }

    public String question(){
        return "=====================\n"+
                "Pilih menu berdasarkan nomor:";
    }
}
