package org.mon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.mon.db.Pokemon;
import org.mon.db.TypeEnum;
import org.mon.db.TypeMap;

@Path("/pokemon")
public class PokedexResource {

    @GET
    @Path("list")
    @Produces(MediaType.TEXT_PLAIN)
    public String listPokemons() {
        List<Pokemon> pokemons = Pokemon.listAll();
        return createPokemonString(pokemons);
    }

    @GET
    @Path("number")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPokemonByNumber(@QueryParam("number") String number) {
        Pokemon pokemon = Pokemon.findByNumber(number);
        if(pokemon != null)
            return pokemon.toString();
        else
            return  "No pokemon exists with that number!";
    }

    @GET
    @Path("name")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPokemonByName(@QueryParam("name") String name) {
        Pokemon pokemon = Pokemon.findByName(name);
        if(pokemon != null)
            return pokemon.toString();
        else
            return  "No pokemon exists with that name!";
    }

    @GET
    @Path("type")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPokemonsByList(@QueryParam("type") String type) {
        if(validateType(type)) {
            List<Pokemon> pokemons = new ArrayList<>();
            List<TypeMap> typeMap = TypeMap.list("type", type.toUpperCase());
            for (TypeMap tm : typeMap) {
                pokemons.add(Pokemon.findByNumber(tm.pokemonNumber));
            }
            return createPokemonString(pokemons);
        }
        else {

            return "Invalid type input. Use /pokemon/listTypes endpoint to see available Pokemon types.";
        }
    }

    @GET
    @Path("listTypes")
    @Produces(MediaType.TEXT_PLAIN)
    public String listTypes() {
        String types = Arrays.asList(TypeEnum.values()).stream().map(TypeEnum::name).collect(Collectors.joining(", "));
        return types;
    }

    //TODO: enter pokemon and get evolution tree

    private boolean validateType(String type) {
        boolean result = false;
        for(TypeEnum t : TypeEnum.values()) {
            if (t.name().equals(type.toUpperCase())) {
                return true;
            }
        }
        return result;
    }

    private String createPokemonString(List<Pokemon> pokemons) {
        String result = "";
        for (Pokemon p : pokemons) {
            result += p.toString() + "\n\n";
        }
        return result;
    }
}
