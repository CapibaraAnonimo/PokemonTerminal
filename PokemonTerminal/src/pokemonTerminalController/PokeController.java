package pokemonTerminalController;

public class PokeController {
	
	public static int calcularDaño(int nivel, int a, int d, int potencia, int critico, int random, int bmta, int efectividad)
	{
		return ((((((2*nivel)/5)+2)*potencia*(a/d))/50) *critico*random*bmta*efectividad); //
	}

}