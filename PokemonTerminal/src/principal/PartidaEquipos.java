package principal;

import pokemonTerminalController.ControllerEquipo;
import pokemonTerminalController.ControllerPartida;
import pokemonTerminalController.ControllerTienda;
import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

public class PartidaEquipos {
	/*Partes:
	  Adrían: Main, un modelo y un crud, imprimir sprites, controllers
	  Ana Pilar: la mitad de imprimir, la mitad de crud, la mayoría de los sprites
	  Carlos: la mayoria de Models, todos los movimientos de datos
	  Maylor: la mitad de imprimir, la mitad de crud, añadido las stats de los pokemon*/

	/*Al ejecutar la partida se te pide nombre y 6 pokemons, aunque todavía no se puede cambiar de pokemons en 
	  la partida, en la tienda se pueden hacer las compras y pagar, pero no se pueden usar todavía en partida,
	  aunque está hecho el metodo para ello; una vez en la partida se puede atacar pero algunos ataques no hacen
	  nunca daño, tengo que ver por qué aún*/
	public static void main(String[] args) throws InterruptedException 
	{
		
		CrudEquipo equipos[] = new CrudEquipo[2];
		Imprimir im = new Imprimir();
		
		
		im.imprimirLogo();
		System.out.println("Pulse intro para continuar\n");
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
