package Model;

public class Adresa {

    private int IdAdresa;
    private String nume;
    private int numar;
    private String localiate;

    public Adresa(int idAdresa, String nume, int numar, String localiate) {
        IdAdresa = idAdresa;
        this.nume = nume;
        this.numar = numar;
        this.localiate = localiate;
    }

    public int getIdAdresa() {
        return IdAdresa;
    }

    public void setIdAdresa(int idAdresa) {
        IdAdresa = idAdresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getLocaliate() {
        return localiate;
    }

    public void setLocaliate(String localiate) {
        this.localiate = localiate;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "IdAdresa=" + IdAdresa +
                ", nume='" + nume + '\'' +
                ", numar=" + numar +
                ", localiate='" + localiate + '\'' +
                '}';
    }
}
