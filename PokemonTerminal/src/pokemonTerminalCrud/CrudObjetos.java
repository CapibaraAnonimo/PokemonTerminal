package pokemonTerminalCrud;

import pokemonTerminalModel.Pokemon;
import pokemonTerminalModel.Objetos;

public class CrudObjetos {

	
	private Objetos objetos;
	//constructor
	public CrudObjetos (Objetos o) {
		objetos = new Objetos (o.getPrecio(), o.getTipo(), o.getAccion());		
		
	}
	
	public CrudObjetos (Pokemon oP) {
		oP = new Pokemon (oP.Id(), oP.getNombre(), oP.getNivel(), oP.getTipo(), oP.getVida())
	}
	
	//Comienzo a realizar la actualización de la vida con objetos
	
	public void sumarVida () {
		
		
	}
	
	//metodos para actualizar, debido a las acciones 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
