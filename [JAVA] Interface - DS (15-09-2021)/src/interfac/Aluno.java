package interfac;

public class Aluno implements Pessoa{
	
	private String nome;
	private String endereco;
	private String telefone;
	private String matricula;
	
	public Aluno(String nome,String endereco,String telefone,String matricula) {
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
		this.matricula=matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String setEndereco(String endereco) {
		return this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String setTelefone(String telefone) {
		return this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void apresentar() {
		System.out.println("Nome: " +this.getNome());
		System.out.println("Endere�o: " +this.getEndereco());
		System.out.println("Telefone: " +this.getTelefone());
		System.out.println("Matricula: " +this.getMatricula());
	}
}
