package Model;

public class Comanda {

    private int IdComanda;
    private String specificatii;
    private int IdClient;
    private int IdLivrator;

    private int IdRestaurant;

    public Comanda(int idComanda, String specificatii, int idClient, int idLivrator, int idRestaurant) {
        IdComanda = idComanda;
        this.specificatii = specificatii;
        IdClient = idClient;
        IdLivrator = idLivrator;
        IdRestaurant = idRestaurant;
    }

    public int getIdComanda() {
        return IdComanda;
    }

    public void setIdComanda(int idComanda) {
        IdComanda = idComanda;
    }

    public String getSpecificatii() {
        return specificatii;
    }

    public void setSpecificatii(String specificatii) {
        this.specificatii = specificatii;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
    }

    public int getIdLivrator() {
        return IdLivrator;
    }

    public void setIdLivrator(int idLivrator) {
        IdLivrator = idLivrator;
    }

    public int getIdRestaurant() {
        return IdRestaurant;
    }

    public void setIdRestaurant(int idRestaurant) {
        IdRestaurant = idRestaurant;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "IdComanda=" + IdComanda +
                ", specificatii='" + specificatii + '\'' +
                ", IdClient=" + IdClient +
                ", IdLivrator=" + IdLivrator +
                ", IdRestaurant=" + IdRestaurant +
                '}';
    }
}
