package view;

import javax.swing.JOptionPane;

public class ViewCadastraUsuario {
	//Atributo
	private String nome;
	private String matricula;
	private String curso;
	
	//Metodo Construtor
	public ViewCadastraUsuario(){
		//Solicitar o nome
		this.nome = JOptionPane.showInputDialog("Digita o nome do usu�rio:");
		
		//Solicitar a matricula
		this.matricula = JOptionPane.showInputDialog("Digite a matricula do usu�rio:");
		
		//Solicitar o curso
		this.curso = JOptionPane.showInputDialog("Digite o curso do usu�rio:");
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}
	
	
	
	
}
