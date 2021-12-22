package principal;

import pokemonTerminalController.ControllerEquipo;
import pokemonTerminalController.ControllerPartida;
import pokemonTerminalController.ControllerTienda;
import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

public class PartidaEquipos {

	public static void main(String[] args) throws InterruptedException 
	{
		
		CrudEquipo equipos[] = new CrudEquipo[2];
		Imprimir im = new Imprimir();
		
		
		im.imprimirLogo();
		System.out.println("Pulse culquier tecla para continuar\n");
		Leer.datoChar();
		for(int i = 0; i < equipos.length; i++)
		{
			System.out.println("Diga su nombre o nombre de equipo");
			equipos[i] = new CrudEquipo(Leer.dato());
			ControllerEquipo.elegirEquipo(equipos[i]);
			ControllerTienda.tienda(equipos[i]);
		}
		
		ControllerPartida.batalla(equipos);
	}
	
	

}
