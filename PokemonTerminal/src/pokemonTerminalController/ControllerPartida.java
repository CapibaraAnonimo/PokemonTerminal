package pokemonTerminalController;

import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

public class ControllerPartida {
	
	public static void batalla(CrudEquipo equipos[]) throws InterruptedException {
		Imprimir imprimir = new Imprimir();
		
		int atacante = 0;
		int defensor = 1;
		int movimiento = 0;
		int vida = 0;
		do
		{
			
			imprimir.imprimirSprites(equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon(), equipos[defensor].getEquipo().getPokemon(equipos[defensor].getEquipo().getPosicion()).getPokemon());
			
			System.out.printf(equipos[atacante].getEquipo().getNombreEquipo() + ": " + equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon().getNombre() + ", ");
			imprimir.imprimirVida(equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon());
			imprimir.imprimirVidaDibujo(equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon());
			System.out.printf("\n" + equipos[defensor].getEquipo().getNombreEquipo() + ": " + equipos[defensor].getEquipo().getPokemon(equipos[defensor].getEquipo().getPosicion()).getPokemon().getNombre() + ", ");
			imprimir.imprimirVida(equipos[defensor].getEquipo().getPokemon(equipos[defensor].getEquipo().getPosicion()).getPokemon());
			imprimir.imprimirVidaDibujo(equipos[defensor].getEquipo().getPokemon(equipos[defensor].getEquipo().getPosicion()).getPokemon());
			System.out.println("");
			imprimir.menuMovimiento(equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon());
			do 
			{
				System.out.println("\nDiga ataque deseado");
				movimiento = Leer.datoInt()-1;
				if(movimiento < 0 || movimiento > 3)
					System.out.println("\nAtaque incorrecto, introduzca otro");
			}while(movimiento < 0 || movimiento > 3);
			
			vida = ControllerMov.calcularDaño(equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon(), movimiento, equipos[defensor].getEquipo().getPokemon(equipos[defensor].getEquipo().getPosicion()).getPokemon())*(-1);
			System.out.println("Has hecho " + vida + " de daño");
			Thread.sleep(1200);
			equipos[defensor].getEquipo().getPokemon(equipos[defensor].getEquipo().getPosicion()).actulizarVida(vida);
			
			if(defensor == 0)
			{
				defensor = 1;
				atacante = 0;
				
			}else {
				defensor = 0;
				atacante = 1;
			}
		}while(equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon().getVida() > 0 && equipos[defensor].getEquipo().getPokemon(equipos[defensor].getEquipo().getPosicion()).getPokemon().getVida() > 0);
		if(equipos[atacante].getEquipo().getPokemon(equipos[atacante].getEquipo().getPosicion()).getPokemon().getVida() < 0)
		{
			System.out.println("Ha ganado " + equipos[defensor].getEquipo().getNombreEquipo());
		} else
		{
			System.out.println("Ha ganado " + equipos[atacante].getEquipo().getNombreEquipo());
		}
	}

}
