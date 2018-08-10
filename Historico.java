package br.com.projetomatrix.academico;

import java.util.List;

public class Historico {

	private List<Boletim> boletins;
	private Aluno aluno;

	public Historico(List<Boletim> boletins, Aluno aluno) {
		super();
		this.boletins = boletins;
		this.aluno = aluno;
	}

	public List<Boletim> getBoletins() {
		return boletins;
	}

	public void setBoletins(List<Boletim> boletins) {
		this.boletins = boletins;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
