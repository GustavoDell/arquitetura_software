package br.usjt.previsaotempo.model;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import br.usjt.previsaotempo.model.DiasDaSemana;

@Entity
@Table
public class Previsao implements Serializable{
	public static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long Id;
	private double minima;
	private double maxima;
	private double relativa;
	private String descricao;
	private double data;
	private double hora;
	private double latitude;
	private double longitude;
	@OneToOne(optional = false)
	@JoinColumn(name = "tb_dia_da_semana")
	private DiasDaSemana diasDaSemana;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public DiasDaSemana getDiasDaSemana() {
		return diasDaSemana;
	}
	public void setDiasDaSemana(DiasDaSemana diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Previsao other = (Previsao) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Previsao [Id=" + Id + ", minima=" + minima + ", maxima=" + maxima + ", relativa=" + relativa
				+ ", descricao=" + descricao + ", data=" + data + ", hora=" + hora + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", diasDaSemana=" + diasDaSemana + "]";
	}
	
	
}
