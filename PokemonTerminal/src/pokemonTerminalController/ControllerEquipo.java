package pokemonTerminalController;

import pokemonTerminalCrud.CrudEquipo;
import pokemonTerminalCrud.CrudPokemon;
import pokemonTerminalDatos.PokeStats;
import utilidades.Leer;

public class ControllerEquipo {
	
	public static void elegirEquipo(CrudEquipo equipo) {
		PokeStats lp = new PokeStats();
		

		
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < lp.stats.length; j++) 
			{
				System.out.println(lp.stats[j]);
			}
			System.out.printf("Seleccione el pokemon %d\n", (i+1));
			equipo.actualizarPokemon(new CrudPokemon(lp.getPokemon(Leer.datoInt())), i);
		}
		System.out.println("Tu equipo es: \n");
		for(int i = 0; i < equipo.getEquipo().getPokemons().length; i++)
		{
			System.out.println(equipo.getEquipo().getPokemon(i).getPokemon());
		}
		
		System.out.println("Quiere cambiar un pokemon");
	}
	
	public static void cambiarPokemon(CrudEquipo equipo) {
		
	}

}
