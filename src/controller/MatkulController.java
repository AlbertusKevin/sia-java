package controller;
import model.matkul.MatkulAmbil;

import java.util.List;

public class MatkulController extends Controller{
    public MatkulAmbil cariMatkulMhs(String kodeMk, List<MatkulAmbil> listMatkulAmbil){
        MatkulAmbil matkulAmbil = null;
        var found = false;
        var index = 0;

        while(!found && index != listMatkulAmbil.size()){
            System.out.println(index);

            if(kodeMk.toLowerCase().equals(listMatkulAmbil.get(index).getMatkul().getKode().toLowerCase())){
                found = true;
                matkulAmbil = listMatkulAmbil.get(index);
            }

            index++;
        }

        return matkulAmbil;
    }
}
