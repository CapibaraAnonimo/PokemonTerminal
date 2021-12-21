package principal;

import pokemonTerminalController.ControllerEquipo;
import pokemonTerminalController.ControllerPartida;
import pokemonTerminalController.ControllerTienda;
import pokemonTerminalCrud.CrudEquipo;

public class PartidaEquipos {

	public static void main(String[] args) 
	{
		CrudEquipo equipos[] = new CrudEquipo[2];
		int aux1 = 0;
		int aux2 = 0;
		
			
		for(int i = 0; i < equipos.length; i++)
		{
			ControllerEquipo.elegirEquipo(equipos[i]);
			ControllerTienda.tienda(equipos[i]);
		}
		
		ControllerPartida.batalla(equipos);
	}

}
