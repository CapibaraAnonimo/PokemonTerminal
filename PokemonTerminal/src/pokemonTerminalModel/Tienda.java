package pokemonTerminalModel;

import pokemonTerminalCrud.CrudObjetos;
import pokemonTerminalDatos.PokeObjetos;
public class Tienda {
	

	private CrudObjetos[] objetoLista=new CrudObjetos[11];
	

	
	public Tienda() {
		PokeObjetos obj = new PokeObjetos();

		objetoLista[0]=new CrudObjetos(obj.getObjetos(1));
		objetoLista[1]=new CrudObjetos(obj.getObjetos(2));
		objetoLista[2]=new CrudObjetos(obj.getObjetos(3));
		objetoLista[3]=new CrudObjetos(obj.getObjetos(4));
		objetoLista[4]=new CrudObjetos(obj.getObjetos(5));
		objetoLista[5]=new CrudObjetos(obj.getObjetos(6));
		objetoLista[6]=new CrudObjetos(obj.getObjetos(7));
		objetoLista[7]=new CrudObjetos(obj.getObjetos(8));
		objetoLista[8]=new CrudObjetos(obj.getObjetos(9));
		objetoLista[9]=new CrudObjetos(obj.getObjetos(10));
		objetoLista[10]=new CrudObjetos(obj.getObjetos(11));


	
	}
	

	
	
}
