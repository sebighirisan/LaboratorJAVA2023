package Model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private int IdRestaurant;
    private String nume;
    private String fel;
    private float rating;

    private List<Produs> listaproduse;



    public Restaurant(int idRestaurant, String nume, String fel, float rating) {
        IdRestaurant = idRestaurant;
        this.nume = nume;
        this.fel = fel;
        this.rating = rating;
        this.listaproduse = new ArrayList<Produs>();
        for (Produs p : listaproduse){
            p = new Produs(); // compozitia
        }

    }

    public int getIdRestaurant() {
        return IdRestaurant;
    }

    public void setIdRestaurant(int idRestaurant) {
        IdRestaurant = idRestaurant;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFel() {
        return fel;
    }

    public void setFel(String fel) {
        this.fel = fel;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        String produse="";
        for(Produs produs : listaproduse){
            produse+=produs.toString()+" ";
        }
        return "Restaurant{" +
                "IdRestaurant=" + IdRestaurant +
                ", nume='" + nume + '\'' +
                ", fel='" + fel + '\'' +
                ", rating=" + rating +
                ", listaproduse=" + listaproduse +
                '}';
    }
}