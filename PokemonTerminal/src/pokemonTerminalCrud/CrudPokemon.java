package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;


public class CrudPokemon {
	//se "inyecta la clase Pokemon para acceder a los atributos de la clase Pokemon"

	//se crea un objeto crud el cual es CrudPokemon y esta vacío
	
	private Pokemon crudPokemon;	
	
	//Se crea el constructor pokemon para poder igualar
	public CrudPokemon(Pokemon crudPokemon) {
		this.crudPokemon = crudPokemon;
	}
	
	//METODOS PARA ACTUALIZAR
	public void actualizarDefensa (int actDefensa) {
		crudPokemon.setDefensa(crudPokemon.getDefensa() + actDefensa);
	}

	public void actualizarDefensaEspecial (int actDefensaEspecial) {
		crudPokemon.setDefensaEspecial(crudPokemon.getDefensaEspecial() + actDefensaEspecial);
	}

	public void actulizarVida (int acVida) {
		crudPokemon.setVida(crudPokemon.getVida() + acVida);
		
	}
	
	public void actualizarAtaque(int acAtaque) {
		crudPokemon.setAtaque(crudPokemon.getAtaque() + acAtaque);
		
	}
	
	public void actualizarAtaqueEspecial (int acAtaqueEspecial) {
		crudPokemon.setAtaqueEspecial(crudPokemon.getAtaqueEspecial() + acAtaqueEspecial);
		
	}
	
	//metodo para devolver el objeto crudPokemon
	public Pokemon getPokemon() {
		return crudPokemon;
	}
	
	
	
	
	
}
