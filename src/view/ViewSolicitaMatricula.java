package view;

import javax.swing.JOptionPane;

public class ViewSolicitaMatricula {
	
	//Atributos
	private String matricula;
	
	public ViewSolicitaMatricula(){
		this.matricula = JOptionPane.showInputDialog("Digite a Matricula:");
	}

	public String getMatricula() {
		return matricula;
	}
	
	
	
	
	

}
