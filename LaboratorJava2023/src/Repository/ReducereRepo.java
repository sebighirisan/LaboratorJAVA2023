package Repository;

import Model.Reducere;


import java.util.ArrayList;
import java.util.List;

public class ReducereRepo {
    private static final List<Reducere> reduceri = new ArrayList<>();
    private static int nextId = 1;
    public static Reducere createReducere(String cupon, int valabilitate, int idRestaurant){
        Reducere reducere = new Reducere(nextId, cupon, valabilitate, idRestaurant);
        reduceri.add(reducere);
        nextId++;
        return reducere;
    }

    public Reducere getReducereById(int id){
        for (Reducere reducere : reduceri){
            if (reducere.getIdRestaurant() == id)
                return reducere;
        }
        return null;
    }

    public static List<Reducere> getAllReduceri(){
        return reduceri;
    }

    public Reducere updateReducere(Reducere reducere){

        for (Reducere red : reduceri){
            if (red.getIdReducere() == reducere.getIdReducere()){
                red.setCupon(reducere.getCupon());
                red.setValabilitate(reducere.getValabilitate());

            }
        }
        return reducere;
    }

    public void removeReducere(int id){
        Reducere redToRemove = getReducereById(id);
        if (redToRemove != null)
            reduceri.remove(redToRemove);
    }
}
