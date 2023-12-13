package Model;

public class Reducere {

    private int IdReducere;
    private String cupon;
    private int valabilitate;
     private int IdRestaurant;

    public Reducere(int idReducere, String cupon, int valabilitate, int idRestaurant) {
        IdReducere = idReducere;
        this.cupon = cupon;
        this.valabilitate = valabilitate;
        IdRestaurant = idRestaurant;
    }

    public int getIdReducere() {
        return IdReducere;
    }

    public void setIdReducere(int idReducere) {
        IdReducere = idReducere;
    }

    public String getCupon() {
        return cupon;
    }

    public void setCupon(String cupon) {
        this.cupon = cupon;
    }

    public int getValabilitate() {
        return valabilitate;
    }

    public void setValabilitate(int valabilitate) {
        this.valabilitate = valabilitate;
    }

    public int getIdRestaurant() {
        return IdRestaurant;
    }

    public void setIdRestaurant(int idRestaurant) {
        IdRestaurant = idRestaurant;
    }

    @Override
    public String toString() {
        return "Reducere{" +
                "IdReducere=" + IdReducere +
                ", cupon='" + cupon + '\'' +
                ", valabilitate=" + valabilitate +
                ", IdRestaurant=" + IdRestaurant +
                '}';
    }
}
