package pokemonTerminalCrud;

import pokemonTerminalModel.Objetos;

public class CrudTienda {

	private CrudTienda tienda;
	private CrudObjetos objetos;
		
	public void actualizarCantidad(Objetos obj, int cant) {
		obj.setCantidad(obj.getCantidad()+cant);
	}
}
