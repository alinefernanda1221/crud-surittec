package br.com.clientes.exception;

public class NegocioException extends Exception{

	private static final long serialVersionUID = 4865774950469051952L;

	public NegocioException(String mensagem) {
		super(mensagem);
	}
}
