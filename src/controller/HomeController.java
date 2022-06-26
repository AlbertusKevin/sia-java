package controller;

import model.interfaces.Status;
import model.matkul.MatkulAjar;
import model.matkul.MatkulAmbil;
import model.user.mahasiswa.Doktor;
import model.user.mahasiswa.Mahasiswa;
import model.user.mahasiswa.Sarjana;
import model.user.staff.*;

import java.util.List;

// extends ke controller, tujuannya karena data dummy dan beberapa view akan digunakan berulang
// oleh beberapa controller, tidak perlu inisialisasi ulang di setiap controller yang digunakan
public class HomeController extends Controller{
    // untuk pemanggilan ke controller lain
    private UserController userController;
    private MatkulController matkulController;
    private NilaiController nilaiController;

    // inisiasi controller di construct agar hanya satu kali saja dibuatnya
    public HomeController(){
        this.userController = new UserController();
        this.matkulController = new MatkulController();
        this.nilaiController = new NilaiController();
    }

    // logika menu utama ketika pemilihan menu
    public void showMainMenu(){
        // var di java, sama seperti inisialiasi variable biasa, tapi harus langsung diikuti isi dari datanya
        // baris dibawah setara dengan
        // boolean exit;
        // exit = false;
        var exit = false;
        while(!exit) {
            try {
                String value = super.mainMenu.showMainMenu();

                // jika tombol cancel di dialog box ditekan
                if(value == null){
                    break;
                }

                // parsing input ke int
                int choice = Integer.parseInt(value);
                switch (choice){
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        menu1();
                        break;
                    // Beberapa fungsi di nomor 2 3 4 5 6 dan 7,
                    // bisa dijadikan fungsi tersendiri sehingga lebih reusable untuk antar nomor-nomor itu.
                    // Ciri-cirinya, jika ada baris logika yang mirip atau sama persis. Di contoh ini, belum dipisahkan
                    // Misal nomor 3 dan 4, terlihat mirip urutan logikanya
                    case 2:
                        menu2();
                        break;
                    case 3:
                        menu3();
                        break;
                    case 4:
                        menu4();
                        break;
                    case 5:
                        menu5();
                        break;
                    case 6:
                        menu6();
                        break;
                    case 7:
                        menu7();
                        break;
                    default:
                        // jika input angka diluar yang disediakan menu
                        super.messageDialog.showMessageDialog("Input angka diluar pilihan");
                        break;
                }
            } catch (Exception e) {
                // exception dimaksudkan untuk kesalahan parseInt dari input yang tidak bisa di parse (misal alphabet)
                // tapi exception ini agak berbahaya, karena class yang digunakan adalah Exception, class umum dari semua
                // exception di Java, sehingga jika ada error apapun, akan masuk ke baris ini
                messageDialog.showMessageDialog("Input hanya berupa angka");
                System.out.println(e.getStackTrace());
            }
        }
    }

    private void menu1(){
        String nama = super.inputView.inputForm("Masukkan nama:");
        userController.printUserData(nama);
    }

    private void menu2(){
        String nim = super.inputView.inputForm("Masukkan nim:");

        Mahasiswa mhs = userController.cariMahasiswa(nim);
        if(mhs == null){
            messageDialog.showMessageDialog("Mahasiswa tidak ditemukan");
        }else{
            if(mhs instanceof Sarjana){
                String kodeMk = super.inputView.inputForm("Masukkan kode mata kuliah:");
                MatkulAmbil matkulAmbil = matkulController.cariMatkulMhs(kodeMk, ((Sarjana) mhs).getMatkulAmbil());

                if(matkulAmbil == null){
                    messageDialog.showMessageDialog("Tidak ada mata kuliah dengan kode "+kodeMk+" yang diambil");
                }else{
                    messageDialog.showMessageDialog("Rata-rata nilai "+mhs.getClass().getSimpleName()+" "+mhs.getNama()+": \n"+nilaiController.hitungNilaiAkhir(mhs,matkulAmbil));
                }
            }else if(mhs instanceof Doktor){
                messageDialog.showMessageDialog("Rata-rata nilai Doktor "+mhs.getNama()+": \n"+nilaiController.hitungNilaiAkhir(mhs,null));
            }
        }
    }

    private void menu3(){
        List<Mahasiswa> daftarMhs = this.dummyDatabase.getListMhs();
        String kodeMk = this.inputView.inputForm("Masukkan kode MK: ");

        this.messageDialog.showMessageDialog(
                "Rata-rata matkul dengan kode: "+kodeMk+"\n"+
                "Rata-rata nilai akhir: "+nilaiController.hitungRataRataNAMatkulDariSeluruhMhs(kodeMk,daftarMhs)+"\n"
        );
    }

    private void menu4(){
        List<Mahasiswa> daftarMhs = this.dummyDatabase.getListMhs();
        String kodeMk = this.inputView.inputForm("Masukkan kode MK: ");

        this.messageDialog.showMessageDialog(
                "Matkul dengan kode: "+kodeMk+"\n"+

                "Total mhs yang ambil: "+ nilaiController.hitungTotalKelulusanSebuahMk(
                        kodeMk,daftarMhs
                ).get("totalAmbil")+"\n"+

                "Total yang tidak lulus: "+nilaiController.hitungTotalKelulusanSebuahMk(
                        kodeMk,daftarMhs
                ).get("totalTidakLulus")+"\n"
        );
    }

