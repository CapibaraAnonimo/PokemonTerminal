package pokemonTerminalController;

import java.util.Random;

import pokemonTerminalDatos.TablaTipos;
import pokemonTerminalModel.Pokemon;

public class ControllerMov {
	
	public static int calcularDaño(Pokemon atacante, int ataque, Pokemon defensor)
	{
		
		return (int)((((((2*atacante.getNivel())/5)+2)*atacante.getMovimiento(ataque).getPoder()*(calcularAtaque(atacante, ataque)/calcularDefensa(atacante, ataque)))/50) * calcularCritico(atacante)*calcularRandom()*calcularBMTA(atacante, ataque)*calcularEfectividad(atacante, defensor)*calcularPrecision(atacante, ataque));
	}
	
	
	//Te devuelve el ataque correspondiente a la categoria del movimiento
	public static int calcularAtaque(Pokemon p, int ataque)
	{
		if(p.getMovimiento(ataque).getCategoria() == 1)
		{
			return p.getAtaque();
		}else {
			return p.getAtaqueEspecial();
		}
	}
	
	//Te devuelve la defensa correspondiente a la categoria del movimiento
	public static int calcularDefensa(Pokemon p, int ataque)
	{
		if(p.getMovimiento(ataque).getCategoria() == 1)
		{
			return p.getDefensa();
		}else {
			return p.getDefensaEspecial();
		}
	}
	
	//Te devuelve el critico dependiendo del stage del pokemon
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

	//Te devuelve el random
	public static double calcularRandom()
	{
		Random ran = new Random(System.nanoTime());
		int max = 100, min = 85;
		double random = 0;
		
		random = ran.nextInt(max-min)+min;
		
		return random/100;
	}

	//Te devuelve el BMTA (Bonus de mismo tipo de ataque)
	public static double calcularBMTA(Pokemon p, int ataque)
	{
		if(p.getTipo() == p.getMovimiento(ataque).getTipo())
		{
			return 1.5;
		}else
		{
			return 1.0;
		}
	}
	
	//Te devuelve la efectividad
	public static double calcularEfectividad(Pokemon atacante, Pokemon defensor)
	{
		return TablaTipos.getMultiplicador(atacante.getTipo(), defensor.getTipo());
	}
	
	//Te devuelve si acierta o no
	public static int calcularPrecision(Pokemon p, int ataque) {
		Random ran = new Random(System.nanoTime());
		int max = 100, min = 0;
		double random = 0;
		
		random = ran.nextInt(max-min)+min;
		if(random <= p.getMovimiento(ataque).getPrecision())
		{
			return 1;
		} else
		{
			return 0;
		}
	}
}