package pokemonTerminalController;

import pokemonTerminalModel.Pokemon;

public class PokeController {
	
	public static int calcularDaño(int critico, int random, int bmta, int efectividad, Pokemon atacante, int ataque, Pokemon defensor)
	{
		
		return ((((((2*atacante.getNivel())/5)+2)*atacante.getMovimiento(ataque).getPoder()*(calcularAtaque(atacante, ataque)/calcularDefensa(atacante, ataque)))/50) *critico*random*bmta*efectividad);
	}
	
	public static int calcularAtaque(Pokemon p, int ataque)
	{
		if(p.getMovimiento(ataque).getCategoria() == 1)
		{
			return p.getAtaque();
		}else {
			return p.getAtaqueEspecial();
		}
	}
	
	public static int calcularDefensa(Pokemon p, int ataque)
	{
		if(p.getMovimiento(ataque).getCategoria() == 1)
		{
			return p.getDefensa();
		}else {
			return p.getDefensaEspecial();
		}
	}


}