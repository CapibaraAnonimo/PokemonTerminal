package pokemonTerminalController;

import java.util.Random;

import pokemonTerminalModel.Pokemon;

public class PokeController {
	
	public static int calcularDaño(int critico, int random, int bmta, int efectividad, Pokemon atacante, int ataque, Pokemon defensor)
	{
		
		return ((((((2*atacante.getNivel())/5)+2)*atacante.getMovimiento(ataque).getPoder()*(calcularAtaque(atacante, ataque)/calcularDefensa(atacante, ataque)))/50) *critico*random*bmta*efectividad);
	}
	
	
	//Te dá el ataque correspondiente a la categoria del movimiento
	public static int calcularAtaque(Pokemon p, int ataque)
	{
		if(p.getMovimiento(ataque).getCategoria() == 1)
		{
			return p.getAtaque();
		}else {
			return p.getAtaqueEspecial();
		}
	}
	
	//Te dá la defensa correspondiente a la categoria del movimiento
	public static int calcularDefensa(Pokemon p, int ataque)
	{
		if(p.getMovimiento(ataque).getCategoria() == 1)
		{
			return p.getDefensa();
		}else {
			return p.getDefensaEspecial();
		}
	}
	
	//Te dá el critico dependiendo del stage del pokemon
	public static double calcularCritico(Pokemon p) {
		double critico = 1.5, base = 0;
		Random ran = new Random(System.nanoTime());
		int stage = 0;
		int max = 100, min = 0;
		int aux = 0;
		double stage0 = 4.167, stage1 = 12.5, stage2 = 50;
		
		aux = ran.nextInt(max-min)+min;
		stage = p.getStage();
		
		if(stage == 0)
		{
			if(aux >= stage0)
			{
				return critico;
			}else
			{
				return base;
			}
		}else if(stage == 1)
		{
			if(aux >= stage1)
			{
				return critico;
			}else
			{
				return base;
			}
		}else if(stage == 2)
		{
			if(aux >= stage2)
			{
				return critico;
			}else
			{
				return base;
			}
		}else
		{
			return critico;
		}
		
	}


}