package pokemonTerminalDatos;

import pokemonTerminalModel.Pokemon;

public class CuadroAtaquesImprimir {
	
	
	private String prueba =  "┌──────────────────────────────┐";

	private String prueba1 = "│";

	private String prueba2 = "│";

	private String prueba4 = "└──────────────────────────────┘";
	
	
	public void menuMovimiento(Pokemon pokemon) {

		System.out.println(prueba + "\n" + prueba1 + "1."+ pokemon.getMovimiento(0).getNombre() + "\t" + "2."
				+ pokemon.getMovimiento(1).getNombre() + "\n" + prueba2 + "3." + pokemon.getMovimiento(2).getNombre() + "\t"
				+ "4." + pokemon.getMovimiento(3).getNombre() + "\n" + prueba4);
	}
}
