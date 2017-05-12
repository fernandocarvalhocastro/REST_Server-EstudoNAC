package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "T_NAC_ALUNO")
@SequenceGenerator(allocationSize = 1, name = "seqNacAluno", sequenceName = "SQ_NAC_ALUNO")
public class Aluno {

	@Id
	@Column(name = "cd_aluno")
	@GeneratedValue(generator = "seqNacAluno", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_aluno")
	private String nome;

	@Column(name = "ds_nota")
	private double nota;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
