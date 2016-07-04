package br.com.motors.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
 * @author Danilo Righetto - Fornax
 * @version 1.0
 * @since 1.0
 * 
 * the class AutomovelEntity
 * */
@Entity
public class AutomovelEntity implements Serializable{
	
	/** the serialVersionUID of class AutomovelEntity */
	private static final long serialVersionUID = -8625771813589538396L;

	/** attributes */
	
	@Id @GeneratedValue
	private Long id;
	
	private String marca;
	
	private String modelo;
	
	private Integer anoFabricacao;
	
	private Integer anoModelo;
	
	private String observacoes;
	
	/** Getters ans setters */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
}
