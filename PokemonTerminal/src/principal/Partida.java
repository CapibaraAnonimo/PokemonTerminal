package principal;

import pokemonTerminalController.PokeController;
import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalDatos.PokeAtaques;
import pokemonTerminalDatos.PokeStats;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

public class Partida {

	public static void main(String[] args) 
	{
		PokeStats lp = new PokeStats();
		PokeAtaques ata = new PokeAtaques();
		Imprimir imprimir = new Imprimir();
		CrudPokemon poke[] = {new CrudPokemon(lp.getPokemon(1)), new CrudPokemon(lp.getPokemon(1))};
		int atacante = 0;
		int defensor = 1;
		int movimiento = 0;
		int aux1 = 0;
		
		do
		{
			System.out.printf("Atacante(tú): " + poke[atacante].getPokemon().getNombre() + ", ");
			imprimir.imprimirVida(poke[atacante].getPokemon());
			System.out.printf("\nDefensor: " + poke[defensor].getPokemon().getNombre() + ", ");
			imprimir.imprimirVida(poke[defensor].getPokemon());
			
			imprimir.menuMovimiento(poke[defensor].getPokemon());
			System.out.println("\nDiga ataque deseado");
			movimiento = Leer.datoInt();
			
			poke[defensor].actulizarVida(PokeController.calcularDaño(poke[atacante].getPokemon(), movimiento, poke[defensor].getPokemon())*(-1));
			
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
