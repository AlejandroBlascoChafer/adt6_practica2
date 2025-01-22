package org.simarro.adt6_practica2.controller;

import org.simarro.adt6_practica2.model.Hotel;
import org.simarro.adt6_practica2.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

    @Autowired
    private IHotelService service;

    @PostMapping
    public Hotel registrar(@RequestBody Hotel hotel){
        return service.registrar(hotel);
    }

    @GetMapping
    public List<Hotel> listar(){
        return service.listar();
    }


}
