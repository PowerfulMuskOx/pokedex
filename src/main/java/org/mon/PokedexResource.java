package org.mon;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.mon.db.Pokemon;

@Path("/pokemon")
public class PokedexResource {

    @GET
    @Path("list")
    @Produces(MediaType.TEXT_PLAIN)
    public String listPokemons() {
        List<Pokemon> pokemons = Pokemon.listAll();
        String names = pokemons.stream().map(p-> p.name).collect(Collectors.joining (", "));
        return names;
    }

    @GET
    @Path("number")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPokemonByNumber(@QueryParam("number") String number) {
        Pokemon pokemon = Pokemon.findByNumber(number);
        return pokemon.number + pokemon.name + pokemon.description ;
    }

    @GET
    @Path("name")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPokemonByName(@QueryParam("name") String name) {
        Pokemon pokemon = Pokemon.findByName(name);
        return pokemon.name;
    }

    //TODO: enter type and get list of pokemons

    //TODO: enter pokemon and get evolution tree
}
