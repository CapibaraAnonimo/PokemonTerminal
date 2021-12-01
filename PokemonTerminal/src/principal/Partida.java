package principal;

import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalDatos.PokeStats;

public class Partida {

	public static void main(String[] args) 
	{
		PokeStats lp = new PokeStats();
		CrudPokemon poke[] = {new CrudPokemon(lp.getPokemon(1)), new CrudPokemon(lp.getPokemon(1))};
		int turno = 0;
		
		do
		{
			if(turno == 0)
			{
				turno = 1;
			}else {
				turno = 0;
			}
		}while(poke[1].getPokemon().getVida() > 0 && poke[2].getPokemon().getVida() > 0);

	}

}
