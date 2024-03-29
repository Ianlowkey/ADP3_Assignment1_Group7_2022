/*
    RestaurantService.java
    Interface for Restaurant Service
    Student: Ian Louw
    Student Number: 216250773
 */

package za.ac.cput.service.restaurant;

import za.ac.cput.domain.restaurant.Restaurant;
import za.ac.cput.service.IService;

import java.util.List;

public interface RestaurantService extends IService<Restaurant, String> {

    List<Restaurant> getAll(String name );
    void deleteById(String name);
}
