package controlador;

import java.util.Scanner;
import static java.lang.String.format;

public class Ejecicio01 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, promedio= 0.0;
		var lc = new Scanner(System.in);
		
		System.out.println("Digita la nota 1: ");
		nota1 = lc.nextInt();
		System.out.println("Digita la nota 2: ");
		nota2 = lc.nextInt();
		System.out.println("Digita la nota 3: ");
		nota3 = lc.nextInt();
		
	    promedio = (nota1+nota2+nota3)/3;
		var notaDefi= promedio >= 350 ? "Aprobado" : "Reprobado";
		var mensaje = format("su nota es:  %.2f y usted esta %s", promedio, notaDefi);
		System.out.println(mensaje);

	}

}
