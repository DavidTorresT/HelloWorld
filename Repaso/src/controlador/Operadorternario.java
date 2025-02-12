package controlador;

public class Operadorternario {

	public static void main(String[] args) {
		
		System.out.println(" *** Operadro Tenario *** ");
		
		var edad = 17;
		var esMayor = edad >=18 ? "Es mayor" : "Es menor";
		var esAlto = (edad == 20) ? "Es alto" : 0;
		System.out.println(esMayor);
		
		if (edad>20) {
			
			System.out.println("Es Mayor");
			
		} else {
			
			System.out.println("Es menor"); 

		}
		
		var esPar = (edad%2==0) ? "Par" : "Impar"; 
		System.out.println("lA EDAD ES UN NUMERO: " + esPar);

	}

}
