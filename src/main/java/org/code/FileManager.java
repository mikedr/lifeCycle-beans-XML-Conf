package org.code;

public class FileManager {

	void inicializador() {
		System.out.println("Me ejecuto durante la inicialización del bean");
	}
	
	void destructor() {
		System.out.println("Me ejecuto durante la destrucción del bean");
	}
	
	String ejecucionDelBean( ) {
		return "Me estoy ejecutando";
	}
}
