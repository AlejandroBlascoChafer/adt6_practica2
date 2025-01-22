package org.simarro.adt6_practica2.service;

import org.simarro.adt6_practica2.model.Hotel;
import org.simarro.adt6_practica2.repository.IHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelServiceImpl implements IHotelService{

    @Autowired
    private IHotelRepository repo;


    @Override
    public Hotel registrar(Hotel hotel) {
        return repo.save(hotel);
    }

    @Override
    public List<Hotel> listar() {
        return repo.findAll();
    }
}
