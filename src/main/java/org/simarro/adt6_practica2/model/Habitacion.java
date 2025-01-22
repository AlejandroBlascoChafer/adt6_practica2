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

    @ManyToOne
    @JoinColumn(name = "id_hotel")
    private Hotel hotel;

    public Habitacion(){}

    public Habitacion(Integer id, Integer tamanio, Double precioXnoche, Boolean desayuno, Boolean ocupada, Hotel hotel) {
        this.id = id;
        this.tamanio = tamanio;
        this.precioXnoche = precioXnoche;
        this.desayuno = desayuno;
        this.ocupada = ocupada;
        this.hotel = hotel;
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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
