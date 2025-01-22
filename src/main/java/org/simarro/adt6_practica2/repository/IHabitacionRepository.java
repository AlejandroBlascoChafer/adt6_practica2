package org.simarro.adt6_practica2.repository;

import org.simarro.adt6_practica2.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabitacionRepository extends JpaRepository<Habitacion, Integer> {
}
