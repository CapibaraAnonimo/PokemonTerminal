package principal;

import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalDatos.PokeStats;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

public class Partida {

	public static void main(String[] args) 
	{
		PokeStats lp = new PokeStats();
		CrudPokemon poke[] = {new CrudPokemon(lp.getPokemon(1)), new CrudPokemon(lp.getPokemon(1))};
		int turno = 0;
		int aux1 = 0;
		Imprimir imprimir = new Imprimir();
		
		do
		{
			imprimir.menuMovimiento(null);
			aux1 = Leer.datoInt();
			if(turno == 0)
			{
				turno = 1;
			}else {
				turno = 0;
			}
		}while(poke[0].getPokemon().getVida() > 0 && poke[1].getPokemon().getVida() > 0);

	}

}
