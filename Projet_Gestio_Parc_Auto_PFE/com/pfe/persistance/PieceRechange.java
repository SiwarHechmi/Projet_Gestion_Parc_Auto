package com.pfe.persistance;

// Generated 29 f�vr. 2016 10:37:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * PieceRechange generated by hbm2java
 */
public class PieceRechange implements java.io.Serializable {

	private Integer numeroPiece;
	private String nomPiece;
	private Float prixPiece;
	private Set<Reparation> reparations = new HashSet<Reparation>(0);

	public PieceRechange() {
	}

	public PieceRechange(String nomPiece, Float prixPiece,
			Set<Reparation> reparations) {
		this.nomPiece = nomPiece;
		this.prixPiece = prixPiece;
		this.reparations = reparations;
	}

	public Integer getNumeroPiece() {
		return this.numeroPiece;
	}

	public void setNumeroPiece(Integer numeroPiece) {
		this.numeroPiece = numeroPiece;
	}

	public String getNomPiece() {
		return this.nomPiece;
	}

	public void setNomPiece(String nomPiece) {
		this.nomPiece = nomPiece;
	}

	public Float getPrixPiece() {
		return this.prixPiece;
	}

	public void setPrixPiece(Float prixPiece) {
		this.prixPiece = prixPiece;
	}

	public Set<Reparation> getReparations() {
		return this.reparations;
	}

	public void setReparations(Set<Reparation> reparations) {
		this.reparations = reparations;
	}

}