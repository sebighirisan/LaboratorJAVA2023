package Repository;

import Model.Produs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProdusRepo {
    private static final List<Produs> listaproduse = new ArrayList<>();
    private static int nextProdusId = 1;
    public static Produs createProdus(String denumire, float pret, String ingrediente){
        Produs produs = new Produs(nextProdusId, denumire, pret, ingrediente);
        listaproduse.add(produs);
        nextProdusId++;
        return produs;
    }

    public static Produs getProdusById(int id){
        for (Produs produs : listaproduse){
            if (produs.getIdProdus() == id)
                return produs;
        }
        return null;
    }

    public static List<Produs> getAllProduse(){
        return listaproduse;
    }

    public Produs updateProdus(Produs produs){

        for (Produs p : listaproduse){
            if (p.getIdProdus() == produs.getIdProdus()){
                p.setDenumire(produs.getDenumire());
                p.setPret(produs.getPret());
                p.setIngrediente(produs.getIngrediente());
            }
        }
        return produs;
    }

    public void removeProdus(int id){
        Produs produsToRemove = getProdusById(id);
        if (produsToRemove != null)
            listaproduse.remove(produsToRemove);
    }
}
