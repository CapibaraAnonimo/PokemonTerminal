package pokemonTerminalDatos;

import pokemonTerminalModel.Movimiento;

public class PokeAtaques {
	
	public int ataqueID[] = {};
	
	
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
										//Tierra
										new Movimiento(89, "Terremoto", 4, 100, 100, 10, 1),
										//Acero
										new Movimiento(309, "Puño Meteoro", 8, 90, 90, 10, 1),
										new Movimiento(684, "Cuerno Certero", 8, 70, 100, 10, 1 ),
										//Dragon
										new Movimiento(406, "Pulso Dragón", 15, 85, 100, 10, 1),
										new Movimiento(337, "Garra Dragon", 15, 80, 100, 15, 1),
										//Fantasma
										new Movimiento(421, "Garra Umbria", 7, 70, 100, 15, 1 ),
										new Movimiento(247, "Bola Sombra", 7, 80, 100, 15, 2 ),
										//Roca
										new Movimiento(317, "Tumba Rocas", 5, 70, 100, 15, 1),
										new Movimiento(444, "Roca Afilada",5, 120, 80, 5, 2),
										//Siniestro
										new Movimiento(44, "Mordisco",16, 70, 100, 25, 1 ),
										new Movimiento(242, "Triturar",16, 90, 100, 15, 1 ),
										//Volador
										new Movimiento(143, "Ataque Aereo", 2, 140, 90, 5, 1),

									//id, nombre, tipo, poder, precision, pp, categoria, condicion estado, prob estado 
										//Normal
										new Movimiento(34, "Golpe Cuerpo",	0, 85, 100, 15, 1, 2, 30 ),
										//Fuego
										new Movimiento(52, "Ascuas",		9, 40, 100, 25, 14, 0, 10),
										new Movimiento(172, "Rueda Fuego", 	9, 60, 100, 25, 1, 0, 10),
										//Electrico	
										new Movimiento(84, "Impactrueno", 	12, 40, 100, 30, 1, 2, 10 ),
										new Movimiento(85, "Rayo", 			12, 90, 100, 15, 2, 2, 10),
										//Hielo
										new Movimiento(58, "Rayo Hielo", 14, 90, 100, 10, 2, 1, 20 ),
										new Movimiento(8, "Puño Hielo,", 14, 75, 100, 15, 1, 1, 10),
										//Veneno
										new Movimiento(188, "Bomba Lodo", 3, 90, 100, 10, 2, 3, 30 ),
										new Movimiento(482, "Onda Toxica", 3, 90, 100, 10, 2, 3, 10 ),

									//id, nombre, tipo, poder, precision, pp, categoria, ataque, ataqueEsp, defensa, defensaEsp
										//Positivo para sumar estadistica, negativo para bajar
										//True para ti mismo False para el enemigo
										//Normal
										new Movimiento(14, "Danza Espada", 	0, 0, 100, 20, 0, 2 , 0, 0, 0, true ),
										new Movimiento(437, "Llueve Hojas", 11, 130, 90, 5, 1, 0, -2, 0, 0, true),
										//Lucha
										new Movimiento(370, "A Bocajarro", 1, 120, 100, 5, 1, 0, 0 ,-2,-2, true),
										//Fantasma
										
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
