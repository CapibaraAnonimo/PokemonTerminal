package principal;

import pokemonTerminalVista.Imprimir;

public class Principal {

	public static void main(String[] args) 
	{
		//Imprimir.menuMovimiento();
		
	//Plantilla de como va a ser en un principio el menú de ataque
	 String menuAtaqueArriba = "__________________________";
		  

	 String menuAtaqueAbajo =  "__________________________";

	 	//Por ahora les declaro estos nombres para saber donde van cada uno en el menú
	 String ataque1 = "Ataque1";
	 String ataque2 = "Ataque2";
	 String ataque3 = "Ataque3";
	 String ataque4 = "Ataque4";
	 
	 System.out.println(menuAtaqueArriba + "\n*" + ataque1 + "\t*" + ataque2 + "\n*" + ataque3 + "\t*"+ ataque4 + "\n" + menuAtaqueAbajo);


		

	}
	
}
