package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	//Atributo
	private String opcao;

	//Metodo para exibir a lista de opcoes
	public String getOpcao() {
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma op��o\n" +
				"1 - Cadastrar usu�rio\n" +
				"2 - Pesquisar usu�rio\n" +
				"3 - Listar empr�stimos\n" +
				"4 - Sair\n");
		
		return this.opcao;
	}
}
