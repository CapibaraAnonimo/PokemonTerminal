package principal;

import pokemonTerminalController.ControllerEquipo;
import pokemonTerminalController.ControllerMov;
import pokemonTerminalController.ControllerTienda;
import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalCrud.CrudTienda;
import pokemonTerminalDatos.PokeAtaques;
import pokemonTerminalDatos.PokeStats;
import pokemonTerminalModel.Equipo;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

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
		
	}

}
