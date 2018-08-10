package br.com.projetomatrix.academico;

import java.math.BigDecimal;
import java.util.Date;

public class Avaliacao {
	
	private Aluno aluno;
	private Turma turma;
	private String codigo;
	private Date dataRealizacao;
	private String descricao;
	private ModoAvaliacao modoAvaliacao;
	private Professor responsavelAplicacao;
	private BigDecimal nota;
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Turma turma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo (String codigo) {
		this.codigo = codigo;
	}
	
	public Date getDataRealizacao() {
		return dataRealizacao;
	}
	
	public void setDataRealizacao (Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ModoAvaliacao getModoAvalicao() {
		return modoAvalicao;
	}

	public void setModoAvalicao(ModoAvaliacao modoAvalicao) {
		this.modoAvalicao = modoAvalicao;
	}

	public Professor getResponsavelAplicacao() {
		return responsavelAplicacao;
	}

	public void setResponsavelAplicacao(Professor responsavelAplicacao) {
		this.responsavelAplicacao = responsavelAplicacao;
	}

	public BigDecimal getNota() {
		return nota;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}

	public enum ModoAvaliacao {

		ONLINE, PRESENCIAL
	}

}


