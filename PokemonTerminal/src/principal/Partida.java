package principal;


import pokemonTerminalController.ControllerMov;
import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalDatos.PokeAtaques;
import pokemonTerminalDatos.PokeStats;
import pokemonTerminalVista.Imprimir;
import pokemonTerminalModel.Equipo;

import utilidades.Leer;

public class Partida {

	public static void main(String[] args) 
	{
		PokeStats lp = new PokeStats();
		PokeAtaques ata = new PokeAtaques();
		Imprimir imprimir = new Imprimir();
		CrudPokemon poke[] = {
				new CrudPokemon(lp.getPokemon(1)), 
				new CrudPokemon(lp.getPokemon(7))};
		
		Equipo equipo1 = new Equipo(poke);
		
		int atacante = 0;
		int defensor = 1;
		int movimiento = 0;
		int aux1 = 0;
		int vida = 0;
		
		do
		{
			imprimir.imprimirSprites(poke[atacante].getPokemon(), poke[defensor].getPokemon());
			
			System.out.printf("Atacante(tú): " + poke[atacante].getPokemon().getNombre() + ", ");
			imprimir.imprimirVida(poke[atacante].getPokemon());
			imprimir.imprimirVidaDibujo(poke [atacante].getPokemon());
			System.out.printf("\nDefensor: " + poke[defensor].getPokemon().getNombre() + ", ");
			imprimir.imprimirVida(poke[defensor].getPokemon());
			imprimir.imprimirVidaDibujo(poke [defensor].getPokemon());
			System.out.println("");
			imprimir.menuMovimiento(Pokemon p, A(poke[defensor].getPokemon());
			do 
			{
				System.out.println("\nDiga ataque deseado");
				movimiento = Leer.datoInt()-1;
				if(movimiento < 0 || movimiento > 3)
					System.out.println("\nAtaque incorrecto, introduzca otro");
			}while(movimiento < 0 || movimiento > 3);
			
			vida = ControllerMov.calcularDaño(poke[atacante].getPokemon(), movimiento, poke[defensor].getPokemon())*(-1);
			poke[defensor].actulizarVida(vida);
			
			if(defensor == 0)
			{
				defensor = 1;
				atacante = 0;
				
			}else {
				defensor = 0;
				atacante = 1;
			}
		}while(poke[0].getPokemon().getVida() > 0 && poke[1].getPokemon().getVida() > 0);

	}

}
