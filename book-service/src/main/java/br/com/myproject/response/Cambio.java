package br.com.myproject.response;

import java.io.Serializable;

public class Cambio implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String from;
	private String to;
	private Double conversionFactor;
	private Double convertedValue;
	private String enviroment;

	public Cambio() {
	}

	public Cambio(long id, String from, String to, Double conversionFactor, Double convertedValue,
			String enviroment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
		this.enviroment = enviroment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public Double getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(Double convertedValue) {
		this.convertedValue = convertedValue;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conversionFactor == null) ? 0 : conversionFactor.hashCode());
		result = prime * result + ((convertedValue == null) ? 0 : convertedValue.hashCode());
		result = prime * result + ((enviroment == null) ? 0 : enviroment.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		Cambio other = (Cambio) obj;
		if (conversionFactor == null) {
			if (other.conversionFactor != null)
				return false;
		} else if (!conversionFactor.equals(other.conversionFactor))
			return false;
		if (convertedValue == null) {
			if (other.convertedValue != null)
				return false;
		} else if (!convertedValue.equals(other.convertedValue))
			return false;
		if (enviroment == null) {
			if (other.enviroment != null)
				return false;
		} else if (!enviroment.equals(other.enviroment))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (id != other.id)
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

}
