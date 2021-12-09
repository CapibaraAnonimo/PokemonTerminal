package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;


public class CrudPokemon {
	//se "inyecta la clase Pokemon para acceder a los atributos de la clase Pokemon"

	//se crea un objeto crud el cual es CrudPokemon y esta vacío
	
	private Pokemon pokemon;	
	
	//Se crea el constructor pokemon para poder igualar
	public CrudPokemon(Pokemon crudPokemon) {
		this.pokemon = crudPokemon;
	}
	
	//METODOS PARA ACTUALIZAR
	public void actualizarDefensa (int actDefensa) {
		pokemon.setDefensa(pokemon.getDefensa() + actDefensa);
	}

	public void actualizarDefensaEspecial (int actDefensaEspecial) {
		pokemon.setDefensaEspecial(pokemon.getDefensaEspecial() + actDefensaEspecial);
	}

	public void actulizarVida (int acVida) {
		pokemon.setVida(pokemon.getVida() + acVida);
		
	}
	
	public void actualizarAtaque(int acAtaque) {
		pokemon.setAtaque(pokemon.getAtaque() + acAtaque);
		
	}
	
	public void actualizarAtaqueEspecial (int acAtaqueEspecial) {
		pokemon.setAtaqueEspecial(pokemon.getAtaqueEspecial() + acAtaqueEspecial);
		
	}
	
	//metodo para devolver el objeto crudPokemon
	public Pokemon getPokemon() {
		return pokemon;
	}
	
	
	
	
	
}
