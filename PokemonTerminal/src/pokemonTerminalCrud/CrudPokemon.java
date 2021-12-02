package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;


public class CrudPokemon {
<<<<<<< HEAD
	//se "inyecta la clase Pokemon para acceder a los atributos de la clase Pokemon"

	//se crea un objeto crud el cual es CrudPokemon y esta vacío
	
	private Pokemon crudPokemon;
	
=======

	//se crea un objeto crud el cual es CrudPokemon y esta vacío
		
	private Pokemon crudPokemon;	
>>>>>>> 49759438c6e160cda4a6962e31d9a9075ea42695
	
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
	
	public Pokemon getPokemon() {
		return crudPokemon;
	}
	
	
	
	
	
}
