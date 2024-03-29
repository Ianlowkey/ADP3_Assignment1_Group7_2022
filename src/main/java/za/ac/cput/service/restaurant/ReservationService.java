/*
ReservationService.java
This is reservation service class.
Author: Felecia Zweni(218330189)
Date: August 2022
 */

package za.ac.cput.service.restaurant;

import za.ac.cput.domain.restaurant.Reservation;
import za.ac.cput.service.IService;

import java.util.List;

public interface ReservationService extends IService<Reservation, String> {

    List<Reservation> getAll(String name);
    void deleteById(String name);

    Reservation save(Reservation reservation);
}
