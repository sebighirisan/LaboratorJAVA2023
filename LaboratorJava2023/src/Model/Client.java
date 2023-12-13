package Model;

public class Client extends Persoana{

    private int IdClient;
    private String nume;
    private int varsta;
    private int IdAdresa;

    public Client(int idClient, String nume, int varsta, int idAdresa) {
        IdClient = idClient;
        this.nume = nume;
        this.varsta = varsta;
        IdAdresa = idAdresa;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getIdAdresa() {
        return IdAdresa;
    }

    public void setIdAdresa(int idAdresa) {
        IdAdresa = idAdresa;
    }

    @Override
    public String toString() {
        return "Client{" +
                "IdClient=" + IdClient +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", IdAdresa=" + IdAdresa +
                '}';
    }
}
