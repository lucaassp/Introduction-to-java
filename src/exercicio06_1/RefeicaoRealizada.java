package exercicio06_1;

public class RefeicaoRealizada {
	private String matriculaAluno;
	private String tipoRefeicao;

	public RefeicaoRealizada(String matriculaAluno, String tipoRefeicao) {
		this.matriculaAluno = matriculaAluno;
		this.tipoRefeicao = tipoRefeicao;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getTipoRefeicao() {
		return tipoRefeicao;
	}

	public void setTipoRefeicao(String tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}

	@Override
	public String toString() {
		return "RefeicaoRealizada pelo aluno de matr�cula " + this.matriculaAluno +

				", tipo da refei��o:"

				+ this.tipoRefeicao;

	}
}
