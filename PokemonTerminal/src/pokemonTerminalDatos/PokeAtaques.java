package pokemonTerminalDatos;

import pokemonTerminalModel.Movimiento;
import pokemonTerminalModel.Pokemon;

public class PokeAtaques {
	
	public int ataqueID[] = {};
	
	private Pokemon pa;
	
	public Movimiento ataques[] = {
									//id, nombre, tipo, poder, precision, pp, categoria
										//Normal
										new Movimiento(33, "Placaje", 		0, 35, 100, 35, 1),
										new Movimiento(10, "Arañazo",		0, 40, 100, 35, 1),
										//Planta
										new Movimiento(22, "Látigo Cepa", 	11, 45, 100, 25, 0),
										new Movimiento(75, "Hoja Afilada", 	11, 55, 95, 25, 0),
										new Movimiento(76, "Rayo Solar", 	11, 120, 100, 10, 1),
										//Agua
										new Movimiento(55, "Pistola Agua", 	10, 40, 100, 25, 1),
										new Movimiento(56, "HidroBomba", 	10, 110, 80, 5, 1 ),
									//id, nombre, tipo, poder, precision, pp, categoria, condicion estado, prob estado 
										//Fuego
										new Movimiento(52, "Ascuas",		9, 40, 100, 25, 14, 0, 10),
										new Movimiento(172, "Rueda Fuego", 	9, 60, 100, 25, 1, 0, 10),
										//Electrico	
										new Movimiento(84, "Impactrueno", 	12, 40, 100, 30, 1, 2, 10 ),
									//id, nombre, tipo, poder, precision, pp, categoria, ataque, ataqueEsp, defensa, defensaEsp
										//Positivo para sumar estadistica, negativo para bajar
										//Normal
										new Movimiento(14, "Danza Espada", 	0, 0, 100, 20, 0, 2 , 0, 0, 0 ),
										new Movimiento(437, "Llueve Hojas", 11, 130, 90, 5, 1, 0, -2, 0, 0),
										
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
