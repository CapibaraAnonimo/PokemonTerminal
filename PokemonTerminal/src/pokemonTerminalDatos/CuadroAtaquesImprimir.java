package pokemonTerminalDatos;

import pokemonTerminalModel.Pokemon;

public class CuadroAtaquesImprimir {
	
	
	private String cuadroArriba =  "┌──────────────────────────────┐";

	private String cuadroMedio = "│";

	private String cuadroAbajo = "└──────────────────────────────┘";

	public String cuadroAtaqueArriba () {
		String im;
		im ="┌──────────────────────────────┐";
		
		return im;
	}
	
	public String cuadroAtaqueMedio () {
		String cuadroMedio;
		cuadroMedio = "│";
		
		return cuadroMedio;
	}
	
	public String cuadroAtaqueAbajo () {
		String cuadroAbajo;
		cuadroAbajo = "└──────────────────────────────┘";
		
		return cuadroAbajo;
	}
	
}
