package pokemonTerminalModel;
import pokemonTerminalCrud.CrudPokemon;


public class Equipo {
	private CrudPokemon pokemons []= new CrudPokemon[6];
	
	public Equipo(CrudPokemon[] pokemon) {
		this.pokemons = pokemon;
	}

	public CrudPokemon[] getPokemon() {
		return pokemons;
	}


	public void setPokemon(CrudPokemon[] pokemon) {
		this.pokemons = pokemon;
	}
	
	
	
	
	
	
	
}
