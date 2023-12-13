package Model;

import java.time.LocalDate;

public class Livrator extends Persoana{
     private int IdLivrator;
     private String nume;
     private String prenume;
     private LocalDate data_nasterii;
     private String vehicul;

    public Livrator(int IdLivrator, String nume, String prenume, LocalDate data_nasterii, String vehicul) {
        super(IdLivrator, nume, prenume);
        this.IdLivrator = IdLivrator;
        this.nume = nume;
        this.prenume = prenume;
        this.data_nasterii = data_nasterii;
        this.vehicul = vehicul;
    }

    public int getIdLivrator() {
        return IdLivrator;
    }

    public void setIdLivrator(int idLivrator) {
        IdLivrator = idLivrator;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String getPrenume() {
        return prenume;
    }

    @Override
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public LocalDate getData_nasterii() {
        return data_nasterii;
    }

    public void setData_nasterii(LocalDate data_nasterii) {
        this.data_nasterii = data_nasterii;
    }

    public String getVehicul() {
        return vehicul;
    }

    public void setVehicul(String vehicul) {
        this.vehicul = vehicul;
    }

    @Override
    public String toString() {
        return "Livrator{" +
                "IdLivrator=" + IdLivrator +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", data_nasterii='" + data_nasterii + '\'' +
                ", vehicul='" + vehicul + '\'' +
                '}';
    }
}
