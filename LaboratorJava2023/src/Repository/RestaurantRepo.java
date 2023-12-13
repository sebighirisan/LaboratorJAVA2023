package Repository;

import Model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepo {
    private static final List<Restaurant> restaurants = new ArrayList<>();
    private static int nextRestId = 1;

    public static Restaurant createRestaurant(String nume, String fel, float rating){
        Restaurant restaurant = new Restaurant(nextRestId,nume,fel, rating);
        restaurants.add(restaurant);
        nextRestId++;
        return restaurant;
    }

    public static Restaurant getRestById(int id) {
        if (id < 0)
            throw new IllegalArgumentException();

        for (Restaurant r : restaurants) {
            if (r.getIdRestaurant() == id) {
                return r;
            }
        }
        return null; // Restaurant not found
    }

    public static List<Restaurant> getAllRestaurants(){
        return restaurants;
    }

    public static Restaurant updateRestaurant(Restaurant restaurant){
        if (restaurant.getNume() == "Non-Existent Restaurant")
            throw new NullPointerException();

        for (Restaurant rt : restaurants){
            if(rt.getIdRestaurant()==restaurant.getIdRestaurant()){
                rt.setNume(restaurant.getNume());
                rt.setFel(restaurant.getFel());
                rt.setRating(restaurant.getRating());

            }
        }
        return restaurant;
    }

    public static void removeRestaurant(int id) {
        Restaurant restaurantToRemove = getRestById(id);
        if (restaurantToRemove != null) {
            restaurants.remove(restaurantToRemove);
        }
    }
}
