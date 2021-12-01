package pokemonTerminalDatos;

import pokemonTerminalModel.Movimiento;

public class PokeAtaques {
	
	public int ataqueID[] = {};
	
	public Movimiento ataques[] = {
									//id, nombre, tipo, poder, precision, pp, categoria
										new Movimiento(22, "Látigo Cepa", 11, 45, 100, 25, 0),
										new Movimiento(33, "Placaje", 0, 35, 100, 35, 0),
										new Movimiento(75, "Hoja Afilada", 11, 55, 95, 25, 0),
										new Movimiento(76, "Rayo Solar", 11, 120, 100, 10, 1),
									//id, nombre, tipo, poder, precision, pp, categoria, condicion estado, prob estado 
										new Movimiento(52, "Ascuas", 9, 40, 100, 25, 14, 0, 10),
									//id, nombre, tipo, poder, precision, pp, categoria, ataque, ataqueEsp, defensa, defensaEsp	
										
																								};
	
	public Movimiento getMovimiento(int id)
	{
		for(int i = 0; i < ataques.length; i++)
		{
			if(ataques[i].getId() == id)
			{
				return ataques[i];
			}
		}
		return null;
	}

}
