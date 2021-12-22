package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Capitulo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int codigo;
	private int numero;
	private String titulo;
	
	public Capitulo(int codigo, int numero, String titulo) {
		super();
		this.codigo = codigo;
		this.numero = numero;
		this.titulo = titulo;
	}
	
	public Capitulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
