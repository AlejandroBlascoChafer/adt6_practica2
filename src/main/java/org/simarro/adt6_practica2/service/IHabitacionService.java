package org.simarro.adt6_practica2.service;

import org.simarro.adt6_practica2.model.Habitacion;
import org.simarro.adt6_practica2.model.Hotel;

import java.util.List;

public interface IHabitacionService {
    Habitacion registrar(Habitacion habitacion);
    void eliminar(Integer id_hotel);
    void modificarOcupacion(Habitacion habitacion);
}
