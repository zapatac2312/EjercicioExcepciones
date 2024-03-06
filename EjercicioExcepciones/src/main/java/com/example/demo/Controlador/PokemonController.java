package com.example.demo.Controlador;

import com.example.demo.Modelo.Pokemon;
import com.example.demo.Servicio.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {
    private PokemonService pokemonService;
@Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokedex/")
        public List<Pokemon> getPokedex(){
            return this.pokemonService.getPokedex();
    }

    @PostMapping("/pokedex/")
    public void atraparPokemon(@RequestBody Pokemon pokemon){
        this.pokemonService.atraparPokemon(pokemon);
    }

    @DeleteMapping("/pokedex/{nombre}")
    public void liberarPokemon(@PathVariable("nombre") String nombre){
        this.pokemonService.liberarPokemon(nombre);
    }

}
