package pokemonTerminalCrud;

import pokemonTerminalModel.Equipo;

public class CrudEquipo {
	
	//Primero comencemos en inyectar la clase que contiene Equipo

	private Equipo crudEquipo;
	
	public CrudEquipo (Equipo crudEquipo) {
		this.crudEquipo = crudEquipo;
	}
	
	//Continuo para relaizar el m�todo de la actualizaci�n del equipo
	//Continuo para relaizar el método de la actualización del equipo

	
	public void actualizarPosicion (int actualizarPosicion) {
		crudEquipo.setPosicion(crudEquipo.getPosicion() + actualizarPosicion);
	}
	

	public void actualizarPokemon (Equipo actualizarPokemon){
	crudEquipo.setPokemon(crudEquipo.getPokemon());
	}
	
	//Termino devolviendo el objeto a esta clase
	
	public Equipo getEquipo () {
		return crudEquipo;
	}

}
