package principal;

import pokemonTerminalVista.Imprimir;

public class Principal {

	public static void main(String[] args) 
	
	
	
	
	{
		
		
		Imprimir imprimirMenuAtac;
		//Imprimir.menuMovimiento();
		
		//Un boceto de la vida, que consta de 10 corazones
	 String vida = "HP: ♥♥♥♥♥♥♥♥♥♥";
		
	//Plantilla de como va a ser en un principio el menú de ataque
	 
	 
	 
	 String bulbasur = ";;t;;;t;t;;t;;;t;;;t;tX@@%;;t;;;t;;;t;t;\r\n"
	 		+ ";;;t;;;;;;;;t;;;t;;;%:@SX @;;;t;;t;;;;;;\r\n"
	 		+ ";t;;t;t;t;t;;;t;@.t@88X  X :X;;t;;t;t;t;\r\n"
	 		+ ";;t;;;;t;;;8@SX%888t@8  @%t8@X@t;;;;;t;;\r\n"
	 		+ ";t;;tt;;;;t.t:@S88S8 S; 8;8  @SXt;tt;;;t\r\n"
	 		+ ";;;t;;;t;;X:t .8888:: .   .8 8S@;t;;;t;;\r\n"
	 		+ ";t;;;t;;%S8t :@ 8t:8X88. 8@SXX8t;;;t;;;t\r\n"
	 		+ ";;t;;;t;X@8% X %88%:XtS@8;%8SS@;;t;;t;t;\r\n"
	 		+ ";t;;t;;;XX:  X 88X:S%t8;:8:8S t;;;t;;;;t\r\n"
	 		+ ";;;t;;t;tX 8%. X@888%@t:8 S:@:;t;;;t;t;;\r\n"
	 		+ ";t;;t;;t;;:S  t88X888tS@%%:;t;;;t;t;;;;t\r\n"
	 		+ ";;t;;t;;;;t;..tSS%X%S:SS8;;;t;t;;t;;t;t;";
	 
	 String prueba= "┌──────────────────────────────┐";
	 
	 String prueba1="│";
	 
	 String prueba2="│";
	 
	 String prueba4="└──────────────────────────────┘";

	 	//Por ahora les declaro estos nombres para saber donde van cada uno en el menú
	 String ataque1 = "1.Látigo Cepa";
	 String ataque2 = "2.Luz Solar";
	 String ataque3 = "3.Placaje";
	 String ataque4 = "4.Hoja Afilada";
	 
	 //He creado un boceto del menú de ataque, en este caso con ataques de Pokémon de tipo planta
	 
		 System.out.println(prueba + "\n" + prueba1 + ataque1 + "\t" + ataque2 + "\n" + prueba2 + ataque1 + "\t" + ataque3 + "\n" + prueba4);
		 
		 System.out.println(vida);
		 
		 System.out.println(bulbasur);
		 
	 }


		

	}
	

