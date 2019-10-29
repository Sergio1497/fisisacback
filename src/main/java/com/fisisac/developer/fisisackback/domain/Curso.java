package com.fisisac.developer.fisisackback.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity(name = "curso")
public class Curso {
	@Id
	@Column(name = "id_curso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	@Column(name = "nom_curso")
	private String nombreCurso;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_programa")
	private Programa programa;
	@Column(name = "numciclo")
	private String numCiclo;
	@Column(name = "numcreditaje")
	private String numCreditaje;
	@Column(name = "tipocurso")
	private String tipoCurso;
	@Column(name = "planestudios")
	private String planEstudios;

	public Curso(){
	}

	public Curso(Long id, String nombreCurso, Programa programa, String numCiclo, String numCreditaje, String tipoCurso, String planEstudios){
		this.id = id;
		this.nombreCurso = nombreCurso;
		this.programa = programa;
		this.numCiclo = numCiclo;
		this.numCreditaje = numCreditaje;
		this.tipoCurso = tipoCurso;
		this.planEstudios = planEstudios;
	}

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getNombreCurso(){
		return this.nombreCurso;
	}

	public void setNombreCurso(String nombreCurso){
		this.nombreCurso = nombreCurso;
	}

	public Programa getIdPrograma(){
		return this.programa;
	}

	public void setIdPrograma(Programa programa){
		this.programa = programa;
	}

	public String getNumCiclo(){
		return this.numCiclo;
	}

	public void setNumCiclo(String numCiclo){
		this.numCiclo = numCiclo;
	}

	public String getNumCreditaje(){
		return this.numCreditaje;
	}

	public void setNumCreditaje(String numCreditaje){
		this.numCreditaje = numCreditaje;
	}

	public String getTipoCurso(){
		return this.tipoCurso;
	}

	public void setTipoCurso(String tipoCurso){
		this.tipoCurso = tipoCurso;
	}

	public String getPlanEstudios(){
		return this.planEstudios;
	}

	public void setPlanEstudios(String planEstudios){
		this.planEstudios = planEstudios;
	}
}