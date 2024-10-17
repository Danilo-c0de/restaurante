package com.comer.almoco.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "cardapio")
@Table(name = "cardapio")

public class ComerModel {
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private UUID id_cad;
	
	private String proteina;
	private String carboidrato;
	private String fibra;
	private String gordura;
	private String bebida;
	private String sobremesa;
	
	public ComerModel() {
		super();
	}
	public UUID getId_cad() {
		return id_cad;
	}
	public void setId_cad(UUID id_cad) {
		this.id_cad = id_cad;
	}
	public String getProteina() {
		return proteina;
	}
	public void setProteina(String proteina) {
		this.proteina = proteina;
	}
	public String getCarboidrato() {
		return carboidrato;
	}
	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}
	public String getFibra() {
		return fibra;
	}
	public void setFibra(String fibra) {
		this.fibra = fibra;
	}
	public String getGordura() {
		return gordura;
	}
	public void setGordura(String gordura) {
		this.gordura = gordura;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getSobremesa() {
		return sobremesa;
	}
	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}
	
	
}
