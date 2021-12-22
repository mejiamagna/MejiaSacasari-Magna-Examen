package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int codigo;
	private String nombre;
	private int IBSN;
	private int numPagina;
	
	public Libro(int codigo, String nombre, int iBSN, int numPagina) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		IBSN = iBSN;
		this.numPagina = numPagina;
	}
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIBSN() {
		return IBSN;
	}
	public void setIBSN(int iBSN) {
		IBSN = iBSN;
	}
	public int getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}
	
}
