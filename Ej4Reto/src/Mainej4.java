import java.util.Scanner;

public class Mainej4 {

	public static void main(String[] args) {
		do {
			try {
				Scanner sc = new Scanner(System.in);
				int n = funciones.dimeEntero("Introduce un numero: 1- Es Primo 2- Mayor 3- Menor", sc);
				if(n==1) {
					System.out.println(FuncionesEj4.esPrimo("¿es primo?" , n));
				}
				
				if(n==0) {
					break;
				}
			}catch Exception;
			
		}while(true);
		
		
	}

}
