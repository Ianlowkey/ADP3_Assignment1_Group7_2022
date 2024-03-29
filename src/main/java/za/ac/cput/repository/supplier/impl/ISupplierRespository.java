package za.ac.cput.repository.supplier.impl;

/*
Author: Bongisa Mpahleni (216205999)
Date: 02 April 2022
*/

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

@Repository
public interface ISupplierRespository extends JpaRepository<Supplier, Integer> {
    public Set<Supplier> getAll();
}
