package pokemonTerminalCrud;

import pokemonTerminalModel.Objetos;
import pokemonTerminalModel.Tienda;

public class CrudTienda {

	private Tienda tienda;
		
	public CrudTienda() {
		tienda = new Tienda();
	}
	
	public void actualizarCantidad(Objetos obj, int cant) {
		obj.setCantidad(obj.getCantidad()+cant);
	}
	
	public Tienda getTienda() {
		return tienda;
	}
}
