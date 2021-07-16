import java.util.Scanner;

public class ControlDeflujo {

	public static void main(String[] args) {
		/*IF(condicion) si se cumple codigo*/
		
		/*Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = leerEdad.nextInt();
		String mensaje = votar(edad);
		
		System.out.println(mensaje);*/
		
		Scanner leerNombre = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		String nombre = leerNombre.nextLine();
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = leerEdad.nextInt();		
		String mensaje = curso(edad, nombre);
		System.out.println(mensaje);
	}
	/*Escribir un programa que pida el nombre y la edad de un participante
		 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
		 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
		 el programa de generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que diga
		 "No cumples lo requisitos para el bootcamp Java Full Stack"
*/
	/*public static String votar(int edad) {
		String mensaje = "";
		if(edad >= 18) {
			mensaje = "Felicidades, puedes votar";
		}else {
			mensaje = "No puedes votar";
		}
		return mensaje;
	}*/
	
	public static String curso(int edad,String nombre){
		String menAceptado = "";
		if(edad >= 18 && edad <=29) {
			menAceptado = "Felicidades " + nombre + " fuiste aceptado en"
					+ " el programa de Generation Java Full Stack";
		}else {
			menAceptado = "No fuiste aceptado " + nombre + " lo sentimos mucho"; 
		}
	
	return menAceptado;
}
}
