package model;

public class Usuario {
	//Atributo
	private String nome;
	private String matricula;
	private String curso;
	
	//Metodo Construtor
	public Usuario(String nome, String matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	//Metodo toString
	public String toString(){
		return "Nome do Us�ario: " + this.nome + "\n" + 
				"Matricula: " + this.matricula + "\n" + 
				"Curso: " + this.curso + "\n";
	}
	
	
	
	
	
	

}
