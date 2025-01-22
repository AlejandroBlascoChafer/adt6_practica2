package org.simarro.adt6_practica2.controller;

import org.simarro.adt6_practica2.model.Habitacion;
import org.simarro.adt6_practica2.model.Hotel;
import org.simarro.adt6_practica2.service.IHabitacionService;
import org.simarro.adt6_practica2.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    @Autowired
    private IHabitacionService service;

    @PostMapping
    public Habitacion registrar(@RequestBody Habitacion habitacion){
        return service.registrar(habitacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id_habitacion){
        service.eliminar(id_habitacion);
    }

    @PutMapping
    public void modificarOcupacion(Habitacion habitacion){
        service.modificarOcupacion(habitacion);
    }

}
