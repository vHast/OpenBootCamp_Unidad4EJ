public class Main {
	
	public static void main(String[] args) { 
		
		// Creación de IF statement
		int numeroIf = 5;
		if (numeroIf > 0) {
			System.out.println("La variable es positiva");
		} else if (numeroIf == 0) {
			System.out.println("La variable equivale a cero");
		} else {
			System.out.println("La variable es negativa");
		}
		
		// Creación de WHILE loop
		int numeroWhile = 0;
		while (numeroWhile < 3) {
			System.out.println("Se ha añadido 1 a el valor de numeroWhile");
			++numeroWhile; // Se suma uno al valor de numeroWhile y se vuelve a iniciar el blucle si se cumplen las condiciones
		}
		
		// Creación de DO WHILE loop
		int numeroDoWhile = 2;
		
		do {
			System.out.println("Se ha añadido 1 a el valor de numeroDoWhile");
			++numeroDoWhile;
		} while (numeroDoWhile < 3);
		
		// Creación de FOR loop
		
		for (int numeroFor = 0; numeroFor <= 3; ++numeroFor) {
			System.out.println("Se ha añadido 1 a el valor de numeroFor");
		}
		
		// Creación de SWITCH 
		
		String estacion = "VERANO";
		
		switch(estacion) { 
		case "INVIERNO":
			System.out.println("Es invierno");
			break;
		case "PRIMAVERA":
			System.out.println("Es primavera");
			break;
		case "VERANO":
			System.out.println("Es verano");
			break;
		case "OTOÑO":
			System.out.println("Es otoño");
			break;
		default: // Se imprimira este valor en el caso de que no se haya introducido una estacion valida
			System.out.println("No se ha introducido el nombre de una estación válida");
		}	
	}
}