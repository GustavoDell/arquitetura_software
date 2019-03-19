package br.usjt.previsaotempo.model;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
public class Previsao implements Serializable{
	public static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long Id;
	private String semana;
	private double minima;
	private double maxima;
	private double relativa;
	private String descricao;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getSemana() {
		return semana;
	}
	public void setSemana(String semana) {
		this.semana = semana;
	}
	public double getMinima() {
		return minima;
	}
	public void setMinima(double minima) {
		this.minima = minima;
	}
	public double getMaxima() {
		return maxima;
	}
	public void setMaxima(double maxima) {
		this.maxima = maxima;
	}
	public double getRelativa() {
		return relativa;
	}
	public void setRelativa(double relativa) {
		this.relativa = relativa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
