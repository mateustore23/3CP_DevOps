package br.com.fiap.cp1.exception;

public class EntityNotFoundException extends Exception {

	public EntityNotFoundException() {
		super("Entidade n�o encontrada!");
	}
	
	public EntityNotFoundException(String msg) {
		super(msg);
	}
}
