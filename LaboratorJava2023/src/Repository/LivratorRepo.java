package Repository;

import Model.Livrator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LivratorRepo {
    private final List<Livrator> livratori = new ArrayList<>();
    private int nextIdLivrator = 1;
    public Livrator createLivrator(String nume, String prenume, LocalDate dataNasterii,String vehicul){
        Livrator livrator = new Livrator(nextIdLivrator, nume, prenume, dataNasterii,vehicul);
        if (livrator.getData_nasterii().isAfter(LocalDate.now()))
            throw new IllegalArgumentException();

        livratori.add(livrator);
        nextIdLivrator++;
        return livrator;
    }

    public Livrator getLivratorById(int id){
        if (id < 0)
            throw new IllegalArgumentException();

        for (Livrator livrator : livratori){
            if (livrator.getIdLivrator() == id)
                return livrator;
        }
        return null;
    }

    public List<Livrator> getAllLivratori(){
        return this.livratori;
    }

    public Livrator updateLivrator(Livrator livrator){
        for (Livrator l : livratori){
            if (l.getIdLivrator() == livrator.getIdLivrator()){
                l.setIdLivrator(livrator.getIdLivrator());
                l.setNume(livrator.getNume());
                l.setPrenume(livrator.getPrenume());
                l.setData_nasterii(livrator.getData_nasterii());
                l.setVehicul(livrator.getVehicul());
            }
        }
        return livrator;
    }

    public void removeLivrator(int id){
        Livrator livratorToRemove = getLivratorById(id);
        if (livratorToRemove != null)
            livratori.remove(livratorToRemove);
    }
}
