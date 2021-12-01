package principal;

import pokemonTerminalVista.Imprimir;

public class Principal {

	public static void main(String[] args) 
	{
		//Imprimir.menuMovimiento();
		
	//Plantilla de como va a ser en un principio el menú de ataque
	 String menuAtaqueArriba = "______________________________";
		  

	 String menuAtaqueAbajo =  "______________________________";

	 	//Por ahora les declaro estos nombres para saber donde van cada uno en el menú
	 String ataque1 = "Látigo Cepa";
	 String ataque2 = "Luz Solar";
	 String ataque3 = "Placaje";
	 String ataque4 = "Hoja Afilada";
	 

	 System.out.println(menuAtaqueArriba + "\n*" + ataque1 + "\t*" + ataque2 + "\n*" + ataque3 + "\t*"+ ataque4 + "\n" + menuAtaqueAbajo);



		

	}
	
}