    private void menu5(){
        String nim = super.inputView.inputForm("Masukkan nim:");
        Mahasiswa mhs = userController.cariMahasiswa(nim);

        if(mhs == null){
            messageDialog.showMessageDialog("Mahasiswa tidak ditemukan");
        }else{
            if(mhs instanceof Sarjana){
                List<MatkulAmbil> daftarMatkulAmbil = ((Sarjana) mhs).getMatkulAmbil();
                String message = "";

                if(daftarMatkulAmbil == null){
                    messageDialog.showMessageDialog("Mahasiswa "+mhs.getNama()+" tidak mengambil matkul apapun");
                }else{
                    for(var matkul : daftarMatkulAmbil){
                        message += "Matakuliah "+matkul.getMatkul().getNama()+"\n";
                        for(var presensi : matkul.getPresensi()){
                            message += presensi.toString();
                        }
                        message += "\n";
                    }
                    messageDialog.showMessageDialog(message);
                }
            }else if(mhs instanceof Doktor){
                messageDialog.showMessageDialog("Doktor tidak memiliki daftar matkul ambil");
            }
        }
    }

    private void menu6(){
        String nik = super.inputView.inputForm("Masukkan nik:");
        Dosen dosen = userController.cariDosen(nik);

        if(dosen == null){
            messageDialog.showMessageDialog("Dosen tidak ditemukan");
        }else{
            // ambil daftar matkul ajar dosen tertentu
            List<MatkulAjar> daftarMatkulAjar = dosen.getMatkulAjar();
            if(daftarMatkulAjar == null){
                messageDialog.showMessageDialog("Dosen ini tidak mengajar apapun.");
            }else{
                // message untuk rangkai tampilan pesan di view
                String message = "";
                var totalJamAjarSeluruhMatkul = 0;

                // looping setiap matkulAjar dari daftarMatkulAjar
                for (var matkulAjar : daftarMatkulAjar){
                    // perangkaian pesan info matkul dan jumlah sks
                    message += "Mata kuliah "+matkulAjar.getMatkul().getNama()+"\n"
                            +"Jumlah SKS: "+matkulAjar.getMatkul().getSKS()+"\n";

                    var totalHadir = 0;
                    var totalAlpha = 0;
                    var totalPresensi = 0;
                    var totalJamNgajar = 0;

                    // hitung total hadir, total alpha, dan total jam ajar dari setiap matkul
                    // hitung juga total dosen mengajar dari seluruh matkul
                    for(var presensi : matkulAjar.getPresensiStaff()){
                        if(presensi.getStatus() == Status.HADIR){
                            totalHadir++;
                            totalJamNgajar += (matkulAjar.getMatkul().getSKS());
                            totalJamAjarSeluruhMatkul += (matkulAjar.getMatkul().getSKS());
                        }
                        if(presensi.getStatus() == Status.ALPHA){
                            totalAlpha++;
                        }

                        totalPresensi++;
                    }

                    // rangkai pesan
                    message += "Total hadir: "+totalHadir+"\n"
                        + "Total alpha: "+totalAlpha+"\n"
                        + "Total presensi: "+totalPresensi+"\n"
                        + "Total jam mengajar: "+totalJamNgajar+"\n\n";

                }

                // rangkai pesan
                message += "\nTotal Keseluruhan Jam Ajar: "+totalJamAjarSeluruhMatkul;

                // tampilkan pesan
                messageDialog.showMessageDialog(message);
            }
        }
    }

    private void menu7(){
        String nik = super.inputView.inputForm("Masukkan nik:");
        Staff staff = userController.cariStaff(nik);

        if(staff == null){
            messageDialog.showMessageDialog("Staff tidak ditemukan");
        }else{
            var gajiAkhir = 0.0;
            var unit = 0;

            if(staff instanceof Karyawan){
                Karyawan karyawan = (Karyawan) staff;
                for(var presensi : karyawan.getPresensiStaff()){
                    if(presensi.getStatus() == Status.HADIR){
                        unit++;
                    }
                }

                gajiAkhir = (double)unit / 22 * karyawan.getSalary();
            }else{
                Dosen dosen = (Dosen) staff;
                for(var matkulAjar : dosen.getMatkulAjar()){
                    for(var presensi : matkulAjar.getPresensiStaff()){
                        if(presensi.getStatus() == Status.HADIR){
                            unit++;
                        }
                    }
                }

                if(dosen instanceof DosenTetap){
                    gajiAkhir = ((DosenTetap) dosen).getSalary() + (unit * 250000);
                }else{
                    gajiAkhir = unit * ((DosenHonorer)dosen).getHonorPerSKS();
                }
            }

            messageDialog.showMessageDialog("Gaji staff dengan nik "+nik+": "+String.format("%.2f", gajiAkhir));
        }
    }
}
