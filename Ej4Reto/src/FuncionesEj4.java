import java.util.Scanner;

public class FuncionesEj4 {

	public static void main(String[] args) {

		// Funcion que diga se el numero es primo
		public static int esPrimo(String s, int n) {
			Scanner sc = new Scanner(System.in);
			// pido numero hasta que sea primo
			int n;
			boolean entra = false;
			do {
				
				try {
					System.out.println("Escribe un numero para ver se es primo");
					String s = sc.nextLine();
					n = Integer.parseInt(s);
					// lo divido entre n� que van del 2 a n-1
					for (int i = 2; i < n; i++) {
						if (n % i == 0) {
							// cambio el valor de entra para indicar que he entrado en el if
							// un sysout no da información al programador, sólo al que ejecuta el programa
							entra = true;
							;
							// salgo porque no es primo, ya no miro más

						}
					}
					// si termino de dividir y no he entrado, es que es primo
					if (entra)
						break; // este break rompo el do while
					else {
						// reseteo entra para volver a ponerlo a false
						entra = false;
					}
				}

				catch (Exception e) {
					System.out.println("Formato incorrecto");
				}

			} while (true);
			return n;
		}

	}
