package org.code;

public class FileManager {

	void inicializador() {
		System.out.println("Me ejecuto durante la inicializaci�n del bean");
	}
	
	void destructor() {
		System.out.println("Me ejecuto durante la destrucci�n del bean");
	}
	
	String ejecucionDelBean( ) {
		return "Me estoy ejecutando";
	}
}
