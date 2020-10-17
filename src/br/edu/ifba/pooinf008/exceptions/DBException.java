package br.edu.ifba.pooinf008.exceptions;

public class DBException extends RuntimeException{
		
	private static final long serialVersionUID = 1L;
	
	public DBException(String msg) {
		super(msg);
	}
}
