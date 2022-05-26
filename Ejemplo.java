public class Main {
	
	// ESTO NO ES EL EJERCICIO, SINO NOTAS TOMADAS DURANTE LA LECCIÓN
	// El ejercicio está en /src como Main.java
	
	public static void main(String[] args) { // Creacion de if statement
		String estacion = "Primavera"; 
		if (estacion == "Primavera") { // Si el string de ESTACION equivale a "Primavera" se ejecutará el siguiente code block
			System.out.println("Es primavera");
		} else if (estacion == "Otoño") { // En el caso de que ESTACION equivalga a "Otoño" se ejecutará el siguiente code block
			System.out.println("Es Otoño"); 
		} else { // Opcionalmente, en el caso de que no sea ni la una y la otra, se ejecutará el siguiente code block
			System.out.println("Es otra estación");
		}
		
		// Loop de WHILE
		int contador = 5;
		
		while (contador >= 0) { // Mientras contador sea inferior o igual a cero se ejecutara el siguiente codigo.
			System.out.println(contador); // Se imprime el valor de contador.
			--contador; // Se resta uno y se vuelve a iniciar el bucle hasta que la condicion no se cumpla.
		}
		
		// Loop de DO WHILE
		
		int contadorwhile = 10;
		
		do {
			System.out.println(contadorwhile);
			--contadorwhile;
		} while (contadorwhile > 0);
		
		/* La diferencia substancial del DO WHILE es que se ejecuta la acción antes de que se realice el check
		 * del condicionante del bucle */
		
		// Loop de FOR
		
		for (int i = 1; i <= 10; ++i) { // Para establecer condiciones es igual que en Javascript, exceptuando la declaracion del int del iterador
			System.out.println(i);
			// ++i se ejecutara despues de que el code block concluya
		}
		
		// Loop FOR refactorizado
		
		for (; contador == 5;) {
		
		}
		
		// Switch CASE
		
		// Los switch case en este caso son iguales a javascript,
		switch(estacion) {
		case "VERANO":
			System.out.println("Es verano");
			break;
		case "INVIERNO":
			System.out.println("Es invierno");
			break;
		default:
			System.out.println("Default response");
		}
	}
}