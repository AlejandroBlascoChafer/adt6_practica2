package org.simarro.adt6_practica2.service;

import org.simarro.adt6_practica2.model.Habitacion;
import org.simarro.adt6_practica2.repository.IHabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitacionServiceImpl implements IHabitacionService{

    @Autowired
    private IHabitacionRepository repo;

    @Override
    public Habitacion registrar(Habitacion habitacion) {
        return repo.save(habitacion);
    }

    @Override
    public void eliminar(Integer id_habitacion) {
        repo.deleteById(id_habitacion);
    }

    @Override
    public void modificarOcupacion(Habitacion habitacion) {
        habitacion.setOcupada(true);
        repo.save(habitacion);
    }
}
