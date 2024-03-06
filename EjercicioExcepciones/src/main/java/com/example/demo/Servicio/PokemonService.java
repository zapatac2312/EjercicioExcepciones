package com.example.demo.Servicio;
import com.example.demo.Modelo.Pokemon;
import com.example.demo.exceptions.InvalidPokemonException;
import com.example.demo.exceptions.NullOrEmptyPokemonException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {

    private List<Pokemon> pokedex = new ArrayList<>();

    public PokemonService(List<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public List<Pokemon> getPokedex(){
       return this.pokedex.stream().toList();
    }

    public String atraparPokemon(Pokemon pokemon){

        if (pokemon.getNombre().equals("Perro") || pokemon.getNombre().equals("Gato")){
            throw new InvalidPokemonException("Eso no es un pokemon xd");
        }
        if (pokemon.getNombre().equals("") || pokemon.getNombre() == null){
            throw new NullOrEmptyPokemonException("El pokemon no existe o el nombre es nulo");
        }
            this.pokedex.add(pokemon);
            return "Se atrapó el pokemon " + pokemon;
    }

    public String liberarPokemon(String nombre){
        this.pokedex.removeIf(pokemon -> pokemon.getNombre().equals(nombre));
        return "sé libre "+ nombre;
    }



}
