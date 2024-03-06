package com.example.demo.Modelo;
public class Pokemon {

    private String tipo;
    private String nombre;
    private String genero;

    public Pokemon(String tipo, String nombre, String genero) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}
