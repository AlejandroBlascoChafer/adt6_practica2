package org.simarro.adt6_practica2.repository;

import org.simarro.adt6_practica2.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Integer> {

}
