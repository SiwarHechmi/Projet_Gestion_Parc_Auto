package com.pfe.persistance;

// Generated 28 f�vr. 2016 18:08:45 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Typepersonnel generated by hbm2java
 */
public class Typepersonnel{

	private Integer numeroTypeP;
	private String nomTypeP;
	private Set<Personnel> personnels4 = new HashSet<Personnel>(0);

	public Typepersonnel() {
	}

	public Typepersonnel(String nomTypeP, Set<Personnel> personnels4) {
		this.nomTypeP = nomTypeP;
		this.personnels4 = personnels4;
	}

	public Integer getNumeroTypeP() {
		return this.numeroTypeP;
	}

	public void setNumeroTypeP(Integer numeroTypeP) {
		this.numeroTypeP = numeroTypeP;
	}

	public String getNomTypeP() {
		return this.nomTypeP;
	}

	public void setNomTypeP(String nomTypeP) {
		this.nomTypeP = nomTypeP;
	}

	public Set<Personnel> getPersonnels4() {
		return this.personnels4;
	}

	public void setPersonnels4(Set<Personnel> personnels4) {
		this.personnels4 = personnels4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomTypeP == null) ? 0 : nomTypeP.hashCode());
		result = prime * result
				+ ((numeroTypeP == null) ? 0 : numeroTypeP.hashCode());
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
		Typepersonnel other = (Typepersonnel) obj;
		if (nomTypeP == null) {
			if (other.nomTypeP != null)
				return false;
		} else if (!nomTypeP.equals(other.nomTypeP))
			return false;
		if (numeroTypeP == null) {
			if (other.numeroTypeP != null)
				return false;
		} else if (!numeroTypeP.equals(other.numeroTypeP))
			return false;
		return true;
	}

}