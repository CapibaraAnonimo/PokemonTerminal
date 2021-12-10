package pokemonTerminalCrud;

import pokemonTerminalModel.Equipo;

public class CrudEquipo {
	
	//Primero comencemos en inyectar la clase que contiene Equipo

	private Equipo crudEquipo;
	
	private Equipo pokemon1;
	
	private Equipo pokemon2;
	
	private Equipo pokemon3;
	
	private Equipo pokemon4;
	
	private Equipo pokemon5;
	
	private Equipo pokemon6;
	
	public CrudEquipo (Equipo crudEquipo) {
		this.crudEquipo = crudEquipo;
	}
	
		public CrudEquipo (Equipo pokemon1, Equipo pokemon2, Equipo pokemon3, Equipo pokemon4, Equipo pokemon5, Equipo pokemon6) {
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		this.pokemon3 = pokemon3;
		this.pokemon4 = pokemon4;
		this.pokemon5 = pokemon5;
		this.pokemon6 = pokemon6;
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
