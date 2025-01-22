package org.simarro.adt6_practica2.service;

import org.simarro.adt6_practica2.model.Hotel;

import java.util.List;

public interface IHotelService {
    Hotel registrar(Hotel hotel);
    List<Hotel> listar();
}
