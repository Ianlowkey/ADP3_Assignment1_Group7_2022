package za.ac.cput.repository.lookup.impl;

/* IOrderRepository.java
   This is an Order repository interface
   @Author: Lihle Njobe(21819388)
   Due date: 07 August 2022
 */

import za.ac.cput.domain.lookup.Order;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IOrderRepository extends IRepository<Order, Integer> {
    public Set<Order> getAll();
}