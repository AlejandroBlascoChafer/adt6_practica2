package org.simarro.adt6_practica2.model;

import jakarta.persistence.*;

@Entity
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer tamanio;

    @Column
    private Double precioXnoche;

    @Column
    private Boolean desayuno;

    @Column
    private Boolean ocupada;

    public Habitacion(){}

    public Habitacion(Integer id, Integer tamanio, Double precioXnoche, Boolean desayuno, Boolean ocupada) {
        this.id = id;
        this.tamanio = tamanio;
        this.precioXnoche = precioXnoche;
        this.desayuno = desayuno;
        this.ocupada = ocupada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Double getPrecioXnoche() {
        return precioXnoche;
    }

    public void setPrecioXnoche(Double precioXnoche) {
        this.precioXnoche = precioXnoche;
    }

    public Boolean getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(Boolean desayuno) {
        this.desayuno = desayuno;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }
}
