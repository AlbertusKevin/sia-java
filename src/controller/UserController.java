package controller;

import model.user.User;
import model.user.mahasiswa.Mahasiswa;
import model.user.mahasiswa.Sarjana;
import model.user.staff.Dosen;
import model.user.staff.Staff;

import java.util.ArrayList;
import java.util.List;


public class UserController extends Controller{
    public void printUserData(String nama){
        User user = cariUser(nama);
        if(user == null){
            super.messageDialog.showMessageDialog("User tidak ditemukan");
        }else{
            super.messageDialog.showMessageDialog("Nama: "+user.getNama()+"\nStatus: "+user.getClass().getSimpleName());
        }
    }

    public User cariUser(String nama){
        List<User> users = new ArrayList<>();
        users.addAll(this.dummyDatabase.getListMhs());
        users.addAll(this.dummyDatabase.getListStaff());

        User user = null;
        var found = false;
        var index = 0;

        while(!found && index != users.size()){
            System.out.println(index);

            if(nama.toLowerCase().equals(users.get(index).getNama().toLowerCase())){
                found = true;
                user = users.get(index);
            }

            index++;
        }

        return user;
    }

    public Mahasiswa cariMahasiswa(String nim){
        List<Mahasiswa> listMhs = this.dummyDatabase.getListMhs();

        Mahasiswa mahasiswa = null;
        var found = false;
        var index = 0;

        while(!found && index != listMhs.size()){
            if(nim.toLowerCase().equals(listMhs.get(index).getNim().toLowerCase())){
                found = true;
                mahasiswa = listMhs.get(index);
            }

            index++;
        }

        return mahasiswa;
    }

    public Dosen cariDosen(String nik){
        List<Staff> listStaff = this.dummyDatabase.getListStaff();
        List<Dosen> listDosen = this.sortirDosen(listStaff);

        Dosen dosen = null;
        var found = false;
        var index = 0;

        while(!found && index != listDosen.size()){
            if(nik.toLowerCase().equals(listDosen.get(index).getNik().toLowerCase())){
                found = true;
                dosen = listDosen.get(index);
            }

            index++;
        }

        return dosen;
    }

    public Staff cariStaff(String nik){
        List<Staff> listStaff = this.dummyDatabase.getListStaff();

        Staff staff = null;
        var found = false;
        var index = 0;

        while(!found && index != listStaff.size()){
            if(nik.toLowerCase().equals(listStaff.get(index).getNik().toLowerCase())){
                found = true;
                staff = listStaff.get(index);
            }

            index++;
        }

        return staff;
    }

    public List<Dosen> sortirDosen(List<Staff> daftarStaff){
        List<Dosen> daftarDosen = new ArrayList<>();

        for(var dosen : daftarStaff){
            if(dosen instanceof Dosen){
                daftarDosen.add((Dosen) dosen);
            }
        }

        return daftarDosen;
    }
}
