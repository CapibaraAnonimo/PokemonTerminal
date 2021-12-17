package principal;

import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalDatos.PokeAtaques;
import pokemonTerminalDatos.PokeStats;
import pokemonTerminalVista.Imprimir;
import utilidades.Leer;

public class PartidaEquipos {

	public static void main(String[] args) 
	{
		PokeStats lp = new PokeStats();
		PokeAtaques ata = new PokeAtaques();
		Imprimir imprimir = new Imprimir();
		
		CrudEquipo equipos[] = new CrudEquipo[2];
		
		System.out.println("Jugador 1, diga su nombre o nombre de equipo");
		equipos[0] = new CrudEquipo(Leer.dato());
		
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < lp.stats.length; j++) 
			{
				System.out.println(lp.stats[j]);
			}
			System.out.printf("Seleccione el pokemon ", i+1 + "\n");
			equipos[0].actualizarPokemon(new CrudPokemon(lp.getPokemon(Leer.datoInt())), i);
		}
		System.out.println("Tu equipo es: \n");
		for(int i = 0; i < equipos[0].getEquipo().getPokemons().length; i++)
		{
			System.out.println(equipos[0].getEquipo().getPokemons());
		}

	}

}
