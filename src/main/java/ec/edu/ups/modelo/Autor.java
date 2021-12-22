package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int codigo;
	private String nombre;
	private String nacionalidad;
	
	public Autor(int codigo, String nombre, String nacionalidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public Autor() {
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
